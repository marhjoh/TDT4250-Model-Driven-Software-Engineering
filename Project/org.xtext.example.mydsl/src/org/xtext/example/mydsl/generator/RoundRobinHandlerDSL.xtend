package org.xtext.example.mydsl.generator		

import fta_domain_model.Tournament
import fta_domain_model.Team
import fta_domain_model.Match
import java.util.HashMap
import java.util.Scanner
import java.util.List
import java.util.ArrayList
import java.util.Collections
import java.util.Map
import fta_domain_model.RoundRobin
import java.io.FileWriter
import java.io.File

class RoundRobinHandlerDSL {

    // En Map som kobler hvert lag til statistikken sin
    val Map<Team, TeamStatistics> teamStatsMap = new HashMap<Team, TeamStatistics>()

    def void handleTournament(Tournament tournament) {
        println("Handling Round Robin Tournament: " + tournament.name)
        
        val scanner = new Scanner(System.in)
        
        val tournamentFormat = tournament.getTournamentformat();

		// Variabler for poengsystemet
		var int numberOfRounds  = 1
        var int pointsForWin = 0
        var int pointsForDraw = 0
        var int pointsForLoss = 0
        
		// Check if the format is of type RoundRobin
		if (tournamentFormat instanceof RoundRobin) {
		    val roundRobinFormat = tournamentFormat as RoundRobin
		    numberOfRounds = roundRobinFormat.getNumberOfRounds();
		    pointsForWin = roundRobinFormat.getPointsForWin();
		    pointsForDraw = roundRobinFormat.getPointsForDraw();
		    pointsForLoss = roundRobinFormat.getPointsForLoss();
		
		    //println("Points System - Win: " + pointsForWin + ", Draw: " + pointsForDraw + ", Loss: " + pointsForLoss);
		} else {
		    //println("Tournament format is not Round Robin.");
		}

        println("Number of rounds to be played: " + numberOfRounds)
        println("Points System - Win: " + pointsForWin + ", Draw: " + pointsForDraw + ", Loss: " + pointsForLoss)
        
        
        // Generere kamper for alle lag
        val teams = tournament.teams
        if (teams.size < 2) {
            println("Not enough teams to create matches.")
            return
        }

        // Initialiser statistikk for alle lag
        teams.forEach [team |
            teamStatsMap.put(team, new TeamStatistics(team.name))
        ]

        // Gå gjennom eksisterende kamper fra .xmi hvis de finnes
        val matches = new ArrayList<Match>() // Opprett en liste for å samle alle kampene fra brackets

        // Iterer gjennom hver bracket for å hente kampene
        for (bracket : tournament.brackets) {
            matches.addAll(bracket.matches) // Legg til kampene fra hver bracket i listen
        }

        for (match : matches) {
            val team1 = match.teams.get(0)
            val team2 = match.teams.get(1)

            if (match.scoreTeam1 != 0 && match.scoreTeam2 != 0) {
                // Hvis score allerede er satt, legg til dette i statistikken
                println("Match between " + team1.name + " and " + team2.name + " has a preset result: " + match.scoreTeam1 + " - " + match.scoreTeam2)
                updateTeamStatistics(team1, match.scoreTeam1, match.scoreTeam2, pointsForWin, pointsForDraw, pointsForLoss)
                updateTeamStatistics(team2, match.scoreTeam2, match.scoreTeam1, pointsForWin, pointsForDraw, pointsForLoss)
            }
        }

        // Gjennomfør alle rundene for kamper som ikke er i XMI-filen
        for (round : 1 .. numberOfRounds) {
            println("\nGenerating matches for Round " + round + "...")

            // Iterere gjennom alle mulige kamper i denne runden
            for (i : 0 ..< teams.size) {
                for (j : i + 1 ..< teams.size) {
                    val team1 = teams.get(i)
                    val team2 = teams.get(j)

                    // Sjekk om matchen allerede er i brackets
                    if (!isMatchAlreadyPlayed(team1, team2, matches)) {
                        println("Match between: " + team1.name + " and " + team2.name)

                        // Vise spillere for hvert lag
                        showPlayersForTeam(team1)
                        showPlayersForTeam(team2)

                        // Be brukeren om resultatet til de skriver et gyldig format
                        var validInput = false
                        while (!validInput) {
                            try {
                                // Spør bruker om resultat
                                println("Enter result for " + team1.name + " vs " + team2.name + " (format: team1-score:team2-score): ")
                                val input = scanner.nextLine()
                                
                                // Parsing av input, for eksempel "2:1"
                                val splitResult = input.split(":")
                                if (splitResult.size != 2) {
                                    throw new IllegalArgumentException("Invalid format.")
                                }

                                val scoreTeam1 = Integer.parseInt(splitResult.get(0).trim)
                                val scoreTeam2 = Integer.parseInt(splitResult.get(1).trim)
                                
                                // Log resultat
                                println("Result: " + team1.name + " " + scoreTeam1 + " - " + scoreTeam2 + " " + team2.name)
                                
                                // Oppdatere statistikk med brukerdefinert poengsystem
                                updateTeamStatistics(team1, scoreTeam1, scoreTeam2, pointsForWin, pointsForDraw, pointsForLoss)
                                updateTeamStatistics(team2, scoreTeam2, scoreTeam1, pointsForWin, pointsForDraw, pointsForLoss)

                                // Sette `validInput` til `true` for å bryte ut av loopen
                                validInput = true

                            } catch (Exception e) {
                                println("Invalid input format. Please try again. (format should be team1-score:team2-score)")
                            }
                        }
                    }
                }
            }
        }
        
       

        // Generere sluttresultater etter alle kampene
        generateTournamentResults()
        
         // Generate Xtend code after processing the tournament
        //val xtendCode = generateXtendCode(tournament)

        // Save the generated Xtend code to a file
        //saveXtendCode(tournament.name, xtendCode)
    }

