package generators;

import fta_domain_model.Team;
import fta_domain_model.Tournament;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class LeagueHandler {
  public static class TeamStatistics {
    private final String teamName;

    private int wins = 0;

    private int draws = 0;

    private int losses = 0;

    private int goalsScored = 0;

    private int goalsConceded = 0;

    private int points = 0;

    public TeamStatistics(final String teamName) {
      this.teamName = teamName;
    }
  }

  private final Map<Team, LeagueHandler.TeamStatistics> teamStatsMap = new HashMap<Team, LeagueHandler.TeamStatistics>();

  public void handleTournament(final Tournament tournament) {
    String _name = tournament.getName();
    String _plus = ("Handling League Tournament: " + _name);
    InputOutput.<String>println(_plus);
    final int pointsForWin = 3;
    final int pointsForDraw = 1;
    final int pointsForLoss = 0;
    final EList<Team> teams = tournament.getTeams();
    int _size = teams.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      InputOutput.<String>println("Not enough teams to create matches.");
      return;
    }
    final Consumer<Team> _function = (Team team) -> {
      String _name_1 = team.getName();
      LeagueHandler.TeamStatistics _teamStatistics = new LeagueHandler.TeamStatistics(_name_1);
      this.teamStatsMap.put(team, _teamStatistics);
    };
    teams.forEach(_function);
    final Scanner scanner = new Scanner(System.in);
    IntegerRange _upTo = new IntegerRange(1, 2);
    for (final Integer round : _upTo) {
      {
        String _xifexpression = null;
        if (((round).intValue() == 1)) {
          _xifexpression = "Home";
        } else {
          _xifexpression = "Away";
        }
        final String roundType = _xifexpression;
        InputOutput.<String>println((("\nGenerating matches for " + roundType) + " Round..."));
        int _size_1 = teams.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
        for (final Integer i : _doubleDotLessThan) {
          int _size_2 = teams.size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_2, true);
          for (final Integer j : _doubleDotLessThan_1) {
            {
              Team _xifexpression_1 = null;
              if (((round).intValue() == 1)) {
                _xifexpression_1 = teams.get((i).intValue());
              } else {
                _xifexpression_1 = teams.get((j).intValue());
              }
              final Team team1 = _xifexpression_1;
              Team _xifexpression_2 = null;
              if (((round).intValue() == 1)) {
                _xifexpression_2 = teams.get((j).intValue());
              } else {
                _xifexpression_2 = teams.get((i).intValue());
              }
              final Team team2 = _xifexpression_2;
              String _name_1 = team1.getName();
              String _plus_1 = ("Match between: " + _name_1);
              String _plus_2 = (_plus_1 + " and ");
              String _name_2 = team2.getName();
              String _plus_3 = (_plus_2 + _name_2);
              String _plus_4 = (_plus_3 + " (Played at ");
              String _xifexpression_3 = null;
              if (((round).intValue() == 1)) {
                _xifexpression_3 = team1.getName();
              } else {
                _xifexpression_3 = team2.getName();
              }
              String _plus_5 = (_plus_4 + _xifexpression_3);
              String _plus_6 = (_plus_5 + "\'s Home)");
              InputOutput.<String>println(_plus_6);
              boolean validInput = false;
              while ((!validInput)) {
                try {
                  String _name_3 = team1.getName();
                  String _plus_7 = ("Enter result for " + _name_3);
                  String _plus_8 = (_plus_7 + " vs ");
                  String _name_4 = team2.getName();
                  String _plus_9 = (_plus_8 + _name_4);
                  String _plus_10 = (_plus_9 + " (format: team1-score:team2-score): ");
                  InputOutput.<String>println(_plus_10);
                  final String input = scanner.nextLine();
                  final String[] splitResult = input.split(":");
                  int _size_3 = ((List<String>)Conversions.doWrapArray(splitResult)).size();
                  boolean _notEquals = (_size_3 != 2);
                  if (_notEquals) {
                    throw new IllegalArgumentException("Invalid format.");
                  }
                  final int scoreTeam1 = Integer.parseInt((splitResult[0]).trim());
                  final int scoreTeam2 = Integer.parseInt((splitResult[1]).trim());
                  String _name_5 = team1.getName();
                  String _plus_11 = ("Result: " + _name_5);
                  String _plus_12 = (_plus_11 + " ");
                  String _plus_13 = (_plus_12 + Integer.valueOf(scoreTeam1));
                  String _plus_14 = (_plus_13 + " - ");
                  String _plus_15 = (_plus_14 + Integer.valueOf(scoreTeam2));
                  String _plus_16 = (_plus_15 + " ");
                  String _name_6 = team2.getName();
                  String _plus_17 = (_plus_16 + _name_6);
                  InputOutput.<String>println(_plus_17);
                  this.updateTeamStatistics(team1, scoreTeam1, scoreTeam2, pointsForWin, pointsForDraw, pointsForLoss);
                  this.updateTeamStatistics(team2, scoreTeam2, scoreTeam1, pointsForWin, pointsForDraw, pointsForLoss);
                  validInput = true;
                } catch (final Throwable _t) {
                  if (_t instanceof Exception) {
                    InputOutput.<String>println("Invalid input format. Please try again. (format should be team1-score:team2-score)");
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
              }
            }
          }
        }
      }
    }
    this.generateTournamentResults();
  }

  public void updateTeamStatistics(final Team team, final int goalsScored, final int goalsConceded, final int pointsForWin, final int pointsForDraw, final int pointsForLoss) {
    final LeagueHandler.TeamStatistics stats = this.teamStatsMap.get(team);
    int _goalsScored = stats.goalsScored;
    stats.goalsScored = (_goalsScored + goalsScored);
    int _goalsConceded = stats.goalsConceded;
    stats.goalsConceded = (_goalsConceded + goalsConceded);
    if ((goalsScored > goalsConceded)) {
      int _wins = stats.wins;
      stats.wins = (_wins + 1);
      int _points = stats.points;
      stats.points = (_points + pointsForWin);
    } else {
      if ((goalsScored == goalsConceded)) {
        int _draws = stats.draws;
        stats.draws = (_draws + 1);
        int _points_1 = stats.points;
        stats.points = (_points_1 + pointsForDraw);
      } else {
        int _losses = stats.losses;
        stats.losses = (_losses + 1);
        int _points_2 = stats.points;
        stats.points = (_points_2 + pointsForLoss);
      }
    }
    String _name = team.getName();
    String _plus = ("Updating statistics for " + _name);
    String _plus_1 = (_plus + ": Goals scored = ");
    String _plus_2 = (_plus_1 + Integer.valueOf(goalsScored));
    String _plus_3 = (_plus_2 + ", Goals conceded = ");
    String _plus_4 = (_plus_3 + Integer.valueOf(goalsConceded));
    InputOutput.<String>println(_plus_4);
  }

  public void generateTournamentResults() {
    InputOutput.<String>println("\nFinal Standings:");
    Collection<LeagueHandler.TeamStatistics> _values = this.teamStatsMap.values();
    final ArrayList<LeagueHandler.TeamStatistics> sortedTeams = new ArrayList<LeagueHandler.TeamStatistics>(_values);
    final Comparator<LeagueHandler.TeamStatistics> _function = (LeagueHandler.TeamStatistics t1, LeagueHandler.TeamStatistics t2) -> {
      return Integer.compare(t2.points, t1.points);
    };
    Collections.<LeagueHandler.TeamStatistics>sort(sortedTeams, _function);
    final Consumer<LeagueHandler.TeamStatistics> _function_1 = (LeagueHandler.TeamStatistics stats) -> {
      InputOutput.<String>println(((((((((((((("Team: " + stats.teamName) + " - Points: ") + Integer.valueOf(stats.points)) + " | Wins: ") + Integer.valueOf(stats.wins)) + " | Draws: ") + Integer.valueOf(stats.draws)) + " | Losses: ") + Integer.valueOf(stats.losses)) + " | Goals Scored: ") + Integer.valueOf(stats.goalsScored)) + " | Goals Conceded: ") + Integer.valueOf(stats.goalsConceded)));
    };
    sortedTeams.forEach(_function_1);
  }
}
