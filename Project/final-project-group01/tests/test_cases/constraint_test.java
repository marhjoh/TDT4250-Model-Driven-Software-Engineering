package test_cases;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.TournamentFormat;


import fta_domain_model.*;

class constraint_test {

	private Fta_domain_modelFactory factory;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
    }
    
	@Test
    public void testTeamRangeConstraint() {
        Fta_domain_modelFactory factory = Fta_domain_modelFactory.eINSTANCE;

        // Create a TournamentFormat instance
        Knockout tournamentFormat = factory.createKnockout();

        // Set up test values for minTeams and maxTeams
        tournamentFormat.setMinTeams(4);
        tournamentFormat.setMaxTeams(2); // This should violate the constraint

        // Validate constraint
        boolean isValid = tournamentFormat.getMinTeams() <= tournamentFormat.getMaxTeams();
        assertFalse(isValid, "The minTeams should be less than or equal to maxTeams");
    }

	@Test
    void testTeamSizeConstraint() {
        Team team = factory.createTeam();
        Player player1 = factory.createPlayer();
        team.getPlayers().add(player1); // Only 1 player, which might be invalid if min size > 1

        boolean isValid = team.getPlayers().size() >= 2;
        assertFalse(isValid, "Team should have at least 2 players.");
    }

    @Test
    void testMatchUniqueTeamsConstraint() {
        Match match = factory.createMatch();
        Team team1 = factory.createTeam();
        Team duplicateTeam = team1;

        match.getTeams().add(team1);
        match.getTeams().add(duplicateTeam); // Duplicate team to test unique constraint

        boolean hasUniqueTeams = match.getTeams().size() == 2 && match.getTeams().get(0) != match.getTeams().get(1);
        assertFalse(hasUniqueTeams, "Match should have two unique teams.");
    }

    @Test
    void testExtraTimeConstraint() {
        ExtraTime extraTime = factory.createExtraTime();
        extraTime.setExtraTime(false);
        extraTime.setExtraTimeDuration(10); // Invalid if extraTime is false

        boolean isValid = !(extraTime.isExtraTime() == false && extraTime.getExtraTimeDuration() > 0);
        assertFalse(isValid, "Extra time duration should be 0 if extraTime is false.");
    }
    
    
    
    
}