    // Funksjon for å vise spillerne på et lag
    def void showPlayersForTeam(Team team) {
        println("\nPlayers for " + team.name + ":")
        for (player : team.players) {
            println("Player: " + player.name + ", Position: " + player.position + ", Number: " + player.number)
            if (player.playerstatistics != null) {
                println("Statistics: " + player.playerstatistics.toString())
            }
        }
    }

    // Sjekk om en kamp allerede er spilt
    
def boolean isMatchAlreadyPlayed(Team team1, Team team2, List<Match> matches) {
    for (match : matches) {
        if (match.teams.contains(team1) && match.teams.contains(team2) 
            && (match.scoreTeam1 != 0 && match.scoreTeam2 != 0)) {
            return true
        }
    }
    return false
}

def String generateXtendCode(Tournament tournament) {
        '''
        package generated

        class «tournament.name» {

            def void startTournament() {
                println("Welcome to the «tournament.name» tournament!")

                // Teams and their statistics
                «FOR teamStats : teamStatsMap.entrySet»
                println("Team: «teamStats.key.name» - Points: «teamStats.value.points» | Wins: «teamStats.value.wins» | Draws: «teamStats.value.draws» | Losses: «teamStats.value.losses»")
                «ENDFOR»
            }
        }
        '''
    }

 // Method to save Xtend code to a file
    def void saveXtendCode(String fileName, String xtendCode) {
        val outputFile = "generated/" + fileName + ".xtend"
        val file = new File(outputFile)
        file.parentFile.mkdirs // Ensure directories exist

        try {
            val writer = new FileWriter(file)
            writer.write(xtendCode)
            writer.close()
            println("Generated Xtend code saved to: " + outputFile)
        } catch (Exception e) {
            println("Error writing to file: " + e.message)
            e.printStackTrace()
        }
    }


    // Oppdatere lagets statistikk med et tilpasset poengsystem
    def void updateTeamStatistics(Team team, int goalsScored, int goalsConceded, int pointsForWin, int pointsForDraw, int pointsForLoss) {
        val stats = teamStatsMap.get(team)
        stats.goalsScored += goalsScored
        stats.goalsConceded += goalsConceded
        
        if (goalsScored > goalsConceded) {
            stats.wins += 1
            stats.points += pointsForWin
        } else if (goalsScored == goalsConceded) {
            stats.draws += 1
            stats.points += pointsForDraw
        } else {
            stats.losses += 1
            stats.points += pointsForLoss
        }

        // Log oppdatert statistikk
        //println("Updating statistics for " + team.name + ": Goals scored = " + goalsScored + ", Goals conceded = " + goalsConceded)
    }

    // Generer sluttresultater
    def void generateTournamentResults() {
        println("\nFinal Standings:")

        // Sorter lag etter poeng i synkende rekkefølge ved bruk av Collections.sort
        val sortedTeams = new ArrayList<TeamStatistics>(teamStatsMap.values)
        Collections.sort(sortedTeams, [ TeamStatistics t1, TeamStatistics t2 |
            Integer.compare(t2.points, t1.points)
        ])

        // Vis tabellen med statistikk for alle lag
        sortedTeams.forEach [stats |
            println("Team: " + stats.teamName + " - Points: " + stats.points + " | Wins: " + stats.wins + " | Draws: " + stats.draws + " | Losses: " + stats.losses + " | Goals Scored: " + stats.goalsScored + " | Goals Conceded: " + stats.goalsConceded)
        ]
    }

    // Hjelpeklasse for å holde statistikk for hvert lag
    static class TeamStatistics {
        val String teamName
        var int wins = 0
        var int draws = 0
        var int losses = 0
        var int goalsScored = 0
        var int goalsConceded = 0
        var int points = 0

        new(String teamName) {
            this.teamName = teamName
        }
    }
}
