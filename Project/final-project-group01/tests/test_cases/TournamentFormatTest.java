package test_cases;

import static org.junit.jupiter.api.Assertions.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.Knockout;

public class TournamentFormatTest {

    private Fta_domain_modelFactory factory;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
    }

    @Test
    public void testInvalidTeamRangeConstraint() {
        // Create a Knockout instance via the factory
        Knockout tournamentFormat = factory.createKnockout();

        // Set minTeams greater than maxTeams to trigger the constraint
        tournamentFormat.setMinTeams(5);
        tournamentFormat.setMaxTeams(4);

        // Validate the model using Diagnostician
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(tournamentFormat);
        assertFalse(diagnostic.getSeverity() == Diagnostic.OK, "Validation should fail because maxTeams < minTeams");

        // Check if the correct error message was found
        boolean foundExpectedError = diagnostic.getChildren().stream()
            .anyMatch(d -> d.getMessage().contains("ValidTeamRange"));

        assertTrue(foundExpectedError, "Validation should return an error for 'ValidTeamRange'");
    }

    @Test
    public void testValidTeamRangeConstraint() {
        // Create a Knockout instance via the factory
        Knockout tournamentFormat = factory.createKnockout();

        // Set valid values for minTeams and maxTeams
        tournamentFormat.setMinTeams(4);
        tournamentFormat.setMaxTeams(6);

        // Validate the model using Diagnostician
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(tournamentFormat);
        assertEquals(Diagnostic.OK, diagnostic.getSeverity(), "Validation should pass for valid values");
    }
}