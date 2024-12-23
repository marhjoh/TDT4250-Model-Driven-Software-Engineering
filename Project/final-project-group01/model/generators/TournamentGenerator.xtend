package generators

import fta_domain_model.Fta_domain_modelPackage
import fta_domain_model.Tournament
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import generators.KnockoutHandler
import generators.LeagueHandler

class TournamentGenerator {

    def static void main(String[] args) {
        // Register XMI Resource Factory to handle .xmi files
        Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl())

        // Register a Resource Factory to handle .ecore files
        Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl())

        // Create ResourceSet
        val resourceSet = new ResourceSetImpl()

        // Load and register Ecore model
        val ecoreResource = resourceSet.getResource(URI.createURI("model/fta_domain_model.ecore"), true)
        try {
            ecoreResource.load(null)
        } catch (Exception e) {
            println("Error loading ecore: " + e.message)
            e.printStackTrace()
            return
        }

        // Register package in EPackage.Registry
        if (!ecoreResource.contents.isEmpty && ecoreResource.contents.head instanceof EPackage) {
            val ePackage = ecoreResource.contents.head as EPackage
            println("Registering ePackage with nsURI: " + ePackage.nsURI)
            EPackage.Registry.INSTANCE.put(ePackage.nsURI, ePackage)
        } else {
            println("Error: Ecore resource contains no EPackage.")
            return
        }

        // Initialize Fta_domain_modelPackage to ensure it is loaded and ready for use
        Fta_domain_modelPackage.eINSTANCE.eClass()

        // List of .xmi files
        val xmiFiles = #[
            "model/instancesXMI/round_robin_tournament.xmi"
            //"model/instancesXMI/single_elimination_tournament.xmi"
            //"model/instancesXMI/league_tournament.xmi"
        ]

        // Iterate through all XMI models
        for (xmiFile : xmiFiles) {
            println("\nLaster inn XMI-modellen: " + xmiFile)
            val xmiResource = resourceSet.getResource(URI.createURI(xmiFile), true)
            try {
                xmiResource.load(null)
            } catch (Exception e) {
                println("Error loading xmi: " + e.message)
                e.printStackTrace()
                return
            }

            // Iterate through the model elements to find Tournament
            println("Starting to iterate over XMI model contents...")
            xmiResource.allContents.forEach [element |
                if (element instanceof Tournament) {
                    val tournament = element as Tournament
                    println("Tournament found: " + tournament.name)

                    // Kall riktig handler basert på turneringstype
                    switch (tournament.tournamentType.toString) {
                        case "ROUND_ROBIN": {
                            val handler = new RoundRobinHandler()
                            handler.handleTournament(tournament)
                        }
                        
                        /*
                        case "LEAGUE": {
                            val handler = new LeagueHandler()
                            handler.handleTournament(tournament)
                        }*/
                        
                        
                        /* 
                        case "KNOCKOUT": {
                            val handler = new KnockoutHandler()
                            handler.handleTournament(tournament)
                        }*/
                        default: {
                            println("Unknown tournament type: " + tournament.tournamentType)
                        }
                    }
                }
            ]
        }
    }
}
