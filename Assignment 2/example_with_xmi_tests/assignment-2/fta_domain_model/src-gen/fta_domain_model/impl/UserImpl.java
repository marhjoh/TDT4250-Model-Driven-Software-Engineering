/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Tournament;
import fta_domain_model.User;
import fta_domain_model.UserRole;
import fta_domain_model.UserRoles;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link fta_domain_model.impl.UserImpl#getRole <em>Role</em>}</li>
 *   <li>{@link fta_domain_model.impl.UserImpl#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link fta_domain_model.impl.UserImpl#getUserroles <em>Userroles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final UserRole ROLE_EDEFAULT = UserRole.VIEWER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected UserRole role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTournaments() <em>Tournaments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournaments()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournament> tournaments;

	/**
	 * The cached value of the '{@link #getUserroles() <em>Userroles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserroles()
	 * @generated
	 * @ordered
	 */
	protected UserRoles userroles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.USER__USERNAME, oldUsername,
					username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(UserRole newRole) {
		UserRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.USER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tournament> getTournaments() {
		if (tournaments == null) {
			tournaments = new EObjectEList<Tournament>(Tournament.class, this,
					Fta_domain_modelPackage.USER__TOURNAMENTS);
		}
		return tournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserRoles getUserroles() {
		if (userroles != null && userroles.eIsProxy()) {
			InternalEObject oldUserroles = (InternalEObject) userroles;
			userroles = (UserRoles) eResolveProxy(oldUserroles);
			if (userroles != oldUserroles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fta_domain_modelPackage.USER__USERROLES,
							oldUserroles, userroles));
			}
		}
		return userroles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoles basicGetUserroles() {
		return userroles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserroles(UserRoles newUserroles) {
		UserRoles oldUserroles = userroles;
		userroles = newUserroles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.USER__USERROLES, oldUserroles,
					userroles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.USER__USERNAME:
			return getUsername();
		case Fta_domain_modelPackage.USER__ROLE:
			return getRole();
		case Fta_domain_modelPackage.USER__TOURNAMENTS:
			return getTournaments();
		case Fta_domain_modelPackage.USER__USERROLES:
			if (resolve)
				return getUserroles();
			return basicGetUserroles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fta_domain_modelPackage.USER__USERNAME:
			setUsername((String) newValue);
			return;
		case Fta_domain_modelPackage.USER__ROLE:
			setRole((UserRole) newValue);
			return;
		case Fta_domain_modelPackage.USER__TOURNAMENTS:
			getTournaments().clear();
			getTournaments().addAll((Collection<? extends Tournament>) newValue);
			return;
		case Fta_domain_modelPackage.USER__USERROLES:
			setUserroles((UserRoles) newValue);
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
		case Fta_domain_modelPackage.USER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.USER__ROLE:
			setRole(ROLE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.USER__TOURNAMENTS:
			getTournaments().clear();
			return;
		case Fta_domain_modelPackage.USER__USERROLES:
			setUserroles((UserRoles) null);
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
		case Fta_domain_modelPackage.USER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case Fta_domain_modelPackage.USER__ROLE:
			return role != ROLE_EDEFAULT;
		case Fta_domain_modelPackage.USER__TOURNAMENTS:
			return tournaments != null && !tournaments.isEmpty();
		case Fta_domain_modelPackage.USER__USERROLES:
			return userroles != null;
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
		result.append(" (username: ");
		result.append(username);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //UserImpl
