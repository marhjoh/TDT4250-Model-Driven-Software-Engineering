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
 *   <li>{@link fta_domain_model.Tournament#getMatches <em>Matches</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getTournamentformat <em>Tournamentformat</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getNumberOfTeams <em>Number Of Teams</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link fta_domain_model.Tournament#getDatastorage <em>Datastorage</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournament Type</em>' attribute.
	 * @see #setTournamentType(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_TournamentType()
	 * @model
	 * @generated
	 */
	String getTournamentType();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getTournamentType <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournament Type</em>' attribute.
	 * @see #getTournamentType()
	 * @generated
	 */
	void setTournamentType(String value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link fta_domain_model.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link fta_domain_model.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Teams()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Tournamentformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournamentformat</em>' reference.
	 * @see #setTournamentformat(TournamentFormat)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Tournamentformat()
	 * @model required="true"
	 * @generated
	 */
	TournamentFormat getTournamentformat();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getTournamentformat <em>Tournamentformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournamentformat</em>' reference.
	 * @see #getTournamentformat()
	 * @generated
	 */
	void setTournamentformat(TournamentFormat value);

	/**
	 * Returns the value of the '<em><b>Number Of Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Teams</em>' attribute.
	 * @see #setNumberOfTeams(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_NumberOfTeams()
	 * @model
	 * @generated
	 */
	int getNumberOfTeams();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getNumberOfTeams <em>Number Of Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Teams</em>' attribute.
	 * @see #getNumberOfTeams()
	 * @generated
	 */
	void setNumberOfTeams(int value);

	/**
	 * Returns the value of the '<em><b>Brackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brackets</em>' containment reference.
	 * @see #setBrackets(Bracket)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Brackets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bracket getBrackets();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getBrackets <em>Brackets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brackets</em>' containment reference.
	 * @see #getBrackets()
	 * @generated
	 */
	void setBrackets(Bracket value);

	/**
	 * Returns the value of the '<em><b>Datastorage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastorage</em>' reference.
	 * @see #setDatastorage(DataStorage)
	 * @see fta_domain_model.Fta_domain_modelPackage#getTournament_Datastorage()
	 * @model required="true"
	 * @generated
	 */
	DataStorage getDatastorage();

	/**
	 * Sets the value of the '{@link fta_domain_model.Tournament#getDatastorage <em>Datastorage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastorage</em>' reference.
	 * @see #getDatastorage()
	 * @generated
	 */
	void setDatastorage(DataStorage value);

} // Tournament
