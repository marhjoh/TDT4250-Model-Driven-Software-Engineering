package test_cases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fta_domain_model.*;

public class MatchRulesTest {

    private Fta_domain_modelFactory factory;

    @BeforeEach
    public void setup() {
        factory = Fta_domain_modelFactory.eINSTANCE;
    }

    @Test
    public void testApplyRulesForExtraTime() {
        // Create an ExtraTime instance via the factory
        ExtraTime extraTimeRule = factory.createExtraTime();
        extraTimeRule.setExtraTime(true);
        extraTimeRule.setExtraTimeDuration(10);

        // Apply rules
        extraTimeRule.applyRules();

        // Assertion to verify the state
        assertTrue(extraTimeRule.isExtraTime(), "Extra time should be applied.");
        assertEquals(10, extraTimeRule.getExtraTimeDuration(), "Extra time duration should be set correctly.");
    }

    @Test
    public void testApplyRulesForPenaltyShootout() {
        // Create a PenaltyShootout instance via the factory
        PenaltyShootout penaltyShootoutRule = factory.createPenaltyShootout();
        penaltyShootoutRule.setPentaltyShootouts(true);

        // Apply rules
        penaltyShootoutRule.applyRules();

        // Assertion to verify the state
        assertTrue(penaltyShootoutRule.isPentaltyShootouts(), "Penalty shootouts should be applied.");
    }

    @Test
    public void testApplyRulesForStandard() {
        // Create a Standard instance via the factory
        Standard standardRule = factory.createStandard();
        standardRule.setTieBreaking(true);

        // Apply rules
        standardRule.applyRules();

        // Assertion to verify the state
        assertTrue(standardRule.isTieBreaking(), "Tie-breaking should be applied.");
    }

    @Test
    public void testApplyRulesForGroupStage() {
        // Create a GroupStage instance via the factory
        GroupStage groupStageRule = factory.createGroupStage();
        groupStageRule.setTieBreaking(true);

        // Apply rules
        groupStageRule.applyRules();

        // Assertion to verify the state
        assertTrue(groupStageRule.isTieBreaking(), "Group stage tie-breaking should be applied.");
    }

}