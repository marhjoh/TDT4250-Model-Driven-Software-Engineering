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
 *   <li>{@link fta_domain_model.Match#getMatchID <em>Match ID</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getMatch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueTeams='self.teams-&gt;size() = 2 and self.teams-&gt;forAll(t1, t2 | t1 &lt;&gt; t2)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueTeams'"
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
	 * The literals are from the enumeration {@link fta_domain_model.MatchResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Result</em>' attribute.
	 * @see fta_domain_model.MatchResult
	 * @see #setMatchResult(MatchResult)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_MatchResult()
	 * @model
	 * @generated
	 */
	MatchResult getMatchResult();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getMatchResult <em>Match Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Result</em>' attribute.
	 * @see fta_domain_model.MatchResult
	 * @see #getMatchResult()
	 * @generated
	 */
	void setMatchResult(MatchResult value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Date)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_Day()
	 * @model
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
	 * Returns the value of the '<em><b>Matchrules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchrules</em>' containment reference.
	 * @see #setMatchrules(MatchRules)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_Matchrules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MatchRules getMatchrules();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getMatchrules <em>Matchrules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchrules</em>' containment reference.
	 * @see #getMatchrules()
	 * @generated
	 */
	void setMatchrules(MatchRules value);

	/**
	 * Returns the value of the '<em><b>Match ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match ID</em>' attribute.
	 * @see #setMatchID(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getMatch_MatchID()
	 * @model default="0" required="true" derived="true"
	 * @generated
	 */
	int getMatchID();

	/**
	 * Sets the value of the '{@link fta_domain_model.Match#getMatchID <em>Match ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match ID</em>' attribute.
	 * @see #getMatchID()
	 * @generated
	 */
	void setMatchID(int value);

} // Match
