/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.PenaltyShootout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Penalty Shootout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.PenaltyShootoutImpl#isPentaltyShootouts <em>Pentalty Shootouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PenaltyShootoutImpl extends MatchRulesImpl implements PenaltyShootout {
	/**
	 * The default value of the '{@link #isPentaltyShootouts() <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPentaltyShootouts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENTALTY_SHOOTOUTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPentaltyShootouts() <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPentaltyShootouts()
	 * @generated
	 * @ordered
	 */
	protected boolean pentaltyShootouts = PENTALTY_SHOOTOUTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenaltyShootoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.PENALTY_SHOOTOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPentaltyShootouts() {
		return pentaltyShootouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPentaltyShootouts(boolean newPentaltyShootouts) {
		boolean oldPentaltyShootouts = pentaltyShootouts;
		pentaltyShootouts = newPentaltyShootouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS, oldPentaltyShootouts,
					pentaltyShootouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS:
			return isPentaltyShootouts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS:
			setPentaltyShootouts((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS:
			setPentaltyShootouts(PENTALTY_SHOOTOUTS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS:
			return pentaltyShootouts != PENTALTY_SHOOTOUTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pentaltyShootouts: ");
		result.append(pentaltyShootouts);
		result.append(')');
		return result.toString();
	}

} //PenaltyShootoutImpl
