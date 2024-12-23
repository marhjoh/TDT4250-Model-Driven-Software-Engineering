package org.xtext.example.mydsl.generator	

import fta_domain_model.Tournament;
import fta_domain_model.Team;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class KnockoutHandlerDSL {

    def void handleTournament(Tournament tournament) {
        println("Handling Knockout Tournament with Left and Right Side Brackets: " + tournament.name);
        
        // Initialize Left Side and Right Side brackets
        val leftSideBracket = new ArrayList<Team>();
        val rightSideBracket = new ArrayList<Team>();
        val teams = new ArrayList<Team>(tournament.teams);

        if (teams.size < 2) {
            println("Not enough teams to create a knockout tournament.");
            return;
        }

        // Split the teams between Left Side and Right Side brackets
        for (var i = 0; i < teams.size; i++) {
            if (i % 2 == 0) {
                leftSideBracket.add(teams.get(i));
            } else {
                rightSideBracket.add(teams.get(i));
            }
        }

        val scanner = new Scanner(System.in);
        var roundNumber = 1;

        // Play rounds for each side until only one team remains in each side
        while (leftSideBracket.size > 1 || rightSideBracket.size > 1) {
            // Show the full bracket before starting the round
            println("\n=== Current Brackets Before Round " + roundNumber + " ===");
            displayFullBracket(leftSideBracket, rightSideBracket, roundNumber);

            if (!leftSideBracket.isEmpty) {
                // Play matches in the left side bracket
                println("\nStarting Left Side Bracket Round " + roundNumber + "...");
                playBracketRound(scanner, leftSideBracket);
            }
            
            if (!rightSideBracket.isEmpty) {
                // Play matches in the right side bracket
                println("\nStarting Right Side Bracket Round " + roundNumber + "...");
                playBracketRound(scanner, rightSideBracket);
            }

            roundNumber++;
        }

        // Final Match between Left Side and Right Side winners
        if (leftSideBracket.size == 1 && rightSideBracket.size == 1) {
            val leftWinner = leftSideBracket.get(0);
            val rightWinner = rightSideBracket.get(0);

            println("\n=== Final Match ===");
            println("Left Side Winner: " + leftWinner.name + " vs Right Side Winner: " + rightWinner.name);

            var matchResult = 0;
            while (matchResult == 0) {
                println("Enter result for " + leftWinner.name + " vs " + rightWinner.name + " (format: team1-score:team2-score): ");
                var input = scanner.nextLine();

                // Sjekk gyldig input
                while (!isValidInput(input)) {
                    println("Invalid input format. Please try again. (format should be team1-score:team2-score)");
                    input = scanner.nextLine();
                }

                // Parse resultatet
                val splitResult = input.split(":");
                val scoreTeam1 = Integer.parseInt(splitResult.get(0).trim);
                val scoreTeam2 = Integer.parseInt(splitResult.get(1).trim);

                // Bestemme vinneren eller be om nytt resultat hvis det er uavgjort
                if (scoreTeam1 > scoreTeam2) {
                    matchResult = 1; // leftWinner wins
                } else if (scoreTeam2 > scoreTeam1) {
                    matchResult = 2; // rightWinner wins
                } else {
                    println("A draw is not allowed in the final match. Please play extra time or penalties.");
                }
            }

            // Annonsere vinneren basert på matchResult
            if (matchResult == 1) {
                println("\nWinner of the Knockout Tournament: " + leftWinner.name);
            } else if (matchResult == 2) {
                println("\nWinner of the Knockout Tournament: " + rightWinner.name);
            }
        } else {
            println("Something went wrong with determining the winner.");
        }
    }

    // Play a round in a given bracket
    def void playBracketRound(Scanner scanner, List<Team> currentBracket) {
        val nextRoundTeams = new ArrayList<Team>();

        // If odd number of teams, give a "bye" to one team
        if (currentBracket.size % 2 != 0) {
            val byeTeam = currentBracket.get(currentBracket.size - 1);
            println(byeTeam.name + " får en bye og går direkte til neste runde.");
            nextRoundTeams.add(byeTeam);
            currentBracket.remove(byeTeam);
        }

        // Play matches
        for (var i = 0; i < currentBracket.size; i += 2) {
            val team1 = currentBracket.get(i);
            val team2 = currentBracket.get(i + 1);

            // Remove 'final' to allow reassignment
            var matchResult = playMatch(scanner, team1, team2);

            // While it's a draw, replay the match (e.g., extra time or penalties)
            while (matchResult == 0) {
                println("A draw is not allowed in knockout matches. Please play extra time or penalties.");
                matchResult = playMatch(scanner, team1, team2);
            }

            // Determine the winner
            if (matchResult == 1) {
                println(team1.name + " wins and advances to the next round.");
                nextRoundTeams.add(team1);
            } else if (matchResult == 2) {
                println(team2.name + " wins and advances to the next round.");
                nextRoundTeams.add(team2);
            }
        }

        // Update the bracket for the next round
        currentBracket.clear();
        currentBracket.addAll(nextRoundTeams);
    }

    // Spille kamp og returnere resultat:
    // 1 for team1 vinner, 2 for team2 vinner, 0 for uavgjort
    def Integer playMatch(Scanner scanner, Team team1, Team team2) {
        println("Match between: " + team1.name + " and " + team2.name);
        println("Enter result for " + team1.name + " vs " + team2.name + " (format: team1-score:team2-score): ");
        var input = scanner.nextLine();

        // Sjekk gyldig input
        while (!isValidInput(input)) {
            println("Invalid input format. Please try again. (format should be team1-score:team2-score)");
            input = scanner.nextLine();
        }

        // Parsing av resultatet
        val splitResult = input.split(":");
        val scoreTeam1 = Integer.parseInt(splitResult.get(0).trim);
        val scoreTeam2 = Integer.parseInt(splitResult.get(1).trim);

        // Returner resultatet
        if (scoreTeam1 > scoreTeam2) {
            return 1; // team1 vinner
        } else if (scoreTeam2 > scoreTeam1) {
            return 2; // team2 vinner
        } else {
            return 0; // Uavgjort
        }
    }

    // Sjekk gyldig input-format for resultater
    def boolean isValidInput(String input) {
        try {
            val splitResult = input.split(":");
            if (splitResult.size != 2) {
                return false;
            }
            Integer.parseInt(splitResult.get(0).trim);
            Integer.parseInt(splitResult.get(1).trim);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Vis hele bracket før hver runde starter
    def void displayFullBracket(List<Team> leftSide, List<Team> rightSide, Integer roundNumber) {
        println("\n=== Bracket for Round " + roundNumber + " ===");
        
        println("\nLeft Side Bracket:");
        displayBracket(leftSide, roundNumber, "Left Side");
        
        println("\nRight Side Bracket:");
        displayBracket(rightSide, roundNumber, "Right Side");
    }

    // Vis bracket før hver runde starter
    def void displayBracket(List<Team> teams, Integer roundNumber, String bracketType) {
        for (var i = 0; i < teams.size - 1; i += 2) {
            val team1 = teams.get(i);
            val team2 = teams.get(i + 1);
            println("Matchup: " + team1.name + " vs " + team2.name);
        }
        if (teams.size % 2 != 0) {
            println("Bye for: " + teams.get(teams.size - 1).name);
        }
    }
}
