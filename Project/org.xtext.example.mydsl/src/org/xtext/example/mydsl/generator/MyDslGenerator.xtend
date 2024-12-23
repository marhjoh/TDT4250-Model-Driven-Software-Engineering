package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fta_domain_model.Tournament
import java.util.List
import fta_domain_model.Bracket
import fta_domain_model.Team
import fta_domain_model.TournamentFormat
import fta_domain_model.RoundRobin
import fta_domain_model.Knockout
import fta_domain_model.League
import fta_domain_model.Goalkeeper
import fta_domain_model.Attacker
import fta_domain_model.Defender
import fta_domain_model.Player

/**
 * Generates code from your .mydsl files.
 */
class MyDslGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Iterate through all Tournaments in the resource
        resource.allContents.filter(Tournament).forEach [ tournament |
            val fileName = tournament.name.replace(" ", "") + ".xtend"
            fsa.generateFile(fileName, generateXtendCode(tournament))
        ]
    }

    // Generates the main Xtend class code for a Tournament
    def generateXtendCode(Tournament tournament) '''
        package generated

        class «tournament.name.replace(" ", "")» {

            def static void main(String[] args) {
                println("Welcome to the «tournament.name» tournament!")
                println("Tournament Type: «tournament.tournamentType»")
                println("Teams Participating:")
                «generateTeamsCode(tournament.teams)»
                println("Tournament Format Details:")
                «generateTournamentFormatCode(tournament.tournamentformat)»
                println("Bracket Details:")
                «generateBracketsCode(tournament.brackets)»
            }

            «generateTeamMethods(tournament.teams)»

            «generateBracketMethods(tournament.brackets)»
        }
    '''

    // Generates code to display teams
    def generateTeamsCode(List<Team> teams) '''
        «FOR team : teams»
        println("- Team Name: «team.name»")
        println("  Manager: «team.managerName»")
        println("  Players:")
        «FOR player : team.players»
        println("    - Name: «player.name», Position: «player.position», Number: «player.number»")
        «generatePlayerStatistics(player)»
        «ENDFOR»
        «ENDFOR»
    '''

    // Generates code for PlayerStatistics
    def generatePlayerStatistics(Player player) '''
        «IF player.playerstatistics instanceof Goalkeeper»
        println("      [Goalkeeper] Saves: «(player.playerstatistics as Goalkeeper).saves», Clean Sheets: «(player.playerstatistics as Goalkeeper).cleansheets»")
        «ENDIF»
        «IF player.playerstatistics instanceof Attacker»
        println("      [Attacker] Goals: «(player.playerstatistics as Attacker).goals», Sprint Speed: «(player.playerstatistics as Attacker).sprintSpeed»")
        «ENDIF»
        «IF player.playerstatistics instanceof Defender»
        println("      [Defender] Clean Sheets: «(player.playerstatistics as Defender).cleansheets», Assists: «(player.playerstatistics as Defender).assists»")
        «ENDIF»
    '''

    // Generates tournament format code
    def generateTournamentFormatCode(TournamentFormat format) '''
        «IF format instanceof RoundRobin»
        println("- Round Robin Format: «(format as RoundRobin).name»")
        println("  Points for Win: «(format as RoundRobin).pointsForWin»")
        println("  Tie Breaker Rule: «(format as RoundRobin).tieBreakerRule»")
        «ENDIF»
        «IF format instanceof Knockout»
        println("- Knockout Format: «(format as Knockout).name»")
        println("  Number of Rounds: «(format as Knockout).numberOfRounds»")
        «ENDIF»
        «IF format instanceof League»
        println("- League Format: «(format as League).name»")
        println("  Description: «(format as League).description»")
        «ENDIF»
    '''

    // Generates brackets code
    def generateBracketsCode(List<Bracket> brackets) '''
        «FOR bracket : brackets»
        println("Bracket with «bracket.rounds» rounds, Side: «bracket.bracketSide»")
        println("Matches:")
        «FOR match : bracket.matches»
        println("  Match on «match.day» between «match.teams.head.name» and «match.teams.tail.head.name»")
        println("  Result: Team 1 Score: «match.scoreTeam1», Team 2 Score: «match.scoreTeam2», Outcome: «match.matchResult»")
        «ENDFOR»
        «ENDFOR»
    '''

    // Generates methods for teams (if needed in the class)
    def generateTeamMethods(List<Team> teams) '''
        «FOR team : teams»
        def static void displayTeam«team.name.replace(" ", "")»() {
            println("Team Name: «team.name»")
            println("Manager: «team.managerName»")
            println("Players:")
            «FOR player : team.players»
            println("- «player.name» (Position: «player.position», Number: «player.number»)")
            «ENDFOR»
        }
        «ENDFOR»
    '''

    // Generates methods for brackets (if needed in the class)
    def generateBracketMethods(List<Bracket> brackets) '''
        «FOR bracket : brackets»
        def static void displayBracket«bracket.rounds»() {
            println("Bracket with «bracket.rounds» rounds:")
            «FOR match : bracket.matches»
            println("- Match between «match.teams.head.name» and «match.teams.tail.head.name»")
            println("  Score: «match.scoreTeam1» - «match.scoreTeam2», Result: «match.matchResult»")
            «ENDFOR»
        }
        «ENDFOR»
    '''
}
