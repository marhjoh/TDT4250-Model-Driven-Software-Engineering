package instancesXtend

class PremierLeague2024 {

    def static void main(String[] args) {
        println("Welcome to the Premier League 2024 tournament!")
        println("Tournament Type: LEAGUE")
        println("Teams Participating:")
        println("- Team Name: Manchester City")
        println("  Manager: Pep Guardiola")
        println("  Players:")
        println("    - Name: Ederson Moraes, Position: GOALKEEPER, Number: 31")
        println("      [Goalkeeper] Saves: 50, Clean Sheets: 8")
        println("    - Name: Kevin De Bruyne, Position: MIDFIELDER, Number: 17")
        println("      [Attacker] Goals: 6, Sprint Speed: 81")
        println("    - Name: Erling Haaland, Position: ATTACKER, Number: 9")
        println("      [Attacker] Goals: 21, Sprint Speed: 89")
        println("- Team Name: Liverpool")
        println("  Manager: Jürgen Klopp")
        println("  Players:")
        println("    - Name: Alisson Becker, Position: GOALKEEPER, Number: 1")
        println("      [Goalkeeper] Saves: 45, Clean Sheets: 9")
        println("    - Name: Mohamed Salah, Position: ATTACKER, Number: 11")
        println("      [Attacker] Goals: 15, Sprint Speed: 85")
        println("    - Name: Virgil van Dijk, Position: DEFENDER, Number: 4")
        println("      [Defender] Clean Sheets: 10, Assists: 2")
        println("- Team Name: Chelsea")
        println("  Manager: Mauricio Pochettino")
        println("  Players:")
        println("    - Name: Kepa Arrizabalaga, Position: GOALKEEPER, Number: 1")
        println("      [Goalkeeper] Saves: 42, Clean Sheets: 6")
        println("    - Name: Raheem Sterling, Position: ATTACKER, Number: 17")
        println("      [Attacker] Goals: 8, Sprint Speed: 87")
        println("    - Name: Thiago Silva, Position: DEFENDER, Number: 6")
        println("      [Defender] Clean Sheets: 7, Assists: 1")
        println("- Team Name: Arsenal")
        println("  Manager: Mikel Arteta")
        println("  Players:")
        println("    - Name: Aaron Ramsdale, Position: GOALKEEPER, Number: 1")
        println("      [Goalkeeper] Saves: 48, Clean Sheets: 7")
        println("    - Name: Bukayo Saka, Position: ATTACKER, Number: 7")
        println("      [Attacker] Goals: 12, Sprint Speed: 83")
        println("    - Name: Gabriel Magalhães, Position: DEFENDER, Number: 6")
        println("      [Defender] Clean Sheets: 8, Assists: 1")
        println("- Team Name: Tottenham Hotspur")
        println("  Manager: Ange Postecoglou")
        println("  Players:")
        println("    - Name: Hugo Lloris, Position: GOALKEEPER, Number: 1")
        println("      [Goalkeeper] Saves: 50, Clean Sheets: 5")
        println("    - Name: Son Heung-min, Position: ATTACKER, Number: 7")
        println("      [Attacker] Goals: 9, Sprint Speed: 88")
        println("    - Name: Cristian Romero, Position: DEFENDER, Number: 6")
        println("      [Defender] Clean Sheets: 6, Assists: 1")
        println("Tournament Format Details:")
        println("- League Format: Premier League 2024")
        println("  Description: League format where each team plays every other team twice")
        println("Bracket Details:")
        println("Bracket with 2 rounds, Side: UPPER")
        println("Matches:")
        println("  Match on Sun Sep 15 00:00:00 CEST 2002 between Manchester City and Liverpool")
        println("  Result: Team 1 Score: 2, Team 2 Score: 1, Outcome: WIN")
        println("  Match on Wed Sep 18 00:00:00 CEST 2002 between Chelsea and Arsenal")
        println("  Result: Team 1 Score: 1, Team 2 Score: 2, Outcome: LOSS")
        println("  Match on Thu Sep 19 00:00:00 CEST 2002 between Tottenham Hotspur and Liverpool")
        println("  Result: Team 1 Score: 0, Team 2 Score: 3, Outcome: LOSS")
        println("  Match on Fri Sep 20 00:00:00 CEST 2002 between Manchester City and Chelsea")
        println("  Result: Team 1 Score: 2, Team 2 Score: 2, Outcome: DRAW")
        println("  Match on Mon Sep 23 00:00:00 CEST 2002 between Arsenal and Tottenham Hotspur")
        println("  Result: Team 1 Score: 3, Team 2 Score: 1, Outcome: WIN")
        println("  Match on Wed Sep 25 00:00:00 CEST 2002 between Manchester City and Arsenal")
        println("  Result: Team 1 Score: 1, Team 2 Score: 0, Outcome: WIN")
        println("  Match on Fri Sep 27 00:00:00 CEST 2002 between Chelsea and Tottenham Hotspur")
        println("  Result: Team 1 Score: 2, Team 2 Score: 3, Outcome: LOSS")
        println("  Match on Sun Sep 29 00:00:00 CEST 2002 between Liverpool and Arsenal")
        println("  Result: Team 1 Score: 0, Team 2 Score: 2, Outcome: LOSS")
        println("  Match on Mon Sep 30 00:00:00 CEST 2002 between Tottenham Hotspur and Manchester City")
        println("  Result: Team 1 Score: 1, Team 2 Score: 1, Outcome: DRAW")
        println("  Match on Tue Oct 01 00:00:00 CEST 2002 between Chelsea and Liverpool")
        println("  Result: Team 1 Score: 3, Team 2 Score: 2, Outcome: WIN")
    }

