/**
 */
package fta_domain_model.impl;

import fta_domain_model.*;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fta_domain_modelFactoryImpl extends EFactoryImpl implements Fta_domain_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fta_domain_modelFactory init() {
		try {
			Fta_domain_modelFactory theFta_domain_modelFactory = (Fta_domain_modelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Fta_domain_modelPackage.eNS_URI);
			if (theFta_domain_modelFactory != null) {
				return theFta_domain_modelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fta_domain_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_domain_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Fta_domain_modelPackage.TEAM:
			return createTeam();
		case Fta_domain_modelPackage.TOURNAMENT:
			return createTournament();
		case Fta_domain_modelPackage.MATCH:
			return createMatch();
		case Fta_domain_modelPackage.PLAYER:
			return createPlayer();
		case Fta_domain_modelPackage.BRACKET:
			return createBracket();
		case Fta_domain_modelPackage.USER:
			return createUser();
		case Fta_domain_modelPackage.DOUBLE_ELIMINATION:
			return createDoubleElimination();
		case Fta_domain_modelPackage.ROUND_ROBIN:
			return createRoundRobin();
		case Fta_domain_modelPackage.SINGLE_ELIMINATION:
			return createSingleElimination();
		case Fta_domain_modelPackage.STANDARD:
			return createStandard();
		case Fta_domain_modelPackage.EXTRA_TIME:
			return createExtraTime();
		case Fta_domain_modelPackage.PENALTY_SHOOTOUT:
			return createPenaltyShootout();
		case Fta_domain_modelPackage.GROUP_STAGE:
			return createGroupStage();
		case Fta_domain_modelPackage.USER_ROLES:
			return createUserRoles();
		case Fta_domain_modelPackage.DEFENDER:
			return createDefender();
		case Fta_domain_modelPackage.GOALKEEPER:
			return createGoalkeeper();
		case Fta_domain_modelPackage.DATA_STORAGE:
			return createDataStorage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Fta_domain_modelPackage.PLAYER_POSITION:
			return createPlayerPositionFromString(eDataType, initialValue);
		case Fta_domain_modelPackage.USER_ROLE:
			return createUserRoleFromString(eDataType, initialValue);
		case Fta_domain_modelPackage.DATE:
			return createDateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Fta_domain_modelPackage.PLAYER_POSITION:
			return convertPlayerPositionToString(eDataType, instanceValue);
		case Fta_domain_modelPackage.USER_ROLE:
			return convertUserRoleToString(eDataType, instanceValue);
		case Fta_domain_modelPackage.DATE:
			return convertDateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tournament createTournament() {
		TournamentImpl tournament = new TournamentImpl();
		return tournament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bracket createBracket() {
		BracketImpl bracket = new BracketImpl();
		return bracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleElimination createDoubleElimination() {
		DoubleEliminationImpl doubleElimination = new DoubleEliminationImpl();
		return doubleElimination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoundRobin createRoundRobin() {
		RoundRobinImpl roundRobin = new RoundRobinImpl();
		return roundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElimination createSingleElimination() {
		SingleEliminationImpl singleElimination = new SingleEliminationImpl();
		return singleElimination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtraTime createExtraTime() {
		ExtraTimeImpl extraTime = new ExtraTimeImpl();
		return extraTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PenaltyShootout createPenaltyShootout() {
		PenaltyShootoutImpl penaltyShootout = new PenaltyShootoutImpl();
		return penaltyShootout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupStage createGroupStage() {
		GroupStageImpl groupStage = new GroupStageImpl();
		return groupStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserRoles createUserRoles() {
		UserRolesImpl userRoles = new UserRolesImpl();
		return userRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defender createDefender() {
		DefenderImpl defender = new DefenderImpl();
		return defender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goalkeeper createGoalkeeper() {
		GoalkeeperImpl goalkeeper = new GoalkeeperImpl();
		return goalkeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStorage createDataStorage() {
		DataStorageImpl dataStorage = new DataStorageImpl();
		return dataStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerPosition createPlayerPositionFromString(EDataType eDataType, String initialValue) {
		PlayerPosition result = PlayerPosition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRole createUserRoleFromString(EDataType eDataType, String initialValue) {
		UserRole result = UserRole.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fta_domain_modelPackage getFta_domain_modelPackage() {
		return (Fta_domain_modelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fta_domain_modelPackage getPackage() {
		return Fta_domain_modelPackage.eINSTANCE;
	}

	@Override
	public PlayerStatistics createPlayerStatistics() {
		// TODO Auto-generated method stub
		return new GoalkeeperImpl();
	}

	@Override
	public PlayerStatistics createGoalkeeperStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

} //Fta_domain_modelFactoryImpl
