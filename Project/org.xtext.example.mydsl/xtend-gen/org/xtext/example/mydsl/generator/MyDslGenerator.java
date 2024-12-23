package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterators;
import fta_domain_model.Attacker;
import fta_domain_model.Bracket;
import fta_domain_model.BracketSide;
import fta_domain_model.Defender;
import fta_domain_model.Goalkeeper;
import fta_domain_model.Knockout;
import fta_domain_model.League;
import fta_domain_model.Match;
import fta_domain_model.MatchResult;
import fta_domain_model.Player;
import fta_domain_model.PlayerPosition;
import fta_domain_model.PlayerStatistics;
import fta_domain_model.RoundRobin;
import fta_domain_model.Team;
import fta_domain_model.TieBreakerRule;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentFormat;
import fta_domain_model.TournamentType;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your .mydsl files.
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<Tournament> _function = (Tournament tournament) -> {
      String _replace = tournament.getName().replace(" ", "");
      final String fileName = (_replace + ".xtend");
      fsa.generateFile(fileName, this.generateXtendCode(tournament));
    };
    IteratorExtensions.<Tournament>forEach(Iterators.<Tournament>filter(resource.getAllContents(), Tournament.class), _function);
  }

  public CharSequence generateXtendCode(final Tournament tournament) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package generated");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ");
    String _replace = tournament.getName().replace(" ", "");
    _builder.append(_replace);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("println(\"Welcome to the ");
    String _name = tournament.getName();
    _builder.append(_name, "        ");
    _builder.append(" tournament!\")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("println(\"Tournament Type: ");
    TournamentType _tournamentType = tournament.getTournamentType();
    _builder.append(_tournamentType, "        ");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("println(\"Teams Participating:\")");
    _builder.newLine();
    _builder.append("        ");
    CharSequence _generateTeamsCode = this.generateTeamsCode(tournament.getTeams());
    _builder.append(_generateTeamsCode, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("println(\"Tournament Format Details:\")");
    _builder.newLine();
    _builder.append("        ");
    CharSequence _generateTournamentFormatCode = this.generateTournamentFormatCode(tournament.getTournamentformat());
    _builder.append(_generateTournamentFormatCode, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("println(\"Bracket Details:\")");
    _builder.newLine();
    _builder.append("        ");
    CharSequence _generateBracketsCode = this.generateBracketsCode(tournament.getBrackets());
    _builder.append(_generateBracketsCode, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateTeamMethods = this.generateTeamMethods(tournament.getTeams());
    _builder.append(_generateTeamMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateBracketMethods = this.generateBracketMethods(tournament.getBrackets());
    _builder.append(_generateBracketMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateTeamsCode(final List<Team> teams) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Team team : teams) {
        _builder.append("println(\"- Team Name: ");
        String _name = team.getName();
        _builder.append(_name);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Manager: ");
        String _managerName = team.getManagerName();
        _builder.append(_managerName);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Players:\")");
        _builder.newLine();
        {
          EList<Player> _players = team.getPlayers();
          for(final Player player : _players) {
            _builder.append("println(\"    - Name: ");
            String _name_1 = player.getName();
            _builder.append(_name_1);
            _builder.append(", Position: ");
            PlayerPosition _position = player.getPosition();
            _builder.append(_position);
            _builder.append(", Number: ");
            int _number = player.getNumber();
            _builder.append(_number);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
            CharSequence _generatePlayerStatistics = this.generatePlayerStatistics(player);
            _builder.append(_generatePlayerStatistics);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence generatePlayerStatistics(final Player player) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PlayerStatistics _playerstatistics = player.getPlayerstatistics();
      if ((_playerstatistics instanceof Goalkeeper)) {
        _builder.append("println(\"      [Goalkeeper] Saves: ");
        PlayerStatistics _playerstatistics_1 = player.getPlayerstatistics();
        int _saves = ((Goalkeeper) _playerstatistics_1).getSaves();
        _builder.append(_saves);
        _builder.append(", Clean Sheets: ");
        PlayerStatistics _playerstatistics_2 = player.getPlayerstatistics();
        int _cleansheets = ((Goalkeeper) _playerstatistics_2).getCleansheets();
        _builder.append(_cleansheets);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      PlayerStatistics _playerstatistics_3 = player.getPlayerstatistics();
      if ((_playerstatistics_3 instanceof Attacker)) {
        _builder.append("println(\"      [Attacker] Goals: ");
        PlayerStatistics _playerstatistics_4 = player.getPlayerstatistics();
        int _goals = ((Attacker) _playerstatistics_4).getGoals();
        _builder.append(_goals);
        _builder.append(", Sprint Speed: ");
        PlayerStatistics _playerstatistics_5 = player.getPlayerstatistics();
        int _sprintSpeed = ((Attacker) _playerstatistics_5).getSprintSpeed();
        _builder.append(_sprintSpeed);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      PlayerStatistics _playerstatistics_6 = player.getPlayerstatistics();
      if ((_playerstatistics_6 instanceof Defender)) {
        _builder.append("println(\"      [Defender] Clean Sheets: ");
        PlayerStatistics _playerstatistics_7 = player.getPlayerstatistics();
        int _cleansheets_1 = ((Defender) _playerstatistics_7).getCleansheets();
        _builder.append(_cleansheets_1);
        _builder.append(", Assists: ");
        PlayerStatistics _playerstatistics_8 = player.getPlayerstatistics();
        int _assists = ((Defender) _playerstatistics_8).getAssists();
        _builder.append(_assists);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence generateTournamentFormatCode(final TournamentFormat format) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((format instanceof RoundRobin)) {
        _builder.append("println(\"- Round Robin Format: ");
        String _name = ((RoundRobin) format).getName();
        _builder.append(_name);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Points for Win: ");
        int _pointsForWin = ((RoundRobin) format).getPointsForWin();
        _builder.append(_pointsForWin);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Tie Breaker Rule: ");
        TieBreakerRule _tieBreakerRule = ((RoundRobin) format).getTieBreakerRule();
        _builder.append(_tieBreakerRule);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((format instanceof Knockout)) {
        _builder.append("println(\"- Knockout Format: ");
        String _name_1 = ((Knockout) format).getName();
        _builder.append(_name_1);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Number of Rounds: ");
        int _numberOfRounds = ((Knockout) format).getNumberOfRounds();
        _builder.append(_numberOfRounds);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((format instanceof League)) {
        _builder.append("println(\"- League Format: ");
        String _name_2 = ((League) format).getName();
        _builder.append(_name_2);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"  Description: ");
        String _description = ((League) format).getDescription();
        _builder.append(_description);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }

  public CharSequence generateBracketsCode(final List<Bracket> brackets) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Bracket bracket : brackets) {
        _builder.append("println(\"Bracket with ");
        int _rounds = bracket.getRounds();
        _builder.append(_rounds);
        _builder.append(" rounds, Side: ");
        BracketSide _bracketSide = bracket.getBracketSide();
        _builder.append(_bracketSide);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("println(\"Matches:\")");
        _builder.newLine();
        {
          EList<Match> _matches = bracket.getMatches();
          for(final Match match : _matches) {
            _builder.append("println(\"  Match on ");
            Date _day = match.getDay();
            _builder.append(_day);
            _builder.append(" between ");
            String _name = IterableExtensions.<Team>head(match.getTeams()).getName();
            _builder.append(_name);
            _builder.append(" and ");
            String _name_1 = IterableExtensions.<Team>head(IterableExtensions.<Team>tail(match.getTeams())).getName();
            _builder.append(_name_1);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
            _builder.append("println(\"  Result: Team 1 Score: ");
            int _scoreTeam1 = match.getScoreTeam1();
            _builder.append(_scoreTeam1);
            _builder.append(", Team 2 Score: ");
            int _scoreTeam2 = match.getScoreTeam2();
            _builder.append(_scoreTeam2);
            _builder.append(", Outcome: ");
            MatchResult _matchResult = match.getMatchResult();
            _builder.append(_matchResult);
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  public CharSequence generateTeamMethods(final List<Team> teams) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Team team : teams) {
        _builder.append("def static void displayTeam");
        String _replace = team.getName().replace(" ", "");
        _builder.append(_replace);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("println(\"Team Name: ");
        String _name = team.getName();
        _builder.append(_name, "    ");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("println(\"Manager: ");
        String _managerName = team.getManagerName();
        _builder.append(_managerName, "    ");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("println(\"Players:\")");
        _builder.newLine();
        {
          EList<Player> _players = team.getPlayers();
          for(final Player player : _players) {
            _builder.append("    ");
            _builder.append("println(\"- ");
            String _name_1 = player.getName();
            _builder.append(_name_1, "    ");
            _builder.append(" (Position: ");
            PlayerPosition _position = player.getPosition();
            _builder.append(_position, "    ");
            _builder.append(", Number: ");
            int _number = player.getNumber();
            _builder.append(_number, "    ");
            _builder.append(")\")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  public CharSequence generateBracketMethods(final List<Bracket> brackets) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Bracket bracket : brackets) {
        _builder.append("def static void displayBracket");
        int _rounds = bracket.getRounds();
        _builder.append(_rounds);
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("println(\"Bracket with ");
        int _rounds_1 = bracket.getRounds();
        _builder.append(_rounds_1, "    ");
        _builder.append(" rounds:\")");
        _builder.newLineIfNotEmpty();
        {
          EList<Match> _matches = bracket.getMatches();
          for(final Match match : _matches) {
            _builder.append("    ");
            _builder.append("println(\"- Match between ");
            String _name = IterableExtensions.<Team>head(match.getTeams()).getName();
            _builder.append(_name, "    ");
            _builder.append(" and ");
            String _name_1 = IterableExtensions.<Team>head(IterableExtensions.<Team>tail(match.getTeams())).getName();
            _builder.append(_name_1, "    ");
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("println(\"  Score: ");
            int _scoreTeam1 = match.getScoreTeam1();
            _builder.append(_scoreTeam1, "    ");
            _builder.append(" - ");
            int _scoreTeam2 = match.getScoreTeam2();
            _builder.append(_scoreTeam2, "    ");
            _builder.append(", Result: ");
            MatchResult _matchResult = match.getMatchResult();
            _builder.append(_matchResult, "    ");
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
