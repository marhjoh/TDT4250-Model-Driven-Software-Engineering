/**
 */
package fta_domain_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Team#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.Team#getTeamSize <em>Team Size</em>}</li>
 *   <li>{@link fta_domain_model.Team#getPlayers <em>Players</em>}</li>
 *   <li>{@link fta_domain_model.Team#getManagerName <em>Manager Name</em>}</li>
 *   <li>{@link fta_domain_model.Team#getTotalGoals <em>Total Goals</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getTeam()
 * @model annotation="teamConstraint teamSizeConstraint='self.players-&gt;size() &gt;= 2' teamTotalGoalsCons='self.players-&gt;collect(player | player.playerstatistics.goals)-&gt;sum()'"
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_domain_model.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Team Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Size</em>' attribute.
	 * @see #setTeamSize(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTeam_TeamSize()
	 * @model
	 * @generated
	 */
	int getTeamSize();

	/**
	 * Sets the value of the '{@link fta_domain_model.Team#getTeamSize <em>Team Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Size</em>' attribute.
	 * @see #getTeamSize()
	 * @generated
	 */
	void setTeamSize(int value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link fta_domain_model.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTeam_Players()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Manager Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Name</em>' attribute.
	 * @see #setManagerName(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTeam_ManagerName()
	 * @model
	 * @generated
	 */
	String getManagerName();

	/**
	 * Sets the value of the '{@link fta_domain_model.Team#getManagerName <em>Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Name</em>' attribute.
	 * @see #getManagerName()
	 * @generated
	 */
	void setManagerName(String value);

	/**
	 * Returns the value of the '<em><b>Total Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Goals</em>' attribute.
	 * @see #setTotalGoals(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTeam_TotalGoals()
	 * @model derived="true"
	 * @generated
	 */
	int getTotalGoals();

	/**
	 * Sets the value of the '{@link fta_domain_model.Team#getTotalGoals <em>Total Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Goals</em>' attribute.
	 * @see #getTotalGoals()
	 * @generated
	 */
	void setTotalGoals(int value);

} // Team
