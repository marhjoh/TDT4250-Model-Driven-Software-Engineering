package test_cases;

import static org.junit.jupiter.api.Assertions.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.ExtraTime;
import fta_domain_model.Fta_domain_modelFactory;

public class ExtraTimeTest {

    private Fta_domain_modelFactory factory;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
    }

    @Test
    public void testInvalidExtraTimeConstraint() {
        // Create an ExtraTime instance via the factory
        ExtraTime extraTime = factory.createExtraTime();

        // Set values that break the constraint (extraTime is true, but duration is zero)
        extraTime.setExtraTime(true);
        extraTime.setExtraTimeDuration(0);

        // Validate the model using Diagnostician
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(extraTime);

        // Check that validation fails due to invalid duration
        assertFalse(diagnostic.getSeverity() == Diagnostic.OK, 
                    "Validation should fail because extraTimeDuration <= 0");

        // Check if the correct error message was found
        boolean foundExpectedError = diagnostic.getChildren().stream()
            .anyMatch(d -> d.getMessage().contains("ValidExtraTime"));

        assertTrue(foundExpectedError, "Validation should return an error for 'ValidExtraTime'");
    }

    @Test
    public void testValidExtraTimeConstraint() {
        // Create an ExtraTime instance via the factory
        ExtraTime extraTime = factory.createExtraTime();

        // Set valid values
        extraTime.setExtraTime(true);
        extraTime.setExtraTimeDuration(5);

        // Validate the model using Diagnostician
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(extraTime);

        // Check that validation passes for valid values
        assertEquals(Diagnostic.OK, diagnostic.getSeverity(), 
                     "Validation should pass for valid values");
    }
}