/**
 */
package fta_domain_model.util;

import fta_domain_model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage
 * @generated
 */
public class Fta_domain_modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fta_domain_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_domain_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Fta_domain_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Fta_domain_modelPackage.TEAM: {
			Team team = (Team) theEObject;
			T result = caseTeam(team);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.TOURNAMENT: {
			Tournament tournament = (Tournament) theEObject;
			T result = caseTournament(tournament);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.MATCH: {
			Match match = (Match) theEObject;
			T result = caseMatch(match);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.PLAYER: {
			Player player = (Player) theEObject;
			T result = casePlayer(player);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.BRACKET: {
			Bracket bracket = (Bracket) theEObject;
			T result = caseBracket(bracket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT: {
			TournamentFormat tournamentFormat = (TournamentFormat) theEObject;
			T result = caseTournamentFormat(tournamentFormat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.LEAGUE: {
			League league = (League) theEObject;
			T result = caseLeague(league);
			if (result == null)
				result = caseTournamentFormat(league);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.ROUND_ROBIN: {
			RoundRobin roundRobin = (RoundRobin) theEObject;
			T result = caseRoundRobin(roundRobin);
			if (result == null)
				result = caseTournamentFormat(roundRobin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.KNOCKOUT: {
			Knockout knockout = (Knockout) theEObject;
			T result = caseKnockout(knockout);
			if (result == null)
				result = caseTournamentFormat(knockout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.MATCH_RULES: {
			MatchRules matchRules = (MatchRules) theEObject;
			T result = caseMatchRules(matchRules);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.STANDARD: {
			Standard standard = (Standard) theEObject;
			T result = caseStandard(standard);
			if (result == null)
				result = caseMatchRules(standard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.EXTRA_TIME: {
			ExtraTime extraTime = (ExtraTime) theEObject;
			T result = caseExtraTime(extraTime);
			if (result == null)
				result = caseMatchRules(extraTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT: {
			PenaltyShootout penaltyShootout = (PenaltyShootout) theEObject;
			T result = casePenaltyShootout(penaltyShootout);
			if (result == null)
				result = caseMatchRules(penaltyShootout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.GROUP_STAGE: {
			GroupStage groupStage = (GroupStage) theEObject;
			T result = caseGroupStage(groupStage);
			if (result == null)
				result = caseMatchRules(groupStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.PLAYER_STATISTICS: {
			PlayerStatistics playerStatistics = (PlayerStatistics) theEObject;
			T result = casePlayerStatistics(playerStatistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.DEFENDER: {
			Defender defender = (Defender) theEObject;
			T result = caseDefender(defender);
			if (result == null)
				result = casePlayerStatistics(defender);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.GOALKEEPER: {
			Goalkeeper goalkeeper = (Goalkeeper) theEObject;
			T result = caseGoalkeeper(goalkeeper);
			if (result == null)
				result = casePlayerStatistics(goalkeeper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fta_domain_modelPackage.ATTACKER: {
			Attacker attacker = (Attacker) theEObject;
			T result = caseAttacker(attacker);
			if (result == null)
				result = casePlayerStatistics(attacker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeam(Team object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tournament</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tournament</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTournament(Tournament object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracket(Bracket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tournament Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tournament Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTournamentFormat(TournamentFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>League</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeague(League object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Robin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundRobin(RoundRobin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knockout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knockout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnockout(Knockout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchRules(MatchRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraTime(ExtraTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Penalty Shootout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Penalty Shootout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePenaltyShootout(PenaltyShootout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupStage(GroupStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerStatistics(PlayerStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefender(Defender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goalkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goalkeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalkeeper(Goalkeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacker(Attacker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Fta_domain_modelSwitch
