package org.xtext.example.mydsl.generator;

import fta_domain_model.Bracket;
import fta_domain_model.Match;
import fta_domain_model.Player;
import fta_domain_model.PlayerPosition;
import fta_domain_model.PlayerStatistics;
import fta_domain_model.RoundRobin;
import fta_domain_model.Team;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentFormat;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class RoundRobinHandlerDSL {
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

  private final Map<Team, RoundRobinHandlerDSL.TeamStatistics> teamStatsMap = new HashMap<Team, RoundRobinHandlerDSL.TeamStatistics>();

  public void handleTournament(final Tournament tournament) {
    String _name = tournament.getName();
    String _plus = ("Handling Round Robin Tournament: " + _name);
    InputOutput.<String>println(_plus);
    final Scanner scanner = new Scanner(System.in);
    final TournamentFormat tournamentFormat = tournament.getTournamentformat();
    int numberOfRounds = 1;
    int pointsForWin = 0;
    int pointsForDraw = 0;
    int pointsForLoss = 0;
    if ((tournamentFormat instanceof RoundRobin)) {
      final RoundRobin roundRobinFormat = ((RoundRobin) tournamentFormat);
      numberOfRounds = roundRobinFormat.getNumberOfRounds();
      pointsForWin = roundRobinFormat.getPointsForWin();
      pointsForDraw = roundRobinFormat.getPointsForDraw();
      pointsForLoss = roundRobinFormat.getPointsForLoss();
    } else {
    }
    InputOutput.<String>println(("Number of rounds to be played: " + Integer.valueOf(numberOfRounds)));
    InputOutput.<String>println(((((("Points System - Win: " + Integer.valueOf(pointsForWin)) + ", Draw: ") + Integer.valueOf(pointsForDraw)) + ", Loss: ") + Integer.valueOf(pointsForLoss)));
    final EList<Team> teams = tournament.getTeams();
    int _size = teams.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      InputOutput.<String>println("Not enough teams to create matches.");
      return;
    }
    final Consumer<Team> _function = (Team team) -> {
      String _name_1 = team.getName();
      RoundRobinHandlerDSL.TeamStatistics _teamStatistics = new RoundRobinHandlerDSL.TeamStatistics(_name_1);
      this.teamStatsMap.put(team, _teamStatistics);
    };
    teams.forEach(_function);
    final ArrayList<Match> matches = new ArrayList<Match>();
    EList<Bracket> _brackets = tournament.getBrackets();
    for (final Bracket bracket : _brackets) {
      matches.addAll(bracket.getMatches());
    }
    for (final Match match : matches) {
      {
        final Team team1 = match.getTeams().get(0);
        final Team team2 = match.getTeams().get(1);
        if (((match.getScoreTeam1() != 0) && (match.getScoreTeam2() != 0))) {
          String _name_1 = team1.getName();
          String _plus_1 = ("Match between " + _name_1);
          String _plus_2 = (_plus_1 + " and ");
          String _name_2 = team2.getName();
          String _plus_3 = (_plus_2 + _name_2);
          String _plus_4 = (_plus_3 + " has a preset result: ");
          int _scoreTeam1 = match.getScoreTeam1();
          String _plus_5 = (_plus_4 + Integer.valueOf(_scoreTeam1));
          String _plus_6 = (_plus_5 + " - ");
          int _scoreTeam2 = match.getScoreTeam2();
          String _plus_7 = (_plus_6 + Integer.valueOf(_scoreTeam2));
          InputOutput.<String>println(_plus_7);
          this.updateTeamStatistics(team1, match.getScoreTeam1(), match.getScoreTeam2(), pointsForWin, pointsForDraw, pointsForLoss);
          this.updateTeamStatistics(team2, match.getScoreTeam2(), match.getScoreTeam1(), pointsForWin, pointsForDraw, pointsForLoss);
        }
      }
    }
    IntegerRange _upTo = new IntegerRange(1, numberOfRounds);
    for (final Integer round : _upTo) {
      {
        InputOutput.<String>println((("\nGenerating matches for Round " + round) + "..."));
        int _size_1 = teams.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
        for (final Integer i : _doubleDotLessThan) {
          int _size_2 = teams.size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_2, true);
          for (final Integer j : _doubleDotLessThan_1) {
            {
              final Team team1 = teams.get((i).intValue());
              final Team team2 = teams.get((j).intValue());
              boolean _isMatchAlreadyPlayed = this.isMatchAlreadyPlayed(team1, team2, matches);
              boolean _not = (!_isMatchAlreadyPlayed);
              if (_not) {
                String _name_1 = team1.getName();
                String _plus_1 = ("Match between: " + _name_1);
                String _plus_2 = (_plus_1 + " and ");
                String _name_2 = team2.getName();
                String _plus_3 = (_plus_2 + _name_2);
                InputOutput.<String>println(_plus_3);
                this.showPlayersForTeam(team1);
                this.showPlayersForTeam(team2);
                boolean validInput = false;
                while ((!validInput)) {
                  try {
                    String _name_3 = team1.getName();
                    String _plus_4 = ("Enter result for " + _name_3);
                    String _plus_5 = (_plus_4 + " vs ");
                    String _name_4 = team2.getName();
                    String _plus_6 = (_plus_5 + _name_4);
                    String _plus_7 = (_plus_6 + " (format: team1-score:team2-score): ");
                    InputOutput.<String>println(_plus_7);
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
                    String _plus_8 = ("Result: " + _name_5);
                    String _plus_9 = (_plus_8 + " ");
                    String _plus_10 = (_plus_9 + Integer.valueOf(scoreTeam1));
                    String _plus_11 = (_plus_10 + " - ");
                    String _plus_12 = (_plus_11 + Integer.valueOf(scoreTeam2));
                    String _plus_13 = (_plus_12 + " ");
                    String _name_6 = team2.getName();
                    String _plus_14 = (_plus_13 + _name_6);
                    InputOutput.<String>println(_plus_14);
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
    }
    this.generateTournamentResults();
  }

  public void showPlayersForTeam(final Team team) {
    String _name = team.getName();
    String _plus = ("\nPlayers for " + _name);
    String _plus_1 = (_plus + ":");
    InputOutput.<String>println(_plus_1);
    EList<Player> _players = team.getPlayers();
    for (final Player player : _players) {
      {
        String _name_1 = player.getName();
        String _plus_2 = ("Player: " + _name_1);
        String _plus_3 = (_plus_2 + ", Position: ");
        PlayerPosition _position = player.getPosition();
        String _plus_4 = (_plus_3 + _position);
        String _plus_5 = (_plus_4 + ", Number: ");
        int _number = player.getNumber();
        String _plus_6 = (_plus_5 + Integer.valueOf(_number));
        InputOutput.<String>println(_plus_6);
        PlayerStatistics _playerstatistics = player.getPlayerstatistics();
        boolean _notEquals = (!Objects.equals(_playerstatistics, null));
        if (_notEquals) {
          String _string = player.getPlayerstatistics().toString();
          String _plus_7 = ("Statistics: " + _string);
          InputOutput.<String>println(_plus_7);
        }
      }
    }
  }

  public boolean isMatchAlreadyPlayed(final Team team1, final Team team2, final List<Match> matches) {
    for (final Match match : matches) {
      if (((match.getTeams().contains(team1) && match.getTeams().contains(team2)) && ((match.getScoreTeam1() != 0) && (match.getScoreTeam2() != 0)))) {
        return true;
      }
    }
    return false;
  }

  public String generateXtendCode(final Tournament tournament) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ");
    String _name = tournament.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def void startTournament() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("println(\"Welcome to the ");
    String _name_1 = tournament.getName();
    _builder.append(_name_1, "        ");
    _builder.append(" tournament!\")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Teams and their statistics");
    _builder.newLine();
    {
      Set<Map.Entry<Team, RoundRobinHandlerDSL.TeamStatistics>> _entrySet = this.teamStatsMap.entrySet();
      for(final Map.Entry<Team, RoundRobinHandlerDSL.TeamStatistics> teamStats : _entrySet) {
        _builder.append("        ");
        _builder.append("println(\"Team: ");
        String _name_2 = teamStats.getKey().getName();
        _builder.append(_name_2, "        ");
        _builder.append(" - Points: ");
        _builder.append(teamStats.getValue().points, "        ");
        _builder.append(" | Wins: ");
        _builder.append(teamStats.getValue().wins, "        ");
        _builder.append(" | Draws: ");
        _builder.append(teamStats.getValue().draws, "        ");
        _builder.append(" | Losses: ");
        _builder.append(teamStats.getValue().losses, "        ");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public void saveXtendCode(final String fileName, final String xtendCode) {
    final String outputFile = (("generated/" + fileName) + ".xtend");
    final File file = new File(outputFile);
    file.getParentFile().mkdirs();
    try {
      final FileWriter writer = new FileWriter(file);
      writer.write(xtendCode);
      writer.close();
      InputOutput.<String>println(("Generated Xtend code saved to: " + outputFile));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        String _plus = ("Error writing to file: " + _message);
        InputOutput.<String>println(_plus);
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public void updateTeamStatistics(final Team team, final int goalsScored, final int goalsConceded, final int pointsForWin, final int pointsForDraw, final int pointsForLoss) {
    final RoundRobinHandlerDSL.TeamStatistics stats = this.teamStatsMap.get(team);
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
  }

  public void generateTournamentResults() {
    InputOutput.<String>println("\nFinal Standings:");
    Collection<RoundRobinHandlerDSL.TeamStatistics> _values = this.teamStatsMap.values();
    final ArrayList<RoundRobinHandlerDSL.TeamStatistics> sortedTeams = new ArrayList<RoundRobinHandlerDSL.TeamStatistics>(_values);
    final Comparator<RoundRobinHandlerDSL.TeamStatistics> _function = (RoundRobinHandlerDSL.TeamStatistics t1, RoundRobinHandlerDSL.TeamStatistics t2) -> {
      return Integer.compare(t2.points, t1.points);
    };
    Collections.<RoundRobinHandlerDSL.TeamStatistics>sort(sortedTeams, _function);
    final Consumer<RoundRobinHandlerDSL.TeamStatistics> _function_1 = (RoundRobinHandlerDSL.TeamStatistics stats) -> {
      InputOutput.<String>println(((((((((((((("Team: " + stats.teamName) + " - Points: ") + Integer.valueOf(stats.points)) + " | Wins: ") + Integer.valueOf(stats.wins)) + " | Draws: ") + Integer.valueOf(stats.draws)) + " | Losses: ") + Integer.valueOf(stats.losses)) + " | Goals Scored: ") + Integer.valueOf(stats.goalsScored)) + " | Goals Conceded: ") + Integer.valueOf(stats.goalsConceded)));
    };
    sortedTeams.forEach(_function_1);
  }
}
