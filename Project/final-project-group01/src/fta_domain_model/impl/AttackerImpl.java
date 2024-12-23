/**
 */
package fta_domain_model.impl;

import fta_domain_model.Attacker;
import fta_domain_model.Fta_domain_modelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.AttackerImpl#getSprintSpeed <em>Sprint Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerImpl extends PlayerStatisticsImpl implements Attacker {
	/**
	 * The default value of the '{@link #getSprintSpeed() <em>Sprint Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprintSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPRINT_SPEED_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSprintSpeed() <em>Sprint Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprintSpeed()
	 * @generated
	 * @ordered
	 */
	protected int sprintSpeed = SPRINT_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.ATTACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSprintSpeed() {
		return sprintSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSprintSpeed(int newSprintSpeed) {
		int oldSprintSpeed = sprintSpeed;
		sprintSpeed = newSprintSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ATTACKER__SPRINT_SPEED,
					oldSprintSpeed, sprintSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.ATTACKER__SPRINT_SPEED:
			return getSprintSpeed();
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
		case Fta_domain_modelPackage.ATTACKER__SPRINT_SPEED:
			setSprintSpeed((Integer) newValue);
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
		case Fta_domain_modelPackage.ATTACKER__SPRINT_SPEED:
			setSprintSpeed(SPRINT_SPEED_EDEFAULT);
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
		case Fta_domain_modelPackage.ATTACKER__SPRINT_SPEED:
			return sprintSpeed != SPRINT_SPEED_EDEFAULT;
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
		result.append(" (sprintSpeed: ");
		result.append(sprintSpeed);
		result.append(')');
		return result.toString();
	}

} //AttackerImpl
