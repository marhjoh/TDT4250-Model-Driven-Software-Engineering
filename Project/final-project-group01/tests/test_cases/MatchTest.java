package test_cases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.Match;
import fta_domain_model.Team;
import fta_domain_model.util.Fta_domain_modelValidator;

import java.util.Arrays;

public class MatchTest {

private Fta_domain_modelFactory factory;
    private Fta_domain_modelValidator validator;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
        validator = new Fta_domain_modelValidator();  // Oppretter en instans av validatoren for å kalle valideringsmetoder
    }

    @Test
    public void testInvalidUniqueTeamsConstraint() {
    // Opprett en Match-instans via fabrikk
        Match match = factory.createMatch();

        // Lag to Team-instanser via fabrikk med unike navn
        Team teamA = factory.createTeam();
        teamA.setName("Team A");
        Team teamB = factory.createTeam();
        teamB.setName("Team A");

        // Sett opp Match med dupliserte lag
        match.getTeams().addAll(Arrays.asList(teamA, teamB)); // Samme team legges inn to ganger

        // Manuelt kall til valideringsmetoden for å teste om den fungerer riktig
        boolean isValid = validator.validateMatch_UniqueTeams(match, null, null);
        assertFalse(isValid, "Manual validation should fail because there are duplicate teams in the match.");

    }

    @Test
    public void testValidUniqueTeamsConstraint() {
        // Opprett en Match-instans via fabrikk
        Match match = factory.createMatch();

        // Lag to Team-instanser via fabrikk med unike navn
        Team teamA = factory.createTeam();
        teamA.setName("Team A");
        Team teamB = factory.createTeam();
        teamB.setName("Team B");

        // Sett opp Match med unike lag
        match.getTeams().addAll(Arrays.asList(teamA, teamB));
        
        // Manuelt kall til valideringsmetoden for å teste om den fungerer riktig
        boolean isValid = validator.validateMatch_UniqueTeams(match, null, null);
        assertTrue(isValid, "Manual validation should pass for unique teams in the match.");

    }
}