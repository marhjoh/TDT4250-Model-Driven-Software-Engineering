package instancesXtend;

import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class EuropeanChampionship2024 {
  public static void main(final String[] args) {
    InputOutput.<String>println("Welcome to the European Championship 2024 tournament!");
    InputOutput.<String>println("Tournament Type: ROUND_ROBIN");
    InputOutput.<String>println("Teams Participating:");
    InputOutput.<String>println("- Team Name: Germany");
    InputOutput.<String>println("  Manager: Hansi Flick");
    InputOutput.<String>println("  Players:");
    InputOutput.<String>println("    - Name: Manuel Neuer, Position: GOALKEEPER, Number: 1");
    InputOutput.<String>println("      [Goalkeeper] Saves: 30, Clean Sheets: 6");
    InputOutput.<String>println("    - Name: Thomas Müller, Position: ATTACKER, Number: 25");
    InputOutput.<String>println("      [Attacker] Goals: 5, Sprint Speed: 82");
    InputOutput.<String>println("    - Name: Joshua Kimmich, Position: MIDFIELDER, Number: 6");
    InputOutput.<String>println("      [Attacker] Goals: 2, Sprint Speed: 80");
    InputOutput.<String>println("- Team Name: Italy");
    InputOutput.<String>println("  Manager: Roberto Mancini");
    InputOutput.<String>println("  Players:");
    InputOutput.<String>println("    - Name: Gianluigi Donnarumma, Position: GOALKEEPER, Number: 21");
    InputOutput.<String>println("      [Goalkeeper] Saves: 34, Clean Sheets: 7");
    InputOutput.<String>println("    - Name: Lorenzo Insigne, Position: ATTACKER, Number: 24");
    InputOutput.<String>println("      [Attacker] Goals: 4, Sprint Speed: 87");
    InputOutput.<String>println("    - Name: Leonardo Bonucci, Position: DEFENDER, Number: 19");
    InputOutput.<String>println("      [Defender] Clean Sheets: 6, Assists: 1");
    InputOutput.<String>println("- Team Name: France");
    InputOutput.<String>println("  Manager: Didier Deschamps");
    InputOutput.<String>println("  Players:");
    InputOutput.<String>println("    - Name: Hugo Lloris, Position: GOALKEEPER, Number: 1");
    InputOutput.<String>println("      [Goalkeeper] Saves: 45, Clean Sheets: 8");
    InputOutput.<String>println("    - Name: Kylian Mbappé, Position: ATTACKER, Number: 10");
    InputOutput.<String>println("      [Attacker] Goals: 6, Sprint Speed: 91");
    InputOutput.<String>println("    - Name: Raphaël Varane, Position: DEFENDER, Number: 4");
    InputOutput.<String>println("      [Defender] Clean Sheets: 7, Assists: 1");
    InputOutput.<String>println("- Team Name: Spain");
    InputOutput.<String>println("  Manager: Luis Enrique");
    InputOutput.<String>println("  Players:");
    InputOutput.<String>println("    - Name: David De Gea, Position: GOALKEEPER, Number: 1");
    InputOutput.<String>println("      [Goalkeeper] Saves: 40, Clean Sheets: 6");
    InputOutput.<String>println("    - Name: Sergio Ramos, Position: DEFENDER, Number: 15");
    InputOutput.<String>println("      [Defender] Clean Sheets: 5, Assists: 2");
    InputOutput.<String>println("    - Name: Gerard Moreno, Position: ATTACKER, Number: 7");
    InputOutput.<String>println("      [Attacker] Goals: 4, Sprint Speed: 80");
    InputOutput.<String>println("Tournament Format Details:");
    InputOutput.<String>println("- Round Robin Format: Euro Cup 2024");
    InputOutput.<String>println("  Points for Win: 3");
    InputOutput.<String>println("  Tie Breaker Rule: GOAL_DIFFERENCE");
    InputOutput.<String>println("Bracket Details:");
    InputOutput.<String>println("Bracket with 1 rounds, Side: UPPER");
    InputOutput.<String>println("Matches:");
    InputOutput.<String>println("  Match on Sat Apr 05 00:00:00 CEST 1997 between Germany and Italy");
    InputOutput.<String>println("  Result: Team 1 Score: 2, Team 2 Score: 1, Outcome: WIN");
    InputOutput.<String>println("  Match on Tue Apr 08 00:00:00 CEST 1997 between France and Spain");
    InputOutput.<String>println("  Result: Team 1 Score: 3, Team 2 Score: 1, Outcome: WIN");
    InputOutput.<String>println("  Match on Thu Apr 10 00:00:00 CEST 1997 between Italy and France");
    InputOutput.<String>println("  Result: Team 1 Score: 1, Team 2 Score: 2, Outcome: LOSS");
    InputOutput.<String>println("  Match on Sat Apr 12 00:00:00 CEST 1997 between Germany and Spain");
    InputOutput.<String>println("  Result: Team 1 Score: 0, Team 2 Score: 3, Outcome: LOSS");
    InputOutput.<String>println("  Match on Wed Apr 16 00:00:00 CEST 1997 between Germany and France");
    InputOutput.<String>println("  Result: Team 1 Score: 1, Team 2 Score: 1, Outcome: DRAW");
    InputOutput.<String>println("  Match on Sat Apr 19 00:00:00 CEST 1997 between Spain and Italy");
    InputOutput.<String>println("  Result: Team 1 Score: 2, Team 2 Score: 0, Outcome: WIN");
  }

  public static void displayTeamGermany() {
    InputOutput.<String>println("Team Name: Germany");
    InputOutput.<String>println("Manager: Hansi Flick");
    InputOutput.<String>println("Players:");
    InputOutput.<String>println("- Manuel Neuer (Position: GOALKEEPER, Number: 1)");
    InputOutput.<String>println("- Thomas Müller (Position: ATTACKER, Number: 25)");
    InputOutput.<String>println("- Joshua Kimmich (Position: MIDFIELDER, Number: 6)");
  }

  public static void displayTeamItaly() {
    InputOutput.<String>println("Team Name: Italy");
    InputOutput.<String>println("Manager: Roberto Mancini");
    InputOutput.<String>println("Players:");
    InputOutput.<String>println("- Gianluigi Donnarumma (Position: GOALKEEPER, Number: 21)");
    InputOutput.<String>println("- Lorenzo Insigne (Position: ATTACKER, Number: 24)");
    InputOutput.<String>println("- Leonardo Bonucci (Position: DEFENDER, Number: 19)");
  }

  public static void displayTeamFrance() {
    InputOutput.<String>println("Team Name: France");
    InputOutput.<String>println("Manager: Didier Deschamps");
    InputOutput.<String>println("Players:");
    InputOutput.<String>println("- Hugo Lloris (Position: GOALKEEPER, Number: 1)");
    InputOutput.<String>println("- Kylian Mbappé (Position: ATTACKER, Number: 10)");
    InputOutput.<String>println("- Raphaël Varane (Position: DEFENDER, Number: 4)");
  }

  public static void displayTeamSpain() {
    InputOutput.<String>println("Team Name: Spain");
    InputOutput.<String>println("Manager: Luis Enrique");
    InputOutput.<String>println("Players:");
    InputOutput.<String>println("- David De Gea (Position: GOALKEEPER, Number: 1)");
    InputOutput.<String>println("- Sergio Ramos (Position: DEFENDER, Number: 15)");
    InputOutput.<String>println("- Gerard Moreno (Position: ATTACKER, Number: 7)");
  }

  public static void displayBracket1() {
    InputOutput.<String>println("Bracket with 1 rounds:");
    InputOutput.<String>println("- Match between Germany and Italy");
    InputOutput.<String>println("  Score: 2 - 1, Result: WIN");
    InputOutput.<String>println("- Match between France and Spain");
    InputOutput.<String>println("  Score: 3 - 1, Result: WIN");
    InputOutput.<String>println("- Match between Italy and France");
    InputOutput.<String>println("  Score: 1 - 2, Result: LOSS");
    InputOutput.<String>println("- Match between Germany and Spain");
    InputOutput.<String>println("  Score: 0 - 3, Result: LOSS");
    InputOutput.<String>println("- Match between Germany and France");
    InputOutput.<String>println("  Score: 1 - 1, Result: DRAW");
    InputOutput.<String>println("- Match between Spain and Italy");
    InputOutput.<String>println("  Score: 2 - 0, Result: WIN");
  }
}
