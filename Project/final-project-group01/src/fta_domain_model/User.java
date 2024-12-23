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
 *   <li>{@link fta_domain_model.User#getTournaments <em>Tournaments</em>}</li>
 *   <li>{@link fta_domain_model.User#isCanModifyTournament <em>Can Modify Tournament</em>}</li>
 *   <li>{@link fta_domain_model.User#isCanViewStats <em>Can View Stats</em>}</li>
 *   <li>{@link fta_domain_model.User#isCanManageTeams <em>Can Manage Teams</em>}</li>
 *   <li>{@link fta_domain_model.User#getUserID <em>User ID</em>}</li>
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
	 * Returns the value of the '<em><b>Can Modify Tournament</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Modify Tournament</em>' attribute.
	 * @see #setCanModifyTournament(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_CanModifyTournament()
	 * @model default="false"
	 * @generated
	 */
	boolean isCanModifyTournament();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#isCanModifyTournament <em>Can Modify Tournament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Modify Tournament</em>' attribute.
	 * @see #isCanModifyTournament()
	 * @generated
	 */
	void setCanModifyTournament(boolean value);

	/**
	 * Returns the value of the '<em><b>Can View Stats</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can View Stats</em>' attribute.
	 * @see #setCanViewStats(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_CanViewStats()
	 * @model default="false"
	 * @generated
	 */
	boolean isCanViewStats();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#isCanViewStats <em>Can View Stats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can View Stats</em>' attribute.
	 * @see #isCanViewStats()
	 * @generated
	 */
	void setCanViewStats(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Manage Teams</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Teams</em>' attribute.
	 * @see #setCanManageTeams(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_CanManageTeams()
	 * @model default="false"
	 * @generated
	 */
	boolean isCanManageTeams();

	/**
	 * Sets the value of the '{@link fta_domain_model.User#isCanManageTeams <em>Can Manage Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Teams</em>' attribute.
	 * @see #isCanManageTeams()
	 * @generated
	 */
	void setCanManageTeams(boolean value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see fta_domain_model.Fta_domain_modelPackage#getUser_UserID()
	 * @model default="0" id="true" required="true" changeable="false"
	 * @generated
	 */
	int getUserID();

} // User
