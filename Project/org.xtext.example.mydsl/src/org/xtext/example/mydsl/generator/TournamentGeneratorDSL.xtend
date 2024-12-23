package org.xtext.example.mydsl.generator		

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.Scanner
import fta_domain_model.Tournament
import org.xtext.example.mydsl.MyDslStandaloneSetup

class TournamentGeneratorDSL {

    def static void main(String[] args) {
        // Initialize the DSL (registers the resource factory and other dependencies)
        MyDslStandaloneSetup.doSetup()

        // Register the fta_domain_model EPackage
        val ePackage = fta_domain_model.Fta_domain_modelPackage.eINSTANCE
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(ePackage.nsURI, ePackage)

        // Create a ResourceSet
        val resourceSet = new ResourceSetImpl

        // Map of tournament names to .mydsl file paths
        val tournamentMap = new java.util.HashMap<String, String>()
        tournamentMap.put("Round Robin", "src/instancesDSL/roundRobin.mydsl")
        tournamentMap.put("League", "src/instancesDSL//league.mydsl")
        tournamentMap.put("Knockout Single Elimination", "src/instancesDSL/knockoutSingleElim.mydsl")
        tournamentMap.put("Knockout Double Elimination", "src/instancesDSL/knockoutDoubleElim.mydsl")

        // Prompt the user to select a tournament
        println("Available Tournaments:")
        var index = 1
        for (entry : tournamentMap.entrySet()) {
            println(index + ". " + entry.key)
            index++
        }

        println("Enter the number corresponding to the tournament you want to load: ")
        val scanner = new Scanner(System.in)
        var choice = -1

        // Validate user input
        while (choice < 1 || choice > tournamentMap.size) {
            try {
                choice = Integer.parseInt(scanner.nextLine())
                if (choice < 1 || choice > tournamentMap.size) {
                    println("Invalid choice. Please select a valid tournament number.")
                }
            } catch (NumberFormatException e) {
                println("Invalid input. Please enter a number.")
            }
        }

        // Get the selected tournament
        val selectedTournament = tournamentMap.entrySet().toArray().get(choice - 1) as java.util.Map.Entry<String, String>
        val selectedFile = selectedTournament.value
        println("\nLoading tournament: " + selectedTournament.key + " from file: " + selectedFile)

        // Load the selected .mydsl file
        val dslResource = resourceSet.getResource(URI.createFileURI(selectedFile), true)
        try {
            dslResource.load(null)
        } catch (Exception e) {
            println("Error loading .mydsl file: " + e.message)
            e.printStackTrace()
            return
        }

        // Iterate through the model elements to find Tournament
        println("Iterating over DSL model contents...")
        dslResource.allContents.forEach [element |
            if (element instanceof Tournament) {
                val tournament = element as Tournament
                println("Tournament found: " + tournament.name)

                // Generate Xtend code based on the tournament type
                switch (tournament.tournamentType.toString) {
                    case "ROUND_ROBIN": {
                        val handler = new RoundRobinHandlerDSL()
                        handler.handleTournament(tournament)
                    }
                    case "LEAGUE": {
                        val handler = new LeagueHandlerDSL()
                        handler.handleTournament(tournament)
                    }
                    case "KNOCKOUT": {
                        val handler = new KnockoutHandlerDSL()
                        handler.handleTournament(tournament)
                    }
                    // Add other tournament types if necessary
                    default: {
                        println("Unknown tournament type: " + tournament.tournamentType)
                    }
                }
            }
        ]
    }

}
