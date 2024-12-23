package generators

import fta_domain_model.Tournament
import fta_domain_model.Team
import java.util.HashMap
import java.util.Scanner
import java.util.List
import java.util.ArrayList
import java.util.Collections
import java.util.Map

class LeagueHandler {

    // En Map som kobler hvert lag til statistikken sin
    val Map<Team, TeamStatistics> teamStatsMap = new HashMap<Team, TeamStatistics>()

    def void handleTournament(Tournament tournament) {
        println("Handling League Tournament: " + tournament.name)
        
        // Fastsett poengsystem
        val pointsForWin = 3
        val pointsForDraw = 1
        val pointsForLoss = 0

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

        val scanner = new Scanner(System.in)

        // Spille to runder - hjemme og borte
        for (round : 1 .. 2) {
            val roundType = if (round == 1) "Home" else "Away"
            println("\nGenerating matches for " + roundType + " Round...")

            // Iterere gjennom alle mulige kamper
            for (i : 0 ..< teams.size) {
                for (j : i+1 ..< teams.size) {
                    val team1 = if (round == 1) teams.get(i) else teams.get(j)
                    val team2 = if (round == 1) teams.get(j) else teams.get(i)
                    println("Match between: " + team1.name + " and " + team2.name + " (Played at " + (round == 1 ? team1.name : team2.name) + "'s Home)")

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
                            
                            // Oppdatere statistikk med forhåndsdefinert poengsystem
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

        // Generere sluttresultater etter alle kampene
        generateTournamentResults()
    }

    // Oppdatere lagets statistikk med et fastsatt poengsystem
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
        println("Updating statistics for " + team.name + ": Goals scored = " + goalsScored + ", Goals conceded = " + goalsConceded)
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
