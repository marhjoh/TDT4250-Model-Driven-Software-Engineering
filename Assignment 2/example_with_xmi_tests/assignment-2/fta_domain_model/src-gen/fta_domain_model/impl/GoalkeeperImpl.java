/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Goalkeeper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goalkeeper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.GoalkeeperImpl#getCleansheets <em>Cleansheets</em>}</li>
 *   <li>{@link fta_domain_model.impl.GoalkeeperImpl#getSaves <em>Saves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalkeeperImpl extends PlayerStatisticsImpl implements Goalkeeper {
	/**
	 * The default value of the '{@link #getCleansheets() <em>Cleansheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleansheets()
	 * @generated
	 * @ordered
	 */
	protected static final int CLEANSHEETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCleansheets() <em>Cleansheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleansheets()
	 * @generated
	 * @ordered
	 */
	protected int cleansheets = CLEANSHEETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaves() <em>Saves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaves()
	 * @generated
	 * @ordered
	 */
	protected static final int SAVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSaves() <em>Saves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaves()
	 * @generated
	 * @ordered
	 */
	protected int saves = SAVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalkeeperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.GOALKEEPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCleansheets() {
		return cleansheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleansheets(int newCleansheets) {
		int oldCleansheets = cleansheets;
		cleansheets = newCleansheets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.GOALKEEPER__CLEANSHEETS,
					oldCleansheets, cleansheets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSaves() {
		return saves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaves(int newSaves) {
		int oldSaves = saves;
		saves = newSaves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.GOALKEEPER__SAVES, oldSaves,
					saves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.GOALKEEPER__CLEANSHEETS:
			return getCleansheets();
		case Fta_domain_modelPackage.GOALKEEPER__SAVES:
			return getSaves();
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
		case Fta_domain_modelPackage.GOALKEEPER__CLEANSHEETS:
			setCleansheets((Integer) newValue);
			return;
		case Fta_domain_modelPackage.GOALKEEPER__SAVES:
			setSaves((Integer) newValue);
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
		case Fta_domain_modelPackage.GOALKEEPER__CLEANSHEETS:
			setCleansheets(CLEANSHEETS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.GOALKEEPER__SAVES:
			setSaves(SAVES_EDEFAULT);
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
		case Fta_domain_modelPackage.GOALKEEPER__CLEANSHEETS:
			return cleansheets != CLEANSHEETS_EDEFAULT;
		case Fta_domain_modelPackage.GOALKEEPER__SAVES:
			return saves != SAVES_EDEFAULT;
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
		result.append(" (cleansheets: ");
		result.append(cleansheets);
		result.append(", saves: ");
		result.append(saves);
		result.append(')');
		return result.toString();
	}

} //GoalkeeperImpl
