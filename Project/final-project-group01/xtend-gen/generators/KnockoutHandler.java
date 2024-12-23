package generators;

import fta_domain_model.Team;
import fta_domain_model.Tournament;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class KnockoutHandler {
  public void handleTournament(final Tournament tournament) {
    String _name = tournament.getName();
    String _plus = ("Handling Knockout Tournament with Left and Right Side Brackets: " + _name);
    InputOutput.<String>println(_plus);
    final ArrayList<Team> leftSideBracket = new ArrayList<Team>();
    final ArrayList<Team> rightSideBracket = new ArrayList<Team>();
    EList<Team> _teams = tournament.getTeams();
    final ArrayList<Team> teams = new ArrayList<Team>(_teams);
    int _size = teams.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      InputOutput.<String>println("Not enough teams to create a knockout tournament.");
      return;
    }
    for (int i = 0; (i < teams.size()); i++) {
      if (((i % 2) == 0)) {
        leftSideBracket.add(teams.get(i));
      } else {
        rightSideBracket.add(teams.get(i));
      }
    }
    final Scanner scanner = new Scanner(System.in);
    int roundNumber = 1;
    while (((leftSideBracket.size() > 1) || (rightSideBracket.size() > 1))) {
      {
        InputOutput.<String>println((("\n=== Current Brackets Before Round " + Integer.valueOf(roundNumber)) + " ==="));
        this.displayFullBracket(leftSideBracket, rightSideBracket, Integer.valueOf(roundNumber));
        boolean _isEmpty = leftSideBracket.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          InputOutput.<String>println((("\nStarting Left Side Bracket Round " + Integer.valueOf(roundNumber)) + "..."));
          this.playBracketRound(scanner, leftSideBracket);
        }
        boolean _isEmpty_1 = rightSideBracket.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          InputOutput.<String>println((("\nStarting Right Side Bracket Round " + Integer.valueOf(roundNumber)) + "..."));
          this.playBracketRound(scanner, rightSideBracket);
        }
        roundNumber++;
      }
    }
    if (((leftSideBracket.size() == 1) && (rightSideBracket.size() == 1))) {
      final Team leftWinner = leftSideBracket.get(0);
      final Team rightWinner = rightSideBracket.get(0);
      InputOutput.<String>println("\n=== Final Match ===");
      String _name_1 = leftWinner.getName();
      String _plus_1 = ("Left Side Winner: " + _name_1);
      String _plus_2 = (_plus_1 + " vs Right Side Winner: ");
      String _name_2 = rightWinner.getName();
      String _plus_3 = (_plus_2 + _name_2);
      InputOutput.<String>println(_plus_3);
      int matchResult = 0;
      while ((matchResult == 0)) {
        {
          String _name_3 = leftWinner.getName();
          String _plus_4 = ("Enter result for " + _name_3);
          String _plus_5 = (_plus_4 + " vs ");
          String _name_4 = rightWinner.getName();
          String _plus_6 = (_plus_5 + _name_4);
          String _plus_7 = (_plus_6 + " (format: team1-score:team2-score): ");
          InputOutput.<String>println(_plus_7);
          String input = scanner.nextLine();
          while ((!this.isValidInput(input))) {
            {
              InputOutput.<String>println("Invalid input format. Please try again. (format should be team1-score:team2-score)");
              input = scanner.nextLine();
            }
          }
          final String[] splitResult = input.split(":");
          final int scoreTeam1 = Integer.parseInt((splitResult[0]).trim());
          final int scoreTeam2 = Integer.parseInt((splitResult[1]).trim());
          if ((scoreTeam1 > scoreTeam2)) {
            matchResult = 1;
          } else {
            if ((scoreTeam2 > scoreTeam1)) {
              matchResult = 2;
            } else {
              InputOutput.<String>println("A draw is not allowed in the final match. Please play extra time or penalties.");
            }
          }
        }
      }
      if ((matchResult == 1)) {
        String _name_3 = leftWinner.getName();
        String _plus_4 = ("\nWinner of the Knockout Tournament: " + _name_3);
        InputOutput.<String>println(_plus_4);
      } else {
        if ((matchResult == 2)) {
          String _name_4 = rightWinner.getName();
          String _plus_5 = ("\nWinner of the Knockout Tournament: " + _name_4);
          InputOutput.<String>println(_plus_5);
        }
      }
    } else {
      InputOutput.<String>println("Something went wrong with determining the winner.");
    }
  }

  public void playBracketRound(final Scanner scanner, final List<Team> currentBracket) {
    final ArrayList<Team> nextRoundTeams = new ArrayList<Team>();
    int _size = currentBracket.size();
    int _modulo = (_size % 2);
    boolean _notEquals = (_modulo != 0);
    if (_notEquals) {
      int _size_1 = currentBracket.size();
      int _minus = (_size_1 - 1);
      final Team byeTeam = currentBracket.get(_minus);
      String _name = byeTeam.getName();
      String _plus = (_name + " får en bye og går direkte til neste runde.");
      InputOutput.<String>println(_plus);
      nextRoundTeams.add(byeTeam);
      currentBracket.remove(byeTeam);
    }
    {
      int i = 0;
      int _size_2 = currentBracket.size();
      boolean _lessThan = (i < _size_2);
      boolean _while = _lessThan;
      while (_while) {
        {
          final Team team1 = currentBracket.get(i);
          final Team team2 = currentBracket.get((i + 1));
          Integer matchResult = this.playMatch(scanner, team1, team2);
          while (((matchResult).intValue() == 0)) {
            {
              InputOutput.<String>println("A draw is not allowed in knockout matches. Please play extra time or penalties.");
              matchResult = this.playMatch(scanner, team1, team2);
            }
          }
          if (((matchResult).intValue() == 1)) {
            String _name_1 = team1.getName();
            String _plus_1 = (_name_1 + " wins and advances to the next round.");
            InputOutput.<String>println(_plus_1);
            nextRoundTeams.add(team1);
          } else {
            if (((matchResult).intValue() == 2)) {
              String _name_2 = team2.getName();
              String _plus_2 = (_name_2 + " wins and advances to the next round.");
              InputOutput.<String>println(_plus_2);
              nextRoundTeams.add(team2);
            }
          }
        }
        int _i = i;
        i = (_i + 2);
        int _size_3 = currentBracket.size();
        boolean _lessThan_1 = (i < _size_3);
        _while = _lessThan_1;
      }
    }
    currentBracket.clear();
    currentBracket.addAll(nextRoundTeams);
  }

  public Integer playMatch(final Scanner scanner, final Team team1, final Team team2) {
    String _name = team1.getName();
    String _plus = ("Match between: " + _name);
    String _plus_1 = (_plus + " and ");
    String _name_1 = team2.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    String _name_2 = team1.getName();
    String _plus_3 = ("Enter result for " + _name_2);
    String _plus_4 = (_plus_3 + " vs ");
    String _name_3 = team2.getName();
    String _plus_5 = (_plus_4 + _name_3);
    String _plus_6 = (_plus_5 + " (format: team1-score:team2-score): ");
    InputOutput.<String>println(_plus_6);
    String input = scanner.nextLine();
    while ((!this.isValidInput(input))) {
      {
        InputOutput.<String>println("Invalid input format. Please try again. (format should be team1-score:team2-score)");
        input = scanner.nextLine();
      }
    }
    final String[] splitResult = input.split(":");
    final int scoreTeam1 = Integer.parseInt((splitResult[0]).trim());
    final int scoreTeam2 = Integer.parseInt((splitResult[1]).trim());
    if ((scoreTeam1 > scoreTeam2)) {
      return Integer.valueOf(1);
    } else {
      if ((scoreTeam2 > scoreTeam1)) {
        return Integer.valueOf(2);
      } else {
        return Integer.valueOf(0);
      }
    }
  }

  public boolean isValidInput(final String input) {
    try {
      final String[] splitResult = input.split(":");
      int _size = ((List<String>)Conversions.doWrapArray(splitResult)).size();
      boolean _notEquals = (_size != 2);
      if (_notEquals) {
        return false;
      }
      Integer.parseInt((splitResult[0]).trim());
      Integer.parseInt((splitResult[1]).trim());
      return true;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return false;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public void displayFullBracket(final List<Team> leftSide, final List<Team> rightSide, final Integer roundNumber) {
    InputOutput.<String>println((("\n=== Bracket for Round " + roundNumber) + " ==="));
    InputOutput.<String>println("\nLeft Side Bracket:");
    this.displayBracket(leftSide, roundNumber, "Left Side");
    InputOutput.<String>println("\nRight Side Bracket:");
    this.displayBracket(rightSide, roundNumber, "Right Side");
  }

  public void displayBracket(final List<Team> teams, final Integer roundNumber, final String bracketType) {
    {
      int i = 0;
      int _size = teams.size();
      int _minus = (_size - 1);
      boolean _lessThan = (i < _minus);
      boolean _while = _lessThan;
      while (_while) {
        {
          final Team team1 = teams.get(i);
          final Team team2 = teams.get((i + 1));
          String _name = team1.getName();
          String _plus = ("Matchup: " + _name);
          String _plus_1 = (_plus + " vs ");
          String _name_1 = team2.getName();
          String _plus_2 = (_plus_1 + _name_1);
          InputOutput.<String>println(_plus_2);
        }
        int _i = i;
        i = (_i + 2);
        int _size_1 = teams.size();
        int _minus_1 = (_size_1 - 1);
        boolean _lessThan_1 = (i < _minus_1);
        _while = _lessThan_1;
      }
    }
    int _size = teams.size();
    int _modulo = (_size % 2);
    boolean _notEquals = (_modulo != 0);
    if (_notEquals) {
      int _size_1 = teams.size();
      int _minus = (_size_1 - 1);
      String _name = teams.get(_minus).getName();
      String _plus = ("Bye for: " + _name);
      InputOutput.<String>println(_plus);
    }
  }
}