    def static void displayTeamManchesterCity() {
        println("Team Name: Manchester City")
        println("Manager: Pep Guardiola")
        println("Players:")
        println("- Ederson Moraes (Position: GOALKEEPER, Number: 31)")
        println("- Kevin De Bruyne (Position: MIDFIELDER, Number: 17)")
        println("- Erling Haaland (Position: ATTACKER, Number: 9)")
    }
    def static void displayTeamLiverpool() {
        println("Team Name: Liverpool")
        println("Manager: Jürgen Klopp")
        println("Players:")
        println("- Alisson Becker (Position: GOALKEEPER, Number: 1)")
        println("- Mohamed Salah (Position: ATTACKER, Number: 11)")
        println("- Virgil van Dijk (Position: DEFENDER, Number: 4)")
    }
    def static void displayTeamChelsea() {
        println("Team Name: Chelsea")
        println("Manager: Mauricio Pochettino")
        println("Players:")
        println("- Kepa Arrizabalaga (Position: GOALKEEPER, Number: 1)")
        println("- Raheem Sterling (Position: ATTACKER, Number: 17)")
        println("- Thiago Silva (Position: DEFENDER, Number: 6)")
    }
    def static void displayTeamArsenal() {
        println("Team Name: Arsenal")
        println("Manager: Mikel Arteta")
        println("Players:")
        println("- Aaron Ramsdale (Position: GOALKEEPER, Number: 1)")
        println("- Bukayo Saka (Position: ATTACKER, Number: 7)")
        println("- Gabriel Magalhães (Position: DEFENDER, Number: 6)")
    }
    def static void displayTeamTottenhamHotspur() {
        println("Team Name: Tottenham Hotspur")
        println("Manager: Ange Postecoglou")
        println("Players:")
        println("- Hugo Lloris (Position: GOALKEEPER, Number: 1)")
        println("- Son Heung-min (Position: ATTACKER, Number: 7)")
        println("- Cristian Romero (Position: DEFENDER, Number: 6)")
    }

    def static void displayBracket2() {
        println("Bracket with 2 rounds:")
        println("- Match between Manchester City and Liverpool")
        println("  Score: 2 - 1, Result: WIN")
        println("- Match between Chelsea and Arsenal")
        println("  Score: 1 - 2, Result: LOSS")
        println("- Match between Tottenham Hotspur and Liverpool")
        println("  Score: 0 - 3, Result: LOSS")
        println("- Match between Manchester City and Chelsea")
        println("  Score: 2 - 2, Result: DRAW")
        println("- Match between Arsenal and Tottenham Hotspur")
        println("  Score: 3 - 1, Result: WIN")
        println("- Match between Manchester City and Arsenal")
        println("  Score: 1 - 0, Result: WIN")
        println("- Match between Chelsea and Tottenham Hotspur")
        println("  Score: 2 - 3, Result: LOSS")
        println("- Match between Liverpool and Arsenal")
        println("  Score: 0 - 2, Result: LOSS")
        println("- Match between Tottenham Hotspur and Manchester City")
        println("  Score: 1 - 1, Result: DRAW")
        println("- Match between Chelsea and Liverpool")
        println("  Score: 3 - 2, Result: WIN")
    }
}