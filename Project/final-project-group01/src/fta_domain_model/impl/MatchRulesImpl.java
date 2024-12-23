/**
 */
package fta_domain_model.impl;

import fta_domain_model.ExtraTime;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.GroupStage;
import fta_domain_model.MatchRules;
import fta_domain_model.PenaltyShootout;
import fta_domain_model.Standard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MatchRulesImpl extends MinimalEObjectImpl.Container implements MatchRules {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.MATCH_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void applyRules() {
	    
	    if (this instanceof ExtraTime) {
	        ExtraTime extraTimeRule = (ExtraTime) this;
	        
	        if (extraTimeRule.isExtraTime()) {
	            // Apply logic for handling extra time
	            System.out.println("Applying extra time with duration: " + extraTimeRule.getExtraTimeDuration());
	        } else {
	            // Handle the case where there is no extra time
	            System.out.println("No extra time applied.");
	        }
	    } else if (this instanceof PenaltyShootout) {
	        PenaltyShootout penaltyRule = (PenaltyShootout) this;
	        
	        if (penaltyRule.isPentaltyShootouts()) {
	            // Apply logic for handling penalty shootouts
	            System.out.println("Penalty shootouts applied.");
	        } else {
	            System.out.println("No penalty shootouts required.");
	        }
	    } else if (this instanceof Standard) {
	        Standard standardRule = (Standard) this;
	        
	        // Apply standard match rules (e.g., tie-breaking)
	        if (standardRule.isTieBreaking()) {
	            System.out.println("Applying tie-breaking rule.");
	        } else {
	            System.out.println("No tie-breaking rule applied.");
	        }
	    } else if (this instanceof GroupStage) {
	        GroupStage groupStageRule = (GroupStage) this;

	        if (groupStageRule.isTieBreaking()) {
	            // Apply group-stage specific tie-breaking logic
	            System.out.println("Applying group-stage tie-breaking rule.");
	        } else {
	            System.out.println("No tie-breaking required for group stage.");
	        }
	    } else {
	        throw new UnsupportedOperationException("Unknown rule type: " + this.getClass().getName());
	    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Fta_domain_modelPackage.MATCH_RULES___APPLY_RULES:
			applyRules();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MatchRulesImpl
