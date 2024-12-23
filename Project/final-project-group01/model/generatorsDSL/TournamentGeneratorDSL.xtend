package generatorsDSL

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import generatorsDSL.RoundRobinHandlerDSL
import java.io.File
import generators.RoundRobinHandler
import fta_domain_model.Tournament

class TournamentGeneratorDSL {

    def static void main(String[] args) {
        // Initialize the DSL (registers the resource factory and other dependencies)

        // Create a ResourceSet
        val resourceSet = new ResourceSetImpl

        // List of .mydsl files
        val myDslFiles = #[ 
            "model/instancesDSL/roundRobin.mydsl"
            //"model/instancesDSL/league.mydsl"
            //"model/instancesDSL/knockout.mydsl"
        ]

        // Iterate through all .mydsl files
        for (myDslFile : myDslFiles) {
            println("\nLoading DSL model: " + myDslFile)
            val dslResource = resourceSet.getResource(URI.createFileURI(myDslFile), true)
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
                        // Add other tournament types if necessary
                        default: {
                            println("Unknown tournament type: " + tournament.tournamentType)
                        }
                    }
                }
            ]
        }
    }

   def static void saveXtendCode(String fileName, String xtendCode) {
    val outputFile = "generated/" + fileName + ".xtend"
    val file = new File(outputFile)
    file.parentFile.mkdirs // Ensure directories exist

    try {
        // Write the Xtend code to the file
        val writer = new java.io.FileWriter(file)
        writer.write(xtendCode)
        writer.close()
        println("Generated Xtend code saved to: " + outputFile)
    } catch (Exception e) {
        println("Error writing to file: " + e.message)
        e.printStackTrace()
    }
}

}
