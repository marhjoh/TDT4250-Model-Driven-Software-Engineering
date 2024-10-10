/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Match;
import fta_domain_model.MatchRules;
import fta_domain_model.Team;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getScoreTeam1 <em>Score Team1</em>}</li>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getScoreTeam2 <em>Score Team2</em>}</li>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getMatchResult <em>Match Result</em>}</li>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getDay <em>Day</em>}</li>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.MatchImpl#getMatchrules <em>Matchrules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getScoreTeam1() <em>Score Team1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreTeam1()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_TEAM1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScoreTeam1() <em>Score Team1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreTeam1()
	 * @generated
	 * @ordered
	 */
	protected int scoreTeam1 = SCORE_TEAM1_EDEFAULT;

	/**
	 * The default value of the '{@link #getScoreTeam2() <em>Score Team2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreTeam2()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_TEAM2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScoreTeam2() <em>Score Team2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreTeam2()
	 * @generated
	 * @ordered
	 */
	protected int scoreTeam2 = SCORE_TEAM2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchResult() <em>Match Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchResult()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchResult() <em>Match Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchResult()
	 * @generated
	 * @ordered
	 */
	protected String matchResult = MATCH_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Date DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Date day = DAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getMatchrules() <em>Matchrules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchrules()
	 * @generated
	 * @ordered
	 */
	protected MatchRules matchrules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScoreTeam1() {
		return scoreTeam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScoreTeam1(int newScoreTeam1) {
		int oldScoreTeam1 = scoreTeam1;
		scoreTeam1 = newScoreTeam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.MATCH__SCORE_TEAM1,
					oldScoreTeam1, scoreTeam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScoreTeam2() {
		return scoreTeam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScoreTeam2(int newScoreTeam2) {
		int oldScoreTeam2 = scoreTeam2;
		scoreTeam2 = newScoreTeam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.MATCH__SCORE_TEAM2,
					oldScoreTeam2, scoreTeam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMatchResult() {
		return matchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchResult(String newMatchResult) {
		String oldMatchResult = matchResult;
		matchResult = newMatchResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.MATCH__MATCH_RESULT,
					oldMatchResult, matchResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(Date newDay) {
		Date oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.MATCH__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectEList<Team>(Team.class, this, Fta_domain_modelPackage.MATCH__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchRules getMatchrules() {
		if (matchrules != null && matchrules.eIsProxy()) {
			InternalEObject oldMatchrules = (InternalEObject) matchrules;
			matchrules = (MatchRules) eResolveProxy(oldMatchrules);
			if (matchrules != oldMatchrules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fta_domain_modelPackage.MATCH__MATCHRULES,
							oldMatchrules, matchrules));
			}
		}
		return matchrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchRules basicGetMatchrules() {
		return matchrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchrules(MatchRules newMatchrules) {
		MatchRules oldMatchrules = matchrules;
		matchrules = newMatchrules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.MATCH__MATCHRULES,
					oldMatchrules, matchrules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM1:
			return getScoreTeam1();
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM2:
			return getScoreTeam2();
		case Fta_domain_modelPackage.MATCH__MATCH_RESULT:
			return getMatchResult();
		case Fta_domain_modelPackage.MATCH__DAY:
			return getDay();
		case Fta_domain_modelPackage.MATCH__TEAMS:
			return getTeams();
		case Fta_domain_modelPackage.MATCH__MATCHRULES:
			if (resolve)
				return getMatchrules();
			return basicGetMatchrules();
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
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM1:
			setScoreTeam1((Integer) newValue);
			return;
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM2:
			setScoreTeam2((Integer) newValue);
			return;
		case Fta_domain_modelPackage.MATCH__MATCH_RESULT:
			setMatchResult((String) newValue);
			return;
		case Fta_domain_modelPackage.MATCH__DAY:
			setDay((Date) newValue);
			return;
		case Fta_domain_modelPackage.MATCH__TEAMS:
			getTeams().clear();
			getTeams().addAll((Collection<? extends Team>) newValue);
			return;
		case Fta_domain_modelPackage.MATCH__MATCHRULES:
			setMatchrules((MatchRules) newValue);
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
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM1:
			setScoreTeam1(SCORE_TEAM1_EDEFAULT);
			return;
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM2:
			setScoreTeam2(SCORE_TEAM2_EDEFAULT);
			return;
		case Fta_domain_modelPackage.MATCH__MATCH_RESULT:
			setMatchResult(MATCH_RESULT_EDEFAULT);
			return;
		case Fta_domain_modelPackage.MATCH__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case Fta_domain_modelPackage.MATCH__TEAMS:
			getTeams().clear();
			return;
		case Fta_domain_modelPackage.MATCH__MATCHRULES:
			setMatchrules((MatchRules) null);
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
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM1:
			return scoreTeam1 != SCORE_TEAM1_EDEFAULT;
		case Fta_domain_modelPackage.MATCH__SCORE_TEAM2:
			return scoreTeam2 != SCORE_TEAM2_EDEFAULT;
		case Fta_domain_modelPackage.MATCH__MATCH_RESULT:
			return MATCH_RESULT_EDEFAULT == null ? matchResult != null : !MATCH_RESULT_EDEFAULT.equals(matchResult);
		case Fta_domain_modelPackage.MATCH__DAY:
			return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
		case Fta_domain_modelPackage.MATCH__TEAMS:
			return teams != null && !teams.isEmpty();
		case Fta_domain_modelPackage.MATCH__MATCHRULES:
			return matchrules != null;
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
		result.append(" (scoreTeam1: ");
		result.append(scoreTeam1);
		result.append(", scoreTeam2: ");
		result.append(scoreTeam2);
		result.append(", matchResult: ");
		result.append(matchResult);
		result.append(", day: ");
		result.append(day);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
