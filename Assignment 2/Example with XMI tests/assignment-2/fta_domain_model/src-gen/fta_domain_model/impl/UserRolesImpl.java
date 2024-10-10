/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.UserRoles;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.UserRolesImpl#isCanModifyTournament <em>Can Modify Tournament</em>}</li>
 *   <li>{@link fta_domain_model.impl.UserRolesImpl#isCanViewStats <em>Can View Stats</em>}</li>
 *   <li>{@link fta_domain_model.impl.UserRolesImpl#isCanManageTeams <em>Can Manage Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserRolesImpl extends MinimalEObjectImpl.Container implements UserRoles {
	/**
	 * The default value of the '{@link #isCanModifyTournament() <em>Can Modify Tournament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanModifyTournament()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MODIFY_TOURNAMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanModifyTournament() <em>Can Modify Tournament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanModifyTournament()
	 * @generated
	 * @ordered
	 */
	protected boolean canModifyTournament = CAN_MODIFY_TOURNAMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanViewStats() <em>Can View Stats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanViewStats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_VIEW_STATS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanViewStats() <em>Can View Stats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanViewStats()
	 * @generated
	 * @ordered
	 */
	protected boolean canViewStats = CAN_VIEW_STATS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanManageTeams() <em>Can Manage Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageTeams()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_MANAGE_TEAMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanManageTeams() <em>Can Manage Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanManageTeams()
	 * @generated
	 * @ordered
	 */
	protected boolean canManageTeams = CAN_MANAGE_TEAMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.USER_ROLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanModifyTournament() {
		return canModifyTournament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanModifyTournament(boolean newCanModifyTournament) {
		boolean oldCanModifyTournament = canModifyTournament;
		canModifyTournament = newCanModifyTournament;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.USER_ROLES__CAN_MODIFY_TOURNAMENT, oldCanModifyTournament,
					canModifyTournament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanViewStats() {
		return canViewStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanViewStats(boolean newCanViewStats) {
		boolean oldCanViewStats = canViewStats;
		canViewStats = newCanViewStats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.USER_ROLES__CAN_VIEW_STATS,
					oldCanViewStats, canViewStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanManageTeams() {
		return canManageTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanManageTeams(boolean newCanManageTeams) {
		boolean oldCanManageTeams = canManageTeams;
		canManageTeams = newCanManageTeams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.USER_ROLES__CAN_MANAGE_TEAMS,
					oldCanManageTeams, canManageTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.USER_ROLES__CAN_MODIFY_TOURNAMENT:
			return isCanModifyTournament();
		case Fta_domain_modelPackage.USER_ROLES__CAN_VIEW_STATS:
			return isCanViewStats();
		case Fta_domain_modelPackage.USER_ROLES__CAN_MANAGE_TEAMS:
			return isCanManageTeams();
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
		case Fta_domain_modelPackage.USER_ROLES__CAN_MODIFY_TOURNAMENT:
			setCanModifyTournament((Boolean) newValue);
			return;
		case Fta_domain_modelPackage.USER_ROLES__CAN_VIEW_STATS:
			setCanViewStats((Boolean) newValue);
			return;
		case Fta_domain_modelPackage.USER_ROLES__CAN_MANAGE_TEAMS:
			setCanManageTeams((Boolean) newValue);
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
		case Fta_domain_modelPackage.USER_ROLES__CAN_MODIFY_TOURNAMENT:
			setCanModifyTournament(CAN_MODIFY_TOURNAMENT_EDEFAULT);
			return;
		case Fta_domain_modelPackage.USER_ROLES__CAN_VIEW_STATS:
			setCanViewStats(CAN_VIEW_STATS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.USER_ROLES__CAN_MANAGE_TEAMS:
			setCanManageTeams(CAN_MANAGE_TEAMS_EDEFAULT);
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
		case Fta_domain_modelPackage.USER_ROLES__CAN_MODIFY_TOURNAMENT:
			return canModifyTournament != CAN_MODIFY_TOURNAMENT_EDEFAULT;
		case Fta_domain_modelPackage.USER_ROLES__CAN_VIEW_STATS:
			return canViewStats != CAN_VIEW_STATS_EDEFAULT;
		case Fta_domain_modelPackage.USER_ROLES__CAN_MANAGE_TEAMS:
			return canManageTeams != CAN_MANAGE_TEAMS_EDEFAULT;
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
		result.append(" (canModifyTournament: ");
		result.append(canModifyTournament);
		result.append(", canViewStats: ");
		result.append(canViewStats);
		result.append(", canManageTeams: ");
		result.append(canManageTeams);
		result.append(')');
		return result.toString();
	}

} //UserRolesImpl
