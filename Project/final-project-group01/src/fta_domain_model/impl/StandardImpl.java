/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Standard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.StandardImpl#isTieBreaking <em>Tie Breaking</em>}</li>
 *   <li>{@link fta_domain_model.impl.StandardImpl#isExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link fta_domain_model.impl.StandardImpl#isPentaltyShootouts <em>Pentalty Shootouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardImpl extends MatchRulesImpl implements Standard {
	/**
	 * The default value of the '{@link #isTieBreaking() <em>Tie Breaking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieBreaking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIE_BREAKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieBreaking() <em>Tie Breaking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieBreaking()
	 * @generated
	 * @ordered
	 */
	protected boolean tieBreaking = TIE_BREAKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtraTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRA_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtraTime()
	 * @generated
	 * @ordered
	 */
	protected boolean extraTime = EXTRA_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPentaltyShootouts() <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPentaltyShootouts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENTALTY_SHOOTOUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPentaltyShootouts() <em>Pentalty Shootouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPentaltyShootouts()
	 * @generated
	 * @ordered
	 */
	protected boolean pentaltyShootouts = PENTALTY_SHOOTOUTS_EDEFAULT;

	@Override
	public void applyRules() {
		if (isTieBreaking()) {
			System.out.println("Standard match allows tie-breaking.");
			// Add any tie-breaking logic here
		} else {
			System.out.println("Standard match does not allow tie-breaking.");
		}

		if (isExtraTime()) {
			System.out.println("Standard match includes extra time.");
			// Add extra time logic here
		} else {
			System.out.println("Standard match has no extra time.");
		}

		if (isPentaltyShootouts()) {
			System.out.println("Standard match allows penalty shootouts.");
			// Add penalty shootout logic here
		} else {
			System.out.println("Standard match does not allow penalty shootouts.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTieBreaking() {
		return tieBreaking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTieBreaking(boolean newTieBreaking) {
		boolean oldTieBreaking = tieBreaking;
		tieBreaking = newTieBreaking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.STANDARD__TIE_BREAKING,
					oldTieBreaking, tieBreaking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExtraTime() {
		return extraTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraTime(boolean newExtraTime) {
		boolean oldExtraTime = extraTime;
		extraTime = newExtraTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.STANDARD__EXTRA_TIME,
					oldExtraTime, extraTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.STANDARD__PENTALTY_SHOOTOUTS,
					oldPentaltyShootouts, pentaltyShootouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.STANDARD__TIE_BREAKING:
			return isTieBreaking();
		case Fta_domain_modelPackage.STANDARD__EXTRA_TIME:
			return isExtraTime();
		case Fta_domain_modelPackage.STANDARD__PENTALTY_SHOOTOUTS:
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
		case Fta_domain_modelPackage.STANDARD__TIE_BREAKING:
			setTieBreaking((Boolean) newValue);
			return;
		case Fta_domain_modelPackage.STANDARD__EXTRA_TIME:
			setExtraTime((Boolean) newValue);
			return;
		case Fta_domain_modelPackage.STANDARD__PENTALTY_SHOOTOUTS:
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
		case Fta_domain_modelPackage.STANDARD__TIE_BREAKING:
			setTieBreaking(TIE_BREAKING_EDEFAULT);
			return;
		case Fta_domain_modelPackage.STANDARD__EXTRA_TIME:
			setExtraTime(EXTRA_TIME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.STANDARD__PENTALTY_SHOOTOUTS:
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
		case Fta_domain_modelPackage.STANDARD__TIE_BREAKING:
			return tieBreaking != TIE_BREAKING_EDEFAULT;
		case Fta_domain_modelPackage.STANDARD__EXTRA_TIME:
			return extraTime != EXTRA_TIME_EDEFAULT;
		case Fta_domain_modelPackage.STANDARD__PENTALTY_SHOOTOUTS:
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
		result.append(" (tieBreaking: ");
		result.append(tieBreaking);
		result.append(", extraTime: ");
		result.append(extraTime);
		result.append(", pentaltyShootouts: ");
		result.append(pentaltyShootouts);
		result.append(')');
		return result.toString();
	}

} //StandardImpl
