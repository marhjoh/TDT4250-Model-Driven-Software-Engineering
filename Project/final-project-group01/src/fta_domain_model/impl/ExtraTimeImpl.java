/**
 */
package fta_domain_model.impl;

import fta_domain_model.ExtraTime;
import fta_domain_model.Fta_domain_modelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.ExtraTimeImpl#isExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link fta_domain_model.impl.ExtraTimeImpl#getExtraTimeDuration <em>Extra Time Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtraTimeImpl extends MatchRulesImpl implements ExtraTime {
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
	 * The default value of the '{@link #getExtraTimeDuration() <em>Extra Time Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTimeDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_TIME_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraTimeDuration() <em>Extra Time Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTimeDuration()
	 * @generated
	 * @ordered
	 */
	protected int extraTimeDuration = EXTRA_TIME_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraTimeImpl() {
		super();
	}

	@Override
	public void applyRules() {
		if (isExtraTime()) {
			System.out.println("Extra time is allowed.");
			System.out.println("Extra time duration: " + getExtraTimeDuration() + " minutes.");
			// Add specific logic for handling extra time and its duration here
		} else {
			System.out.println("Extra time is not allowed.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.EXTRA_TIME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME,
					oldExtraTime, extraTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtraTimeDuration() {
		return extraTimeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraTimeDuration(int newExtraTimeDuration) {
		int oldExtraTimeDuration = extraTimeDuration;
		extraTimeDuration = newExtraTimeDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME_DURATION, oldExtraTimeDuration, extraTimeDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME:
			return isExtraTime();
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME_DURATION:
			return getExtraTimeDuration();
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
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME:
			setExtraTime((Boolean) newValue);
			return;
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME_DURATION:
			setExtraTimeDuration((Integer) newValue);
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
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME:
			setExtraTime(EXTRA_TIME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME_DURATION:
			setExtraTimeDuration(EXTRA_TIME_DURATION_EDEFAULT);
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
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME:
			return extraTime != EXTRA_TIME_EDEFAULT;
		case Fta_domain_modelPackage.EXTRA_TIME__EXTRA_TIME_DURATION:
			return extraTimeDuration != EXTRA_TIME_DURATION_EDEFAULT;
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
		result.append(" (extraTime: ");
		result.append(extraTime);
		result.append(", extraTimeDuration: ");
		result.append(extraTimeDuration);
		result.append(')');
		return result.toString();
	}

} //ExtraTimeImpl
