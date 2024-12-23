/**
 */
package fta_domain_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Tournament#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getTournamentType <em>Tournament Type</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getTournamentformat <em>Tournamentformat</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getNumberOfTeams <em>Number Of Teams</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getBrackets <em>Brackets</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tournament Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_domain_model.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament Type</em>' attribute.
	 * @see fta_domain_model.TournamentType
	 * @see #setTournamentType(TournamentType)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_TournamentType()
	 * @model
	 * @generated
	 */
	TournamentType getTournamentType();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getTournamentType <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament Type</em>' attribute.
	 * @see fta_domain_model.TournamentType
	 * @see #getTournamentType()
	 * @generated
	 */
	void setTournamentType(TournamentType value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link fta_domain_model.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Teams()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Tournamentformat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournamentformat</em>' containment reference.
	 * @see #setTournamentformat(TournamentFormat)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Tournamentformat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TournamentFormat getTournamentformat();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getTournamentformat <em>Tournamentformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournamentformat</em>' containment reference.
	 * @see #getTournamentformat()
	 * @generated
	 */
	void setTournamentformat(TournamentFormat value);

	/**
	 * Returns the value of the '<em><b>Number Of Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Teams</em>' attribute.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_NumberOfTeams()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfTeams();

	/**
	 * Returns the value of the '<em><b>Brackets</b></em>' containment reference list.
	 * The list contents are of type {@link fta_domain_model.Bracket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brackets</em>' containment reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Brackets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Bracket> getBrackets();

} // Tournament
