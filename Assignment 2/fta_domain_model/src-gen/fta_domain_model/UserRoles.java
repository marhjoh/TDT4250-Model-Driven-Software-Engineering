/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.UserRoles#isCanModifyTournament <em>Can Modify Tournament</em>}</li>
 *   <li>{@link fta_domain_model.UserRoles#isCanViewStats <em>Can View Stats</em>}</li>
 *   <li>{@link fta_domain_model.UserRoles#isCanManageTeams <em>Can Manage Teams</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getUserRoles()
 * @model
 * @generated
 */
public interface UserRoles extends EObject {
	/**
	 * Returns the value of the '<em><b>Can Modify Tournament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Modify Tournament</em>' attribute.
	 * @see #setCanModifyTournament(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUserRoles_CanModifyTournament()
	 * @model
	 * @generated
	 */
	boolean isCanModifyTournament();

	/**
	 * Sets the value of the '{@link fta_domain_model.UserRoles#isCanModifyTournament <em>Can Modify Tournament</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Modify Tournament</em>' attribute.
	 * @see #isCanModifyTournament()
	 * @generated
	 */
	void setCanModifyTournament(boolean value);

	/**
	 * Returns the value of the '<em><b>Can View Stats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can View Stats</em>' attribute.
	 * @see #setCanViewStats(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUserRoles_CanViewStats()
	 * @model
	 * @generated
	 */
	boolean isCanViewStats();

	/**
	 * Sets the value of the '{@link fta_domain_model.UserRoles#isCanViewStats <em>Can View Stats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can View Stats</em>' attribute.
	 * @see #isCanViewStats()
	 * @generated
	 */
	void setCanViewStats(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Manage Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Manage Teams</em>' attribute.
	 * @see #setCanManageTeams(boolean)
	 * @see fta_domain_model.Fta_domain_modelPackage#getUserRoles_CanManageTeams()
	 * @model
	 * @generated
	 */
	boolean isCanManageTeams();

	/**
	 * Sets the value of the '{@link fta_domain_model.UserRoles#isCanManageTeams <em>Can Manage Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Manage Teams</em>' attribute.
	 * @see #isCanManageTeams()
	 * @generated
	 */
	void setCanManageTeams(boolean value);

} // UserRoles
