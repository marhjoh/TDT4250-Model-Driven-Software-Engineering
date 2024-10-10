/**
 */
package fta_domain_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.User#getUsername <em>Username</em>}</li>
 *   <li>{@link fta_domain_model.User#getRole <em>Role</em>}</li>
 *   <li>{@link fta_domain_model.User#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link fta_domain_model.User#getUserroles <em>Userroles</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"VIEWER"</code>.
	 * The literals are from the enumeration {@link fta_domain_model.UserRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see fta_domain_model.UserRole
	 * @see #setRole(UserRole)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_Role()
	 * @model default="VIEWER"
	 * @generated
	 */
	UserRole getRole();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see fta_domain_model.UserRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(UserRole value);

	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' reference list.
	 * The list contents are of type {@link fta_domain_model.Tournament}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_Tournaments()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<Tournament> getTournaments();

	/**
	 * Returns the value of the '<em><b>Userroles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userroles</em>' reference.
	 * @see #setUserroles(UserRoles)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_Userroles()
	 * @model required="true"
	 * @generated
	 */
	UserRoles getUserroles();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#getUserroles <em>Userroles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userroles</em>' reference.
	 * @see #getUserroles()
	 * @generated
	 */
	void setUserroles(UserRoles value);

} // User
