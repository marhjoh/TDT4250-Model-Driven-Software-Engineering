/**
 */
package fta_domain_model.util;

import fta_domain_model.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage
 * @generated
 */
public class Fta_domain_modelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Fta_domain_modelValidator INSTANCE = new Fta_domain_modelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fta_domain_model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_domain_modelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Fta_domain_modelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Fta_domain_modelPackage.TEAM:
			return validateTeam((Team) value, diagnostics, context);
		case Fta_domain_modelPackage.TOURNAMENT:
			return validateTournament((Tournament) value, diagnostics, context);
		case Fta_domain_modelPackage.MATCH:
			return validateMatch((Match) value, diagnostics, context);
		case Fta_domain_modelPackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case Fta_domain_modelPackage.BRACKET:
			return validateBracket((Bracket) value, diagnostics, context);
		case Fta_domain_modelPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case Fta_domain_modelPackage.TOURNAMENT_FORMAT:
			return validateTournamentFormat((TournamentFormat) value, diagnostics, context);
		case Fta_domain_modelPackage.LEAGUE:
			return validateLeague((League) value, diagnostics, context);
		case Fta_domain_modelPackage.ROUND_ROBIN:
			return validateRoundRobin((RoundRobin) value, diagnostics, context);
		case Fta_domain_modelPackage.KNOCKOUT:
			return validateKnockout((Knockout) value, diagnostics, context);
		case Fta_domain_modelPackage.MATCH_RULES:
			return validateMatchRules((MatchRules) value, diagnostics, context);
		case Fta_domain_modelPackage.STANDARD:
			return validateStandard((Standard) value, diagnostics, context);
		case Fta_domain_modelPackage.EXTRA_TIME:
			return validateExtraTime((ExtraTime) value, diagnostics, context);
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT:
			return validatePenaltyShootout((PenaltyShootout) value, diagnostics, context);
		case Fta_domain_modelPackage.GROUP_STAGE:
			return validateGroupStage((GroupStage) value, diagnostics, context);
		case Fta_domain_modelPackage.PLAYER_STATISTICS:
			return validatePlayerStatistics((PlayerStatistics) value, diagnostics, context);
		case Fta_domain_modelPackage.DEFENDER:
			return validateDefender((Defender) value, diagnostics, context);
		case Fta_domain_modelPackage.GOALKEEPER:
			return validateGoalkeeper((Goalkeeper) value, diagnostics, context);
		case Fta_domain_modelPackage.ATTACKER:
			return validateAttacker((Attacker) value, diagnostics, context);
		case Fta_domain_modelPackage.PLAYER_POSITION:
			return validatePlayerPosition((PlayerPosition) value, diagnostics, context);
		case Fta_domain_modelPackage.TOURNAMENT_TYPE:
			return validateTournamentType((TournamentType) value, diagnostics, context);
		case Fta_domain_modelPackage.MATCH_RESULT:
			return validateMatchResult((MatchResult) value, diagnostics, context);
		case Fta_domain_modelPackage.BRACKET_SIDE:
			return validateBracketSide((BracketSide) value, diagnostics, context);
		case Fta_domain_modelPackage.FINALS_FORMAT:
			return validateFinalsFormat((FinalsFormat) value, diagnostics, context);
		case Fta_domain_modelPackage.TIE_BREAKER_RULE:
			return validateTieBreakerRule((TieBreakerRule) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(team, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournament(Tournament tournament, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tournament, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMatch_UniqueTeams(match, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueTeams constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatch_UniqueTeams(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {

        List<Team> teams = match.getTeams();
        Set<String> uniqueTeamNames = new HashSet<>();

        for (Team team : teams) {
            String teamName = team.getName();

            if (teamName != null && !uniqueTeamNames.add(teamName)) {
                 if (diagnostics != null) {
                    diagnostics.add(
                        createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
                                new Object[] { "UniqueTeams", getObjectLabel(match, context) },
                                new Object[] { match },
                                context));
                }

                return false;
            }
        }
        return true;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBracket(Bracket bracket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bracket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournamentFormat(TournamentFormat tournamentFormat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tournamentFormat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tournamentFormat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTournamentFormat_ValidTeamRange(tournamentFormat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidTeamRange constraint of '<em>Tournament Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTournamentFormat_ValidTeamRange(TournamentFormat tournamentFormat,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		// Check if maxTeams is greater than or equal to minTeams and both are greater than zero
		if (tournamentFormat.getMinTeams() <= 0 || tournamentFormat.getMaxTeams() <= 0
				|| tournamentFormat.getMaxTeams() < tournamentFormat.getMinTeams()) {

			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValidTeamRange", getObjectLabel(tournamentFormat, context) },
								new Object[] { tournamentFormat }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeague(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(league, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(league, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTournamentFormat_ValidTeamRange(league, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundRobin(RoundRobin roundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roundRobin, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(roundRobin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTournamentFormat_ValidTeamRange(roundRobin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnockout(Knockout knockout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(knockout, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(knockout, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTournamentFormat_ValidTeamRange(knockout, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchRules(MatchRules matchRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matchRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandard(Standard standard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtraTime(ExtraTime extraTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extraTime, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(extraTime, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExtraTime_ValidExtraTime(extraTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidExtraTime constraint of '<em>Extra Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateExtraTime_ValidExtraTime(ExtraTime extraTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		// Check if extraTime is true, then extraTimeDuration should be greater than zero
		if (extraTime.isExtraTime() && extraTime.getExtraTimeDuration() <= 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "ValidExtraTime", getObjectLabel(extraTime, context) },
								new Object[] { extraTime }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenaltyShootout(PenaltyShootout penaltyShootout, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penaltyShootout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupStage(GroupStage groupStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerStatistics(PlayerStatistics playerStatistics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playerStatistics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefender(Defender defender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalkeeper(Goalkeeper goalkeeper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalkeeper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttacker(Attacker attacker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attacker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerPosition(PlayerPosition playerPosition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournamentType(TournamentType tournamentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchResult(MatchResult matchResult, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBracketSide(BracketSide bracketSide, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalsFormat(FinalsFormat finalsFormat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTieBreakerRule(TieBreakerRule tieBreakerRule, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Fta_domain_modelValidator
