/**
 */
package fta_domain_model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Match#getScoreTeam1 <em>Score Team1</em>}</li>
 *   <li>{@link fta_domain_model.Match#getScoreTeam2 <em>Score Team2</em>}</li>
 *   <li>{@link fta_domain_model.Match#getMatchResult <em>Match Result</em>}</li>
 *   <li>{@link fta_domain_model.Match#getDay <em>Day</em>}</li>
 *   <li>{@link fta_domain_model.Match#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.Match#getMatchrules <em>Matchrules</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Score Team1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Team1</em>' attribute.
	 * @see #setScoreTeam1(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_ScoreTeam1()
	 * @model
	 * @generated
	 */
	int getScoreTeam1();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getScoreTeam1 <em>Score Team1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Team1</em>' attribute.
	 * @see #getScoreTeam1()
	 * @generated
	 */
	void setScoreTeam1(int value);

	/**
	 * Returns the value of the '<em><b>Score Team2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Team2</em>' attribute.
	 * @see #setScoreTeam2(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_ScoreTeam2()
	 * @model
	 * @generated
	 */
	int getScoreTeam2();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getScoreTeam2 <em>Score Team2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Team2</em>' attribute.
	 * @see #getScoreTeam2()
	 * @generated
	 */
	void setScoreTeam2(int value);

	/**
	 * Returns the value of the '<em><b>Match Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Result</em>' attribute.
	 * @see #setMatchResult(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_MatchResult()
	 * @model
	 * @generated
	 */
	String getMatchResult();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getMatchResult <em>Match Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Result</em>' attribute.
	 * @see #getMatchResult()
	 * @generated
	 */
	void setMatchResult(String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Date)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_Day()
	 * @model dataType="fta_domain_model.Date"
	 * @generated
	 */
	Date getDay();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Date value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' reference list.
	 * The list contents are of type {@link fta_domain_model.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' reference list.
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_Teams()
	 * @model resolveProxies="false" lower="2" upper="2"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Matchrules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchrules</em>' reference.
	 * @see #setMatchrules(MatchRules)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_Matchrules()
	 * @model required="true"
	 * @generated
	 */
	MatchRules getMatchrules();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getMatchrules <em>Matchrules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchrules</em>' reference.
	 * @see #getMatchrules()
	 * @generated
	 */
	void setMatchrules(MatchRules value);

} // Match
