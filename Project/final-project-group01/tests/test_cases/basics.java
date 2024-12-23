package test_cases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.Bracket;
import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.Knockout;
import fta_domain_model.Match;
import fta_domain_model.MatchRules;
import fta_domain_model.Player;
import fta_domain_model.PlayerPosition;
import fta_domain_model.SingleElimination;
import fta_domain_model.Team;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentType;


class basics {

	private Fta_domain_modelFactory factory;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
    }

    @Test
    void testCreateTournamentWithTeams() {
        Tournament tournament = factory.createTournament();
        tournament.setName("Champions League");
        tournament.setTournamentType(TournamentType.KNOCKOUT);
        
        Team team1 = factory.createTeam();
        team1.setName("Team A");
        Team team2 = factory.createTeam();
        team2.setName("Team B");
        
        tournament.getTeams().add(team1);
        tournament.getTeams().add(team2);

        // Test tournament properties
        assertEquals("Champions League", tournament.getName(), "Tournament name should be 'Champions League'.");
        assertEquals(TournamentType.KNOCKOUT, tournament.getTournamentType(), "Tournament type should be KNOCKOUT.");

        // Test tournament has the correct number of teams
        assertEquals(2, tournament.getTeams().size(), "Tournament should have 2 teams.");
    }

    @Test
    void testBracketAndMatchRelationship() {
        Bracket bracket = factory.createBracket();
        Match match1 = factory.createMatch();
        Match match2 = factory.createMatch();
        
        bracket.getMatches().add(match1);
        bracket.getMatches().add(match2);

        // Check that bracket contains the correct number of matches
        assertEquals(2, bracket.getMatches().size(), "Bracket should contain 2 matches.");
        
        // Add the bracket to a tournament
        Tournament tournament = factory.createTournament();
        tournament.getBrackets().add(bracket);

        // Ensure the tournament now has a bracket with 2 matches
        assertEquals(1, tournament.getBrackets().size(), "Tournament should have 1 bracket.");
        assertEquals(2, tournament.getBrackets().get(0).getMatches().size(), "Bracket in tournament should contain 2 matches.");
    }

    @Test
    void testPlayerPositionEnum() {
        Player player = factory.createPlayer();
        player.setPosition(PlayerPosition.GOALKEEPER);

        // Test player position
        assertEquals(PlayerPosition.GOALKEEPER, player.getPosition(), "Player position should be GOALKEEPER.");
    }

    @Test
    void testMatchSetupWithTeamsAndRules() {
        Match match = factory.createMatch();
        
        Team team1 = factory.createTeam();
        team1.setName("Team A");
        Team team2 = factory.createTeam();
        team2.setName("Team B");
        
        match.getTeams().add(team1);
        match.getTeams().add(team2);

        // Set match rules
        MatchRules matchRules = factory.createStandard();
        match.setMatchrules(matchRules);

        // Check that the match has the correct number of teams and assigned rules
        assertEquals(2, match.getTeams().size(), "Match should have 2 teams.");
        assertEquals("Team A", match.getTeams().get(0).getName(), "First team in match should be 'Team A'.");
        assertEquals("Team B", match.getTeams().get(1).getName(), "Second team in match should be 'Team B'.");
        assertNotNull(match.getMatchrules(), "Match should have assigned rules.");
    }

    @Test
    void testTournamentFormatConstraints() {
        // Test TournamentFormat with minTeams and maxTeams settings
        Knockout format = factory.createKnockout();
        format.setMinTeams(4);
        format.setMaxTeams(8);

        // Verify the range constraint is valid
        assertTrue(format.getMinTeams() <= format.getMaxTeams(), "MinTeams should be less than or equal to MaxTeams.");
    }

}
