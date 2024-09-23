/**
 */
package fta_domain_model.impl;

import fta_domain_model.Bracket;
import fta_domain_model.DataStorage;
import fta_domain_model.Defender;
import fta_domain_model.DoubleElimination;
import fta_domain_model.ExtraTime;
import fta_domain_model.Fta_domain_modelFactory;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Goalkeeper;
import fta_domain_model.GroupStage;
import fta_domain_model.Match;
import fta_domain_model.MatchRules;
import fta_domain_model.PenaltyShootout;
import fta_domain_model.Player;
import fta_domain_model.PlayerPosition;
import fta_domain_model.PlayerStatistics;
import fta_domain_model.RoundRobin;
import fta_domain_model.SingleElimination;
import fta_domain_model.Standard;
import fta_domain_model.Team;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentFormat;
import fta_domain_model.User;
import fta_domain_model.UserRole;
import fta_domain_model.UserRoles;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fta_domain_modelPackageImpl extends EPackageImpl implements Fta_domain_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tournamentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bracketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tournamentFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEliminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundRobinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEliminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penaltyShootoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalkeeperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum playerPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fta_domain_model.Fta_domain_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fta_domain_modelPackageImpl() {
		super(eNS_URI, Fta_domain_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Fta_domain_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fta_domain_modelPackage init() {
		if (isInited)
			return (Fta_domain_modelPackage) EPackage.Registry.INSTANCE.getEPackage(Fta_domain_modelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFta_domain_modelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Fta_domain_modelPackageImpl theFta_domain_modelPackage = registeredFta_domain_modelPackage instanceof Fta_domain_modelPackageImpl
				? (Fta_domain_modelPackageImpl) registeredFta_domain_modelPackage
				: new Fta_domain_modelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFta_domain_modelPackage.createPackageContents();

		// Initialize created meta-data
		theFta_domain_modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFta_domain_modelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fta_domain_modelPackage.eNS_URI, theFta_domain_modelPackage);
		return theFta_domain_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_Name() {
		return (EAttribute) teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_TeamSize() {
		return (EAttribute) teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_Players() {
		return (EReference) teamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_ManagerName() {
		return (EAttribute) teamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeam_TotalGoals() {
		return (EAttribute) teamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTournament() {
		return tournamentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournament_Name() {
		return (EAttribute) tournamentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournament_TournamentType() {
		return (EAttribute) tournamentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTournament_Matches() {
		return (EReference) tournamentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTournament_Teams() {
		return (EReference) tournamentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTournament_Tournamentformat() {
		return (EReference) tournamentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournament_NumberOfTeams() {
		return (EAttribute) tournamentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTournament_Brackets() {
		return (EReference) tournamentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTournament_Datastorage() {
		return (EReference) tournamentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_ScoreTeam1() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_ScoreTeam2() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_MatchResult() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMatch_Day() {
		return (EAttribute) matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Teams() {
		return (EReference) matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Matchrules() {
		return (EReference) matchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Name() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Position() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlayer_Playerstatistics() {
		return (EReference) playerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_BirthDate() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Age() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayer_Number() {
		return (EAttribute) playerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBracket() {
		return bracketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBracket_Rounds() {
		return (EAttribute) bracketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBracket_BracketSide() {
		return (EAttribute) bracketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBracket_Matches() {
		return (EReference) bracketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Username() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Role() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Tournaments() {
		return (EReference) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Userroles() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTournamentFormat() {
		return tournamentFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournamentFormat_Name() {
		return (EAttribute) tournamentFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournamentFormat_MaxTeams() {
		return (EAttribute) tournamentFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournamentFormat_MinTeams() {
		return (EAttribute) tournamentFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTournamentFormat_Description() {
		return (EAttribute) tournamentFormatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleElimination() {
		return doubleEliminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleElimination_NumberOfRounds() {
		return (EAttribute) doubleEliminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleElimination_FinalsFormat() {
		return (EAttribute) doubleEliminationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoundRobin() {
		return roundRobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundRobin_PointsForWin() {
		return (EAttribute) roundRobinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundRobin_PointsForDraw() {
		return (EAttribute) roundRobinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundRobin_PointsForLoss() {
		return (EAttribute) roundRobinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundRobin_NumberOfRounds() {
		return (EAttribute) roundRobinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoundRobin_TieBreakerRule() {
		return (EAttribute) roundRobinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleElimination() {
		return singleEliminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleElimination_NumberOfRounds() {
		return (EAttribute) singleEliminationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleElimination_HasThirdPlacePlayoff() {
		return (EAttribute) singleEliminationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatchRules() {
		return matchRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMatchRules__ApplyRules() {
		return matchRulesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_TieBreaking() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_ExtraTime() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_PentaltyShootouts() {
		return (EAttribute) standardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtraTime() {
		return extraTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraTime_ExtraTime() {
		return (EAttribute) extraTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraTime_ExtraTimeDuration() {
		return (EAttribute) extraTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPenaltyShootout() {
		return penaltyShootoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPenaltyShootout_PentaltyShootouts() {
		return (EAttribute) penaltyShootoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupStage() {
		return groupStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroupStage_TieBreaking() {
		return (EAttribute) groupStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserRoles() {
		return userRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserRoles_CanModifyTournament() {
		return (EAttribute) userRolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserRoles_CanViewStats() {
		return (EAttribute) userRolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserRoles_CanManageTeams() {
		return (EAttribute) userRolesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerStatistics() {
		return playerStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStatistics_Goals() {
		return (EAttribute) playerStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStatistics_Assists() {
		return (EAttribute) playerStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStatistics_Fouls() {
		return (EAttribute) playerStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStatistics_YellowCards() {
		return (EAttribute) playerStatisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerStatistics_RedCards() {
		return (EAttribute) playerStatisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefender() {
		return defenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefender_Cleansheets() {
		return (EAttribute) defenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoalkeeper() {
		return goalkeeperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoalkeeper_Cleansheets() {
		return (EAttribute) goalkeeperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoalkeeper_Saves() {
		return (EAttribute) goalkeeperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStorage() {
		return dataStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStorage_StorageType() {
		return (EAttribute) dataStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStorage_Location() {
		return (EAttribute) dataStorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlayerPosition() {
		return playerPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserRole() {
		return userRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fta_domain_modelFactory getFta_domain_modelFactory() {
		return (Fta_domain_modelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__NAME);
		createEAttribute(teamEClass, TEAM__TEAM_SIZE);
		createEReference(teamEClass, TEAM__PLAYERS);
		createEAttribute(teamEClass, TEAM__MANAGER_NAME);
		createEAttribute(teamEClass, TEAM__TOTAL_GOALS);

		tournamentEClass = createEClass(TOURNAMENT);
		createEAttribute(tournamentEClass, TOURNAMENT__NAME);
		createEAttribute(tournamentEClass, TOURNAMENT__TOURNAMENT_TYPE);
		createEReference(tournamentEClass, TOURNAMENT__MATCHES);
		createEReference(tournamentEClass, TOURNAMENT__TEAMS);
		createEReference(tournamentEClass, TOURNAMENT__TOURNAMENTFORMAT);
		createEAttribute(tournamentEClass, TOURNAMENT__NUMBER_OF_TEAMS);
		createEReference(tournamentEClass, TOURNAMENT__BRACKETS);
		createEReference(tournamentEClass, TOURNAMENT__DATASTORAGE);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__SCORE_TEAM1);
		createEAttribute(matchEClass, MATCH__SCORE_TEAM2);
		createEAttribute(matchEClass, MATCH__MATCH_RESULT);
		createEAttribute(matchEClass, MATCH__DAY);
		createEReference(matchEClass, MATCH__TEAMS);
		createEReference(matchEClass, MATCH__MATCHRULES);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__NAME);
		createEAttribute(playerEClass, PLAYER__POSITION);
		createEReference(playerEClass, PLAYER__PLAYERSTATISTICS);
		createEAttribute(playerEClass, PLAYER__BIRTH_DATE);
		createEAttribute(playerEClass, PLAYER__AGE);
		createEAttribute(playerEClass, PLAYER__NUMBER);

		bracketEClass = createEClass(BRACKET);
		createEAttribute(bracketEClass, BRACKET__ROUNDS);
		createEAttribute(bracketEClass, BRACKET__BRACKET_SIDE);
		createEReference(bracketEClass, BRACKET__MATCHES);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__ROLE);
		createEReference(userEClass, USER__TOURNAMENTS);
		createEReference(userEClass, USER__USERROLES);

		tournamentFormatEClass = createEClass(TOURNAMENT_FORMAT);
		createEAttribute(tournamentFormatEClass, TOURNAMENT_FORMAT__NAME);
		createEAttribute(tournamentFormatEClass, TOURNAMENT_FORMAT__MAX_TEAMS);
		createEAttribute(tournamentFormatEClass, TOURNAMENT_FORMAT__MIN_TEAMS);
		createEAttribute(tournamentFormatEClass, TOURNAMENT_FORMAT__DESCRIPTION);

		doubleEliminationEClass = createEClass(DOUBLE_ELIMINATION);
		createEAttribute(doubleEliminationEClass, DOUBLE_ELIMINATION__NUMBER_OF_ROUNDS);
		createEAttribute(doubleEliminationEClass, DOUBLE_ELIMINATION__FINALS_FORMAT);

		roundRobinEClass = createEClass(ROUND_ROBIN);
		createEAttribute(roundRobinEClass, ROUND_ROBIN__POINTS_FOR_WIN);
		createEAttribute(roundRobinEClass, ROUND_ROBIN__POINTS_FOR_DRAW);
		createEAttribute(roundRobinEClass, ROUND_ROBIN__POINTS_FOR_LOSS);
		createEAttribute(roundRobinEClass, ROUND_ROBIN__NUMBER_OF_ROUNDS);
		createEAttribute(roundRobinEClass, ROUND_ROBIN__TIE_BREAKER_RULE);

		singleEliminationEClass = createEClass(SINGLE_ELIMINATION);
		createEAttribute(singleEliminationEClass, SINGLE_ELIMINATION__NUMBER_OF_ROUNDS);
		createEAttribute(singleEliminationEClass, SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF);

		matchRulesEClass = createEClass(MATCH_RULES);
		createEOperation(matchRulesEClass, MATCH_RULES___APPLY_RULES);

		standardEClass = createEClass(STANDARD);
		createEAttribute(standardEClass, STANDARD__TIE_BREAKING);
		createEAttribute(standardEClass, STANDARD__EXTRA_TIME);
		createEAttribute(standardEClass, STANDARD__PENTALTY_SHOOTOUTS);

		extraTimeEClass = createEClass(EXTRA_TIME);
		createEAttribute(extraTimeEClass, EXTRA_TIME__EXTRA_TIME);
		createEAttribute(extraTimeEClass, EXTRA_TIME__EXTRA_TIME_DURATION);

		penaltyShootoutEClass = createEClass(PENALTY_SHOOTOUT);
		createEAttribute(penaltyShootoutEClass, PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS);

		groupStageEClass = createEClass(GROUP_STAGE);
		createEAttribute(groupStageEClass, GROUP_STAGE__TIE_BREAKING);

		userRolesEClass = createEClass(USER_ROLES);
		createEAttribute(userRolesEClass, USER_ROLES__CAN_MODIFY_TOURNAMENT);
		createEAttribute(userRolesEClass, USER_ROLES__CAN_VIEW_STATS);
		createEAttribute(userRolesEClass, USER_ROLES__CAN_MANAGE_TEAMS);

		playerStatisticsEClass = createEClass(PLAYER_STATISTICS);
		createEAttribute(playerStatisticsEClass, PLAYER_STATISTICS__GOALS);
		createEAttribute(playerStatisticsEClass, PLAYER_STATISTICS__ASSISTS);
		createEAttribute(playerStatisticsEClass, PLAYER_STATISTICS__FOULS);
		createEAttribute(playerStatisticsEClass, PLAYER_STATISTICS__YELLOW_CARDS);
		createEAttribute(playerStatisticsEClass, PLAYER_STATISTICS__RED_CARDS);

		defenderEClass = createEClass(DEFENDER);
		createEAttribute(defenderEClass, DEFENDER__CLEANSHEETS);

		goalkeeperEClass = createEClass(GOALKEEPER);
		createEAttribute(goalkeeperEClass, GOALKEEPER__CLEANSHEETS);
		createEAttribute(goalkeeperEClass, GOALKEEPER__SAVES);

		dataStorageEClass = createEClass(DATA_STORAGE);
		createEAttribute(dataStorageEClass, DATA_STORAGE__STORAGE_TYPE);
		createEAttribute(dataStorageEClass, DATA_STORAGE__LOCATION);

		// Create enums
		playerPositionEEnum = createEEnum(PLAYER_POSITION);
		userRoleEEnum = createEEnum(USER_ROLE);

		// Create data types
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doubleEliminationEClass.getESuperTypes().add(this.getTournamentFormat());
		roundRobinEClass.getESuperTypes().add(this.getTournamentFormat());
		singleEliminationEClass.getESuperTypes().add(this.getTournamentFormat());
		standardEClass.getESuperTypes().add(this.getMatchRules());
		extraTimeEClass.getESuperTypes().add(this.getMatchRules());
		penaltyShootoutEClass.getESuperTypes().add(this.getMatchRules());
		groupStageEClass.getESuperTypes().add(this.getMatchRules());
		defenderEClass.getESuperTypes().add(this.getPlayerStatistics());
		goalkeeperEClass.getESuperTypes().add(this.getPlayerStatistics());

		// Initialize classes, features, and operations; add parameters
		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Team.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_TeamSize(), ecorePackage.getEInt(), "teamSize", null, 0, 1, Team.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Players(), this.getPlayer(), null, "players", null, 1, -1, Team.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getTeam_ManagerName(), ecorePackage.getEString(), "managerName", null, 0, 1, Team.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeam_TotalGoals(), ecorePackage.getEInt(), "totalGoals", null, 0, 1, Team.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tournamentEClass, Tournament.class, "Tournament", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTournament_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tournament.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_TournamentType(), ecorePackage.getEString(), "tournamentType", null, 0, 1,
				Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Matches(), this.getMatch(), null, "matches", null, 0, -1, Tournament.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Teams(), this.getTeam(), null, "teams", null, 0, -1, Tournament.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTournament_Tournamentformat(), this.getTournamentFormat(), null, "tournamentformat", null, 1,
				1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_NumberOfTeams(), ecorePackage.getEInt(), "numberOfTeams", null, 0, 1,
				Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Brackets(), this.getBracket(), null, "brackets", null, 1, 1, Tournament.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Datastorage(), this.getDataStorage(), null, "datastorage", null, 1, 1,
				Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_ScoreTeam1(), ecorePackage.getEInt(), "scoreTeam1", null, 0, 1, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_ScoreTeam2(), ecorePackage.getEInt(), "scoreTeam2", null, 0, 1, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_MatchResult(), ecorePackage.getEString(), "matchResult", null, 0, 1, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Day(), this.getDate(), "day", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Teams(), this.getTeam(), null, "teams", null, 2, 2, Match.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMatch_Matchrules(), this.getMatchRules(), null, "matchrules", null, 1, 1, Match.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Position(), this.getPlayerPosition(), "position", "MIDFIELDER", 0, 1, Player.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_Playerstatistics(), this.getPlayerStatistics(), null, "playerstatistics", null, 1, 1,
				Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_BirthDate(), this.getDate(), "birthDate", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bracketEClass, Bracket.class, "Bracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBracket_Rounds(), ecorePackage.getEInt(), "rounds", null, 0, 1, Bracket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBracket_BracketSide(), ecorePackage.getEString(), "bracketSide", null, 0, 1, Bracket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBracket_Matches(), this.getMatch(), null, "matches", null, 0, -1, Bracket.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Role(), this.getUserRole(), "role", "VIEWER", 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Tournaments(), this.getTournament(), null, "tournaments", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Userroles(), this.getUserRoles(), null, "userroles", null, 1, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tournamentFormatEClass, TournamentFormat.class, "TournamentFormat", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTournamentFormat_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				TournamentFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournamentFormat_MaxTeams(), ecorePackage.getEInt(), "maxTeams", null, 0, 1,
				TournamentFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournamentFormat_MinTeams(), ecorePackage.getEInt(), "minTeams", null, 0, 1,
				TournamentFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournamentFormat_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				TournamentFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(doubleEliminationEClass, DoubleElimination.class, "DoubleElimination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleElimination_NumberOfRounds(), ecorePackage.getEInt(), "numberOfRounds", null, 0, 1,
				DoubleElimination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleElimination_FinalsFormat(), ecorePackage.getEString(), "finalsFormat", null, 0, 1,
				DoubleElimination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roundRobinEClass, RoundRobin.class, "RoundRobin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundRobin_PointsForWin(), ecorePackage.getEInt(), "pointsForWin", null, 0, 1,
				RoundRobin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundRobin_PointsForDraw(), ecorePackage.getEInt(), "pointsForDraw", null, 0, 1,
				RoundRobin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundRobin_PointsForLoss(), ecorePackage.getEInt(), "pointsForLoss", null, 0, 1,
				RoundRobin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundRobin_NumberOfRounds(), ecorePackage.getEInt(), "numberOfRounds", null, 0, 1,
				RoundRobin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundRobin_TieBreakerRule(), ecorePackage.getEString(), "tieBreakerRule", "", 0, 1,
				RoundRobin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(singleEliminationEClass, SingleElimination.class, "SingleElimination", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleElimination_NumberOfRounds(), ecorePackage.getEInt(), "numberOfRounds", null, 0, 1,
				SingleElimination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleElimination_HasThirdPlacePlayoff(), ecorePackage.getEBoolean(), "hasThirdPlacePlayoff",
				null, 0, 1, SingleElimination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchRulesEClass, MatchRules.class, "MatchRules", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMatchRules__ApplyRules(), null, "applyRules", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandard_TieBreaking(), ecorePackage.getEBoolean(), "tieBreaking", "false", 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_ExtraTime(), ecorePackage.getEBoolean(), "extraTime", "false", 0, 1, Standard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_PentaltyShootouts(), ecorePackage.getEBoolean(), "pentaltyShootouts", "false", 0, 1,
				Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(extraTimeEClass, ExtraTime.class, "ExtraTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraTime_ExtraTime(), ecorePackage.getEBoolean(), "extraTime", null, 0, 1, ExtraTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraTime_ExtraTimeDuration(), ecorePackage.getEInt(), "extraTimeDuration", null, 0, 1,
				ExtraTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(penaltyShootoutEClass, PenaltyShootout.class, "PenaltyShootout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPenaltyShootout_PentaltyShootouts(), ecorePackage.getEBoolean(), "pentaltyShootouts", "true",
				0, 1, PenaltyShootout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupStageEClass, GroupStage.class, "GroupStage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupStage_TieBreaking(), ecorePackage.getEBoolean(), "tieBreaking", "true", 0, 1,
				GroupStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(userRolesEClass, UserRoles.class, "UserRoles", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserRoles_CanModifyTournament(), ecorePackage.getEBoolean(), "canModifyTournament", null, 0,
				1, UserRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRoles_CanViewStats(), ecorePackage.getEBoolean(), "canViewStats", null, 0, 1,
				UserRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRoles_CanManageTeams(), ecorePackage.getEBoolean(), "canManageTeams", null, 0, 1,
				UserRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(playerStatisticsEClass, PlayerStatistics.class, "PlayerStatistics", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerStatistics_Goals(), ecorePackage.getEInt(), "goals", null, 0, 1, PlayerStatistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStatistics_Assists(), ecorePackage.getEInt(), "assists", null, 0, 1,
				PlayerStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStatistics_Fouls(), ecorePackage.getEInt(), "fouls", null, 0, 1, PlayerStatistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStatistics_YellowCards(), ecorePackage.getEInt(), "yellowCards", null, 0, 1,
				PlayerStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerStatistics_RedCards(), ecorePackage.getEInt(), "redCards", null, 0, 1,
				PlayerStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(defenderEClass, Defender.class, "Defender", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefender_Cleansheets(), ecorePackage.getEInt(), "cleansheets", null, 0, 1, Defender.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalkeeperEClass, Goalkeeper.class, "Goalkeeper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoalkeeper_Cleansheets(), ecorePackage.getEInt(), "cleansheets", null, 0, 1, Goalkeeper.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoalkeeper_Saves(), ecorePackage.getEInt(), "saves", null, 0, 1, Goalkeeper.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStorageEClass, DataStorage.class, "DataStorage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStorage_StorageType(), ecorePackage.getEString(), "storageType", null, 0, 1,
				DataStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataStorage_Location(), ecorePackage.getEString(), "location", null, 0, 1, DataStorage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(playerPositionEEnum, PlayerPosition.class, "PlayerPosition");
		addEEnumLiteral(playerPositionEEnum, PlayerPosition.GOALKEEPER);
		addEEnumLiteral(playerPositionEEnum, PlayerPosition.DEFENDER);
		addEEnumLiteral(playerPositionEEnum, PlayerPosition.MIDFIELDER);
		addEEnumLiteral(playerPositionEEnum, PlayerPosition.ATTACKER);

		initEEnum(userRoleEEnum, UserRole.class, "UserRole");
		addEEnumLiteral(userRoleEEnum, UserRole.ADMIN);
		addEEnumLiteral(userRoleEEnum, UserRole.MANAGER);
		addEEnumLiteral(userRoleEEnum, UserRole.VIEWER);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teamConstraint
		createTeamConstraintAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teamConstraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeamConstraintAnnotations() {
		String source = "teamConstraint";
		addAnnotation(teamEClass, source, new String[] { "teamSizeConstraint", "self.players->size() >= 2",
				"teamTotalGoalsCons", "self.players->collect(player | player.playerstatistics.goals)->sum()" });
	}

} //Fta_domain_modelPackageImpl
