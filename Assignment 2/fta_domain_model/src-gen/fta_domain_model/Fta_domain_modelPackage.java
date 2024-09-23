/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Fta_domain_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fta_domain_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fta_domain_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fta_domain_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_domain_modelPackage eINSTANCE = fta_domain_model.impl.Fta_domain_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.TeamImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Team Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TEAM_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 2;

	/**
	 * The feature id for the '<em><b>Manager Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MANAGER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Total Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TOTAL_GOALS = 4;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.TournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.TournamentImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTournament()
	 * @generated
	 */
	int TOURNAMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tournament Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__TOURNAMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__MATCHES = 2;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__TEAMS = 3;

	/**
	 * The feature id for the '<em><b>Tournamentformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__TOURNAMENTFORMAT = 4;

	/**
	 * The feature id for the '<em><b>Number Of Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__NUMBER_OF_TEAMS = 5;

	/**
	 * The feature id for the '<em><b>Brackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__BRACKETS = 6;

	/**
	 * The feature id for the '<em><b>Datastorage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__DATASTORAGE = 7;

	/**
	 * The number of structural features of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.MatchImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 2;

	/**
	 * The feature id for the '<em><b>Score Team1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORE_TEAM1 = 0;

	/**
	 * The feature id for the '<em><b>Score Team2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__SCORE_TEAM2 = 1;

	/**
	 * The feature id for the '<em><b>Match Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DAY = 3;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEAMS = 4;

	/**
	 * The feature id for the '<em><b>Matchrules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCHRULES = 5;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.PlayerImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Playerstatistics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYERSTATISTICS = 2;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__BIRTH_DATE = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGE = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NUMBER = 5;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.BracketImpl <em>Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.BracketImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getBracket()
	 * @generated
	 */
	int BRACKET = 4;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET__ROUNDS = 0;

	/**
	 * The feature id for the '<em><b>Bracket Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET__BRACKET_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET__MATCHES = 2;

	/**
	 * The number of structural features of the '<em>Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.UserImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TOURNAMENTS = 2;

	/**
	 * The feature id for the '<em><b>Userroles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERROLES = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.TournamentFormatImpl <em>Tournament Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.TournamentFormatImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTournamentFormat()
	 * @generated
	 */
	int TOURNAMENT_FORMAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Max Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT__MAX_TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Min Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT__MIN_TEAMS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Tournament Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tournament Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.DoubleEliminationImpl <em>Double Elimination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.DoubleEliminationImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDoubleElimination()
	 * @generated
	 */
	int DOUBLE_ELIMINATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__NAME = TOURNAMENT_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Max Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__MAX_TEAMS = TOURNAMENT_FORMAT__MAX_TEAMS;

	/**
	 * The feature id for the '<em><b>Min Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__MIN_TEAMS = TOURNAMENT_FORMAT__MIN_TEAMS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__DESCRIPTION = TOURNAMENT_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__NUMBER_OF_ROUNDS = TOURNAMENT_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finals Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION__FINALS_FORMAT = TOURNAMENT_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION_FEATURE_COUNT = TOURNAMENT_FORMAT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Double Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ELIMINATION_OPERATION_COUNT = TOURNAMENT_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.RoundRobinImpl <em>Round Robin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.RoundRobinImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getRoundRobin()
	 * @generated
	 */
	int ROUND_ROBIN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__NAME = TOURNAMENT_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Max Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__MAX_TEAMS = TOURNAMENT_FORMAT__MAX_TEAMS;

	/**
	 * The feature id for the '<em><b>Min Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__MIN_TEAMS = TOURNAMENT_FORMAT__MIN_TEAMS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__DESCRIPTION = TOURNAMENT_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Points For Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__POINTS_FOR_WIN = TOURNAMENT_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points For Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__POINTS_FOR_DRAW = TOURNAMENT_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Points For Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__POINTS_FOR_LOSS = TOURNAMENT_FORMAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__NUMBER_OF_ROUNDS = TOURNAMENT_FORMAT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tie Breaker Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN__TIE_BREAKER_RULE = TOURNAMENT_FORMAT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_FEATURE_COUNT = TOURNAMENT_FORMAT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_OPERATION_COUNT = TOURNAMENT_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.SingleEliminationImpl <em>Single Elimination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.SingleEliminationImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getSingleElimination()
	 * @generated
	 */
	int SINGLE_ELIMINATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__NAME = TOURNAMENT_FORMAT__NAME;

	/**
	 * The feature id for the '<em><b>Max Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__MAX_TEAMS = TOURNAMENT_FORMAT__MAX_TEAMS;

	/**
	 * The feature id for the '<em><b>Min Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__MIN_TEAMS = TOURNAMENT_FORMAT__MIN_TEAMS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__DESCRIPTION = TOURNAMENT_FORMAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__NUMBER_OF_ROUNDS = TOURNAMENT_FORMAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Third Place Playoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF = TOURNAMENT_FORMAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION_FEATURE_COUNT = TOURNAMENT_FORMAT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION_OPERATION_COUNT = TOURNAMENT_FORMAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.MatchRulesImpl <em>Match Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.MatchRulesImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getMatchRules()
	 * @generated
	 */
	int MATCH_RULES = 10;

	/**
	 * The number of structural features of the '<em>Match Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RULES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Apply Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RULES___APPLY_RULES = 0;

	/**
	 * The number of operations of the '<em>Match Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RULES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.StandardImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 11;

	/**
	 * The feature id for the '<em><b>Tie Breaking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__TIE_BREAKING = MATCH_RULES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__EXTRA_TIME = MATCH_RULES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pentalty Shootouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__PENTALTY_SHOOTOUTS = MATCH_RULES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = MATCH_RULES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___APPLY_RULES = MATCH_RULES___APPLY_RULES;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = MATCH_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.ExtraTimeImpl <em>Extra Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.ExtraTimeImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getExtraTime()
	 * @generated
	 */
	int EXTRA_TIME = 12;

	/**
	 * The feature id for the '<em><b>Extra Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TIME__EXTRA_TIME = MATCH_RULES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extra Time Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TIME__EXTRA_TIME_DURATION = MATCH_RULES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extra Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TIME_FEATURE_COUNT = MATCH_RULES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TIME___APPLY_RULES = MATCH_RULES___APPLY_RULES;

	/**
	 * The number of operations of the '<em>Extra Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_TIME_OPERATION_COUNT = MATCH_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.PenaltyShootoutImpl <em>Penalty Shootout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.PenaltyShootoutImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPenaltyShootout()
	 * @generated
	 */
	int PENALTY_SHOOTOUT = 13;

	/**
	 * The feature id for the '<em><b>Pentalty Shootouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS = MATCH_RULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Penalty Shootout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_FEATURE_COUNT = MATCH_RULES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT___APPLY_RULES = MATCH_RULES___APPLY_RULES;

	/**
	 * The number of operations of the '<em>Penalty Shootout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_OPERATION_COUNT = MATCH_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.GroupStageImpl <em>Group Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.GroupStageImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getGroupStage()
	 * @generated
	 */
	int GROUP_STAGE = 14;

	/**
	 * The feature id for the '<em><b>Tie Breaking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE__TIE_BREAKING = MATCH_RULES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE_FEATURE_COUNT = MATCH_RULES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE___APPLY_RULES = MATCH_RULES___APPLY_RULES;

	/**
	 * The number of operations of the '<em>Group Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_STAGE_OPERATION_COUNT = MATCH_RULES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.UserRolesImpl <em>User Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.UserRolesImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUserRoles()
	 * @generated
	 */
	int USER_ROLES = 15;

	/**
	 * The feature id for the '<em><b>Can Modify Tournament</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLES__CAN_MODIFY_TOURNAMENT = 0;

	/**
	 * The feature id for the '<em><b>Can View Stats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLES__CAN_VIEW_STATS = 1;

	/**
	 * The feature id for the '<em><b>Can Manage Teams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLES__CAN_MANAGE_TEAMS = 2;

	/**
	 * The number of structural features of the '<em>User Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.PlayerStatisticsImpl <em>Player Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.PlayerStatisticsImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayerStatistics()
	 * @generated
	 */
	int PLAYER_STATISTICS = 16;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS__ASSISTS = 1;

	/**
	 * The feature id for the '<em><b>Fouls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS__FOULS = 2;

	/**
	 * The feature id for the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS__YELLOW_CARDS = 3;

	/**
	 * The feature id for the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS__RED_CARDS = 4;

	/**
	 * The number of structural features of the '<em>Player Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Player Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.DefenderImpl <em>Defender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.DefenderImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDefender()
	 * @generated
	 */
	int DEFENDER = 17;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__GOALS = PLAYER_STATISTICS__GOALS;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__ASSISTS = PLAYER_STATISTICS__ASSISTS;

	/**
	 * The feature id for the '<em><b>Fouls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__FOULS = PLAYER_STATISTICS__FOULS;

	/**
	 * The feature id for the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__YELLOW_CARDS = PLAYER_STATISTICS__YELLOW_CARDS;

	/**
	 * The feature id for the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__RED_CARDS = PLAYER_STATISTICS__RED_CARDS;

	/**
	 * The feature id for the '<em><b>Cleansheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER__CLEANSHEETS = PLAYER_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER_FEATURE_COUNT = PLAYER_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Defender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER_OPERATION_COUNT = PLAYER_STATISTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.GoalkeeperImpl <em>Goalkeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.GoalkeeperImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getGoalkeeper()
	 * @generated
	 */
	int GOALKEEPER = 18;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__GOALS = PLAYER_STATISTICS__GOALS;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__ASSISTS = PLAYER_STATISTICS__ASSISTS;

	/**
	 * The feature id for the '<em><b>Fouls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__FOULS = PLAYER_STATISTICS__FOULS;

	/**
	 * The feature id for the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__YELLOW_CARDS = PLAYER_STATISTICS__YELLOW_CARDS;

	/**
	 * The feature id for the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__RED_CARDS = PLAYER_STATISTICS__RED_CARDS;

	/**
	 * The feature id for the '<em><b>Cleansheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__CLEANSHEETS = PLAYER_STATISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER__SAVES = PLAYER_STATISTICS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goalkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER_FEATURE_COUNT = PLAYER_STATISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Goalkeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALKEEPER_OPERATION_COUNT = PLAYER_STATISTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.impl.DataStorageImpl <em>Data Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.impl.DataStorageImpl
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDataStorage()
	 * @generated
	 */
	int DATA_STORAGE = 19;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__STORAGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_domain_model.PlayerPosition <em>Player Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.PlayerPosition
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayerPosition()
	 * @generated
	 */
	int PLAYER_POSITION = 20;

	/**
	 * The meta object id for the '{@link fta_domain_model.UserRole <em>User Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_domain_model.UserRole
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 21;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 22;

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see fta_domain_model.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_domain_model.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Team#getTeamSize <em>Team Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Size</em>'.
	 * @see fta_domain_model.Team#getTeamSize()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_TeamSize();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_domain_model.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see fta_domain_model.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Team#getManagerName <em>Manager Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Name</em>'.
	 * @see fta_domain_model.Team#getManagerName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_ManagerName();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Team#getTotalGoals <em>Total Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Goals</em>'.
	 * @see fta_domain_model.Team#getTotalGoals()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_TotalGoals();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see fta_domain_model.Tournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Tournament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_domain_model.Tournament#getName()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Tournament#getTournamentType <em>Tournament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tournament Type</em>'.
	 * @see fta_domain_model.Tournament#getTournamentType()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_TournamentType();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_domain_model.Tournament#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see fta_domain_model.Tournament#getMatches()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Matches();

	/**
	 * Returns the meta object for the reference list '{@link fta_domain_model.Tournament#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see fta_domain_model.Tournament#getTeams()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Teams();

	/**
	 * Returns the meta object for the reference '{@link fta_domain_model.Tournament#getTournamentformat <em>Tournamentformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tournamentformat</em>'.
	 * @see fta_domain_model.Tournament#getTournamentformat()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Tournamentformat();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Tournament#getNumberOfTeams <em>Number Of Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Teams</em>'.
	 * @see fta_domain_model.Tournament#getNumberOfTeams()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_NumberOfTeams();

	/**
	 * Returns the meta object for the containment reference '{@link fta_domain_model.Tournament#getBrackets <em>Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brackets</em>'.
	 * @see fta_domain_model.Tournament#getBrackets()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Brackets();

	/**
	 * Returns the meta object for the reference '{@link fta_domain_model.Tournament#getDatastorage <em>Datastorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datastorage</em>'.
	 * @see fta_domain_model.Tournament#getDatastorage()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Datastorage();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see fta_domain_model.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Match#getScoreTeam1 <em>Score Team1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Team1</em>'.
	 * @see fta_domain_model.Match#getScoreTeam1()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_ScoreTeam1();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Match#getScoreTeam2 <em>Score Team2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score Team2</em>'.
	 * @see fta_domain_model.Match#getScoreTeam2()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_ScoreTeam2();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Match#getMatchResult <em>Match Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Result</em>'.
	 * @see fta_domain_model.Match#getMatchResult()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_MatchResult();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Match#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see fta_domain_model.Match#getDay()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Day();

	/**
	 * Returns the meta object for the reference list '{@link fta_domain_model.Match#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teams</em>'.
	 * @see fta_domain_model.Match#getTeams()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Teams();

	/**
	 * Returns the meta object for the reference '{@link fta_domain_model.Match#getMatchrules <em>Matchrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matchrules</em>'.
	 * @see fta_domain_model.Match#getMatchrules()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Matchrules();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see fta_domain_model.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_domain_model.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see fta_domain_model.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the reference '{@link fta_domain_model.Player#getPlayerstatistics <em>Playerstatistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Playerstatistics</em>'.
	 * @see fta_domain_model.Player#getPlayerstatistics()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Playerstatistics();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Player#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see fta_domain_model.Player#getBirthDate()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Player#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see fta_domain_model.Player#getAge()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Age();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Player#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fta_domain_model.Player#getNumber()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Number();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Bracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracket</em>'.
	 * @see fta_domain_model.Bracket
	 * @generated
	 */
	EClass getBracket();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Bracket#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounds</em>'.
	 * @see fta_domain_model.Bracket#getRounds()
	 * @see #getBracket()
	 * @generated
	 */
	EAttribute getBracket_Rounds();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Bracket#getBracketSide <em>Bracket Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bracket Side</em>'.
	 * @see fta_domain_model.Bracket#getBracketSide()
	 * @see #getBracket()
	 * @generated
	 */
	EAttribute getBracket_BracketSide();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_domain_model.Bracket#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see fta_domain_model.Bracket#getMatches()
	 * @see #getBracket()
	 * @generated
	 */
	EReference getBracket_Matches();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fta_domain_model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see fta_domain_model.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see fta_domain_model.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Role();

	/**
	 * Returns the meta object for the reference list '{@link fta_domain_model.User#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tournaments</em>'.
	 * @see fta_domain_model.User#getTournaments()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Tournaments();

	/**
	 * Returns the meta object for the reference '{@link fta_domain_model.User#getUserroles <em>Userroles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userroles</em>'.
	 * @see fta_domain_model.User#getUserroles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Userroles();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.TournamentFormat <em>Tournament Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament Format</em>'.
	 * @see fta_domain_model.TournamentFormat
	 * @generated
	 */
	EClass getTournamentFormat();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.TournamentFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_domain_model.TournamentFormat#getName()
	 * @see #getTournamentFormat()
	 * @generated
	 */
	EAttribute getTournamentFormat_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.TournamentFormat#getMaxTeams <em>Max Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Teams</em>'.
	 * @see fta_domain_model.TournamentFormat#getMaxTeams()
	 * @see #getTournamentFormat()
	 * @generated
	 */
	EAttribute getTournamentFormat_MaxTeams();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.TournamentFormat#getMinTeams <em>Min Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Teams</em>'.
	 * @see fta_domain_model.TournamentFormat#getMinTeams()
	 * @see #getTournamentFormat()
	 * @generated
	 */
	EAttribute getTournamentFormat_MinTeams();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.TournamentFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fta_domain_model.TournamentFormat#getDescription()
	 * @see #getTournamentFormat()
	 * @generated
	 */
	EAttribute getTournamentFormat_Description();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.DoubleElimination <em>Double Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Elimination</em>'.
	 * @see fta_domain_model.DoubleElimination
	 * @generated
	 */
	EClass getDoubleElimination();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.DoubleElimination#getNumberOfRounds <em>Number Of Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rounds</em>'.
	 * @see fta_domain_model.DoubleElimination#getNumberOfRounds()
	 * @see #getDoubleElimination()
	 * @generated
	 */
	EAttribute getDoubleElimination_NumberOfRounds();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.DoubleElimination#getFinalsFormat <em>Finals Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finals Format</em>'.
	 * @see fta_domain_model.DoubleElimination#getFinalsFormat()
	 * @see #getDoubleElimination()
	 * @generated
	 */
	EAttribute getDoubleElimination_FinalsFormat();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.RoundRobin <em>Round Robin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Robin</em>'.
	 * @see fta_domain_model.RoundRobin
	 * @generated
	 */
	EClass getRoundRobin();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.RoundRobin#getPointsForWin <em>Points For Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points For Win</em>'.
	 * @see fta_domain_model.RoundRobin#getPointsForWin()
	 * @see #getRoundRobin()
	 * @generated
	 */
	EAttribute getRoundRobin_PointsForWin();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.RoundRobin#getPointsForDraw <em>Points For Draw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points For Draw</em>'.
	 * @see fta_domain_model.RoundRobin#getPointsForDraw()
	 * @see #getRoundRobin()
	 * @generated
	 */
	EAttribute getRoundRobin_PointsForDraw();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.RoundRobin#getPointsForLoss <em>Points For Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points For Loss</em>'.
	 * @see fta_domain_model.RoundRobin#getPointsForLoss()
	 * @see #getRoundRobin()
	 * @generated
	 */
	EAttribute getRoundRobin_PointsForLoss();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.RoundRobin#getNumberOfRounds <em>Number Of Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rounds</em>'.
	 * @see fta_domain_model.RoundRobin#getNumberOfRounds()
	 * @see #getRoundRobin()
	 * @generated
	 */
	EAttribute getRoundRobin_NumberOfRounds();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.RoundRobin#getTieBreakerRule <em>Tie Breaker Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Breaker Rule</em>'.
	 * @see fta_domain_model.RoundRobin#getTieBreakerRule()
	 * @see #getRoundRobin()
	 * @generated
	 */
	EAttribute getRoundRobin_TieBreakerRule();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.SingleElimination <em>Single Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Elimination</em>'.
	 * @see fta_domain_model.SingleElimination
	 * @generated
	 */
	EClass getSingleElimination();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.SingleElimination#getNumberOfRounds <em>Number Of Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rounds</em>'.
	 * @see fta_domain_model.SingleElimination#getNumberOfRounds()
	 * @see #getSingleElimination()
	 * @generated
	 */
	EAttribute getSingleElimination_NumberOfRounds();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.SingleElimination#isHasThirdPlacePlayoff <em>Has Third Place Playoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Third Place Playoff</em>'.
	 * @see fta_domain_model.SingleElimination#isHasThirdPlacePlayoff()
	 * @see #getSingleElimination()
	 * @generated
	 */
	EAttribute getSingleElimination_HasThirdPlacePlayoff();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.MatchRules <em>Match Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Rules</em>'.
	 * @see fta_domain_model.MatchRules
	 * @generated
	 */
	EClass getMatchRules();

	/**
	 * Returns the meta object for the '{@link fta_domain_model.MatchRules#applyRules() <em>Apply Rules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Rules</em>' operation.
	 * @see fta_domain_model.MatchRules#applyRules()
	 * @generated
	 */
	EOperation getMatchRules__ApplyRules();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see fta_domain_model.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Standard#isTieBreaking <em>Tie Breaking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Breaking</em>'.
	 * @see fta_domain_model.Standard#isTieBreaking()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_TieBreaking();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Standard#isExtraTime <em>Extra Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Time</em>'.
	 * @see fta_domain_model.Standard#isExtraTime()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_ExtraTime();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Standard#isPentaltyShootouts <em>Pentalty Shootouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pentalty Shootouts</em>'.
	 * @see fta_domain_model.Standard#isPentaltyShootouts()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_PentaltyShootouts();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.ExtraTime <em>Extra Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Time</em>'.
	 * @see fta_domain_model.ExtraTime
	 * @generated
	 */
	EClass getExtraTime();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.ExtraTime#isExtraTime <em>Extra Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Time</em>'.
	 * @see fta_domain_model.ExtraTime#isExtraTime()
	 * @see #getExtraTime()
	 * @generated
	 */
	EAttribute getExtraTime_ExtraTime();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.ExtraTime#getExtraTimeDuration <em>Extra Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Time Duration</em>'.
	 * @see fta_domain_model.ExtraTime#getExtraTimeDuration()
	 * @see #getExtraTime()
	 * @generated
	 */
	EAttribute getExtraTime_ExtraTimeDuration();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.PenaltyShootout <em>Penalty Shootout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Penalty Shootout</em>'.
	 * @see fta_domain_model.PenaltyShootout
	 * @generated
	 */
	EClass getPenaltyShootout();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PenaltyShootout#isPentaltyShootouts <em>Pentalty Shootouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pentalty Shootouts</em>'.
	 * @see fta_domain_model.PenaltyShootout#isPentaltyShootouts()
	 * @see #getPenaltyShootout()
	 * @generated
	 */
	EAttribute getPenaltyShootout_PentaltyShootouts();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.GroupStage <em>Group Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Stage</em>'.
	 * @see fta_domain_model.GroupStage
	 * @generated
	 */
	EClass getGroupStage();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.GroupStage#isTieBreaking <em>Tie Breaking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Breaking</em>'.
	 * @see fta_domain_model.GroupStage#isTieBreaking()
	 * @see #getGroupStage()
	 * @generated
	 */
	EAttribute getGroupStage_TieBreaking();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.UserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Roles</em>'.
	 * @see fta_domain_model.UserRoles
	 * @generated
	 */
	EClass getUserRoles();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.UserRoles#isCanModifyTournament <em>Can Modify Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Modify Tournament</em>'.
	 * @see fta_domain_model.UserRoles#isCanModifyTournament()
	 * @see #getUserRoles()
	 * @generated
	 */
	EAttribute getUserRoles_CanModifyTournament();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.UserRoles#isCanViewStats <em>Can View Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can View Stats</em>'.
	 * @see fta_domain_model.UserRoles#isCanViewStats()
	 * @see #getUserRoles()
	 * @generated
	 */
	EAttribute getUserRoles_CanViewStats();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.UserRoles#isCanManageTeams <em>Can Manage Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Manage Teams</em>'.
	 * @see fta_domain_model.UserRoles#isCanManageTeams()
	 * @see #getUserRoles()
	 * @generated
	 */
	EAttribute getUserRoles_CanManageTeams();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.PlayerStatistics <em>Player Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Statistics</em>'.
	 * @see fta_domain_model.PlayerStatistics
	 * @generated
	 */
	EClass getPlayerStatistics();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PlayerStatistics#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals</em>'.
	 * @see fta_domain_model.PlayerStatistics#getGoals()
	 * @see #getPlayerStatistics()
	 * @generated
	 */
	EAttribute getPlayerStatistics_Goals();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PlayerStatistics#getAssists <em>Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assists</em>'.
	 * @see fta_domain_model.PlayerStatistics#getAssists()
	 * @see #getPlayerStatistics()
	 * @generated
	 */
	EAttribute getPlayerStatistics_Assists();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PlayerStatistics#getFouls <em>Fouls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fouls</em>'.
	 * @see fta_domain_model.PlayerStatistics#getFouls()
	 * @see #getPlayerStatistics()
	 * @generated
	 */
	EAttribute getPlayerStatistics_Fouls();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PlayerStatistics#getYellowCards <em>Yellow Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yellow Cards</em>'.
	 * @see fta_domain_model.PlayerStatistics#getYellowCards()
	 * @see #getPlayerStatistics()
	 * @generated
	 */
	EAttribute getPlayerStatistics_YellowCards();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.PlayerStatistics#getRedCards <em>Red Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Cards</em>'.
	 * @see fta_domain_model.PlayerStatistics#getRedCards()
	 * @see #getPlayerStatistics()
	 * @generated
	 */
	EAttribute getPlayerStatistics_RedCards();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Defender <em>Defender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defender</em>'.
	 * @see fta_domain_model.Defender
	 * @generated
	 */
	EClass getDefender();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Defender#getCleansheets <em>Cleansheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleansheets</em>'.
	 * @see fta_domain_model.Defender#getCleansheets()
	 * @see #getDefender()
	 * @generated
	 */
	EAttribute getDefender_Cleansheets();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.Goalkeeper <em>Goalkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goalkeeper</em>'.
	 * @see fta_domain_model.Goalkeeper
	 * @generated
	 */
	EClass getGoalkeeper();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Goalkeeper#getCleansheets <em>Cleansheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleansheets</em>'.
	 * @see fta_domain_model.Goalkeeper#getCleansheets()
	 * @see #getGoalkeeper()
	 * @generated
	 */
	EAttribute getGoalkeeper_Cleansheets();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.Goalkeeper#getSaves <em>Saves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saves</em>'.
	 * @see fta_domain_model.Goalkeeper#getSaves()
	 * @see #getGoalkeeper()
	 * @generated
	 */
	EAttribute getGoalkeeper_Saves();

	/**
	 * Returns the meta object for class '{@link fta_domain_model.DataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Storage</em>'.
	 * @see fta_domain_model.DataStorage
	 * @generated
	 */
	EClass getDataStorage();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.DataStorage#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see fta_domain_model.DataStorage#getStorageType()
	 * @see #getDataStorage()
	 * @generated
	 */
	EAttribute getDataStorage_StorageType();

	/**
	 * Returns the meta object for the attribute '{@link fta_domain_model.DataStorage#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see fta_domain_model.DataStorage#getLocation()
	 * @see #getDataStorage()
	 * @generated
	 */
	EAttribute getDataStorage_Location();

	/**
	 * Returns the meta object for enum '{@link fta_domain_model.PlayerPosition <em>Player Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Position</em>'.
	 * @see fta_domain_model.PlayerPosition
	 * @generated
	 */
	EEnum getPlayerPosition();

	/**
	 * Returns the meta object for enum '{@link fta_domain_model.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Role</em>'.
	 * @see fta_domain_model.UserRole
	 * @generated
	 */
	EEnum getUserRole();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fta_domain_modelFactory getFta_domain_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.TeamImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Team Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__TEAM_SIZE = eINSTANCE.getTeam_TeamSize();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Manager Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__MANAGER_NAME = eINSTANCE.getTeam_ManagerName();

		/**
		 * The meta object literal for the '<em><b>Total Goals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__TOTAL_GOALS = eINSTANCE.getTeam_TotalGoals();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.TournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.TournamentImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTournament()
		 * @generated
		 */
		EClass TOURNAMENT = eINSTANCE.getTournament();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__NAME = eINSTANCE.getTournament_Name();

		/**
		 * The meta object literal for the '<em><b>Tournament Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__TOURNAMENT_TYPE = eINSTANCE.getTournament_TournamentType();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__MATCHES = eINSTANCE.getTournament_Matches();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__TEAMS = eINSTANCE.getTournament_Teams();

		/**
		 * The meta object literal for the '<em><b>Tournamentformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__TOURNAMENTFORMAT = eINSTANCE.getTournament_Tournamentformat();

		/**
		 * The meta object literal for the '<em><b>Number Of Teams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__NUMBER_OF_TEAMS = eINSTANCE.getTournament_NumberOfTeams();

		/**
		 * The meta object literal for the '<em><b>Brackets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__BRACKETS = eINSTANCE.getTournament_Brackets();

		/**
		 * The meta object literal for the '<em><b>Datastorage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__DATASTORAGE = eINSTANCE.getTournament_Datastorage();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.MatchImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Score Team1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SCORE_TEAM1 = eINSTANCE.getMatch_ScoreTeam1();

		/**
		 * The meta object literal for the '<em><b>Score Team2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__SCORE_TEAM2 = eINSTANCE.getMatch_ScoreTeam2();

		/**
		 * The meta object literal for the '<em><b>Match Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MATCH_RESULT = eINSTANCE.getMatch_MatchResult();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DAY = eINSTANCE.getMatch_Day();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TEAMS = eINSTANCE.getMatch_Teams();

		/**
		 * The meta object literal for the '<em><b>Matchrules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__MATCHRULES = eINSTANCE.getMatch_Matchrules();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.PlayerImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Playerstatistics</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PLAYERSTATISTICS = eINSTANCE.getPlayer_Playerstatistics();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__BIRTH_DATE = eINSTANCE.getPlayer_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__AGE = eINSTANCE.getPlayer_Age();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NUMBER = eINSTANCE.getPlayer_Number();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.BracketImpl <em>Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.BracketImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getBracket()
		 * @generated
		 */
		EClass BRACKET = eINSTANCE.getBracket();

		/**
		 * The meta object literal for the '<em><b>Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRACKET__ROUNDS = eINSTANCE.getBracket_Rounds();

		/**
		 * The meta object literal for the '<em><b>Bracket Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRACKET__BRACKET_SIDE = eINSTANCE.getBracket_BracketSide();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKET__MATCHES = eINSTANCE.getBracket_Matches();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.UserImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ROLE = eINSTANCE.getUser_Role();

		/**
		 * The meta object literal for the '<em><b>Tournaments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TOURNAMENTS = eINSTANCE.getUser_Tournaments();

		/**
		 * The meta object literal for the '<em><b>Userroles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERROLES = eINSTANCE.getUser_Userroles();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.TournamentFormatImpl <em>Tournament Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.TournamentFormatImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getTournamentFormat()
		 * @generated
		 */
		EClass TOURNAMENT_FORMAT = eINSTANCE.getTournamentFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT_FORMAT__NAME = eINSTANCE.getTournamentFormat_Name();

		/**
		 * The meta object literal for the '<em><b>Max Teams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT_FORMAT__MAX_TEAMS = eINSTANCE.getTournamentFormat_MaxTeams();

		/**
		 * The meta object literal for the '<em><b>Min Teams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT_FORMAT__MIN_TEAMS = eINSTANCE.getTournamentFormat_MinTeams();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT_FORMAT__DESCRIPTION = eINSTANCE.getTournamentFormat_Description();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.DoubleEliminationImpl <em>Double Elimination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.DoubleEliminationImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDoubleElimination()
		 * @generated
		 */
		EClass DOUBLE_ELIMINATION = eINSTANCE.getDoubleElimination();

		/**
		 * The meta object literal for the '<em><b>Number Of Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ELIMINATION__NUMBER_OF_ROUNDS = eINSTANCE.getDoubleElimination_NumberOfRounds();

		/**
		 * The meta object literal for the '<em><b>Finals Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ELIMINATION__FINALS_FORMAT = eINSTANCE.getDoubleElimination_FinalsFormat();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.RoundRobinImpl <em>Round Robin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.RoundRobinImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getRoundRobin()
		 * @generated
		 */
		EClass ROUND_ROBIN = eINSTANCE.getRoundRobin();

		/**
		 * The meta object literal for the '<em><b>Points For Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_ROBIN__POINTS_FOR_WIN = eINSTANCE.getRoundRobin_PointsForWin();

		/**
		 * The meta object literal for the '<em><b>Points For Draw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_ROBIN__POINTS_FOR_DRAW = eINSTANCE.getRoundRobin_PointsForDraw();

		/**
		 * The meta object literal for the '<em><b>Points For Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_ROBIN__POINTS_FOR_LOSS = eINSTANCE.getRoundRobin_PointsForLoss();

		/**
		 * The meta object literal for the '<em><b>Number Of Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_ROBIN__NUMBER_OF_ROUNDS = eINSTANCE.getRoundRobin_NumberOfRounds();

		/**
		 * The meta object literal for the '<em><b>Tie Breaker Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_ROBIN__TIE_BREAKER_RULE = eINSTANCE.getRoundRobin_TieBreakerRule();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.SingleEliminationImpl <em>Single Elimination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.SingleEliminationImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getSingleElimination()
		 * @generated
		 */
		EClass SINGLE_ELIMINATION = eINSTANCE.getSingleElimination();

		/**
		 * The meta object literal for the '<em><b>Number Of Rounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ELIMINATION__NUMBER_OF_ROUNDS = eINSTANCE.getSingleElimination_NumberOfRounds();

		/**
		 * The meta object literal for the '<em><b>Has Third Place Playoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF = eINSTANCE.getSingleElimination_HasThirdPlacePlayoff();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.MatchRulesImpl <em>Match Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.MatchRulesImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getMatchRules()
		 * @generated
		 */
		EClass MATCH_RULES = eINSTANCE.getMatchRules();

		/**
		 * The meta object literal for the '<em><b>Apply Rules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATCH_RULES___APPLY_RULES = eINSTANCE.getMatchRules__ApplyRules();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.StandardImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Tie Breaking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__TIE_BREAKING = eINSTANCE.getStandard_TieBreaking();

		/**
		 * The meta object literal for the '<em><b>Extra Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__EXTRA_TIME = eINSTANCE.getStandard_ExtraTime();

		/**
		 * The meta object literal for the '<em><b>Pentalty Shootouts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__PENTALTY_SHOOTOUTS = eINSTANCE.getStandard_PentaltyShootouts();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.ExtraTimeImpl <em>Extra Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.ExtraTimeImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getExtraTime()
		 * @generated
		 */
		EClass EXTRA_TIME = eINSTANCE.getExtraTime();

		/**
		 * The meta object literal for the '<em><b>Extra Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_TIME__EXTRA_TIME = eINSTANCE.getExtraTime_ExtraTime();

		/**
		 * The meta object literal for the '<em><b>Extra Time Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_TIME__EXTRA_TIME_DURATION = eINSTANCE.getExtraTime_ExtraTimeDuration();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.PenaltyShootoutImpl <em>Penalty Shootout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.PenaltyShootoutImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPenaltyShootout()
		 * @generated
		 */
		EClass PENALTY_SHOOTOUT = eINSTANCE.getPenaltyShootout();

		/**
		 * The meta object literal for the '<em><b>Pentalty Shootouts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENALTY_SHOOTOUT__PENTALTY_SHOOTOUTS = eINSTANCE.getPenaltyShootout_PentaltyShootouts();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.GroupStageImpl <em>Group Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.GroupStageImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getGroupStage()
		 * @generated
		 */
		EClass GROUP_STAGE = eINSTANCE.getGroupStage();

		/**
		 * The meta object literal for the '<em><b>Tie Breaking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_STAGE__TIE_BREAKING = eINSTANCE.getGroupStage_TieBreaking();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.UserRolesImpl <em>User Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.UserRolesImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUserRoles()
		 * @generated
		 */
		EClass USER_ROLES = eINSTANCE.getUserRoles();

		/**
		 * The meta object literal for the '<em><b>Can Modify Tournament</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ROLES__CAN_MODIFY_TOURNAMENT = eINSTANCE.getUserRoles_CanModifyTournament();

		/**
		 * The meta object literal for the '<em><b>Can View Stats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ROLES__CAN_VIEW_STATS = eINSTANCE.getUserRoles_CanViewStats();

		/**
		 * The meta object literal for the '<em><b>Can Manage Teams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ROLES__CAN_MANAGE_TEAMS = eINSTANCE.getUserRoles_CanManageTeams();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.PlayerStatisticsImpl <em>Player Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.PlayerStatisticsImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayerStatistics()
		 * @generated
		 */
		EClass PLAYER_STATISTICS = eINSTANCE.getPlayerStatistics();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATISTICS__GOALS = eINSTANCE.getPlayerStatistics_Goals();

		/**
		 * The meta object literal for the '<em><b>Assists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATISTICS__ASSISTS = eINSTANCE.getPlayerStatistics_Assists();

		/**
		 * The meta object literal for the '<em><b>Fouls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATISTICS__FOULS = eINSTANCE.getPlayerStatistics_Fouls();

		/**
		 * The meta object literal for the '<em><b>Yellow Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATISTICS__YELLOW_CARDS = eINSTANCE.getPlayerStatistics_YellowCards();

		/**
		 * The meta object literal for the '<em><b>Red Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_STATISTICS__RED_CARDS = eINSTANCE.getPlayerStatistics_RedCards();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.DefenderImpl <em>Defender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.DefenderImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDefender()
		 * @generated
		 */
		EClass DEFENDER = eINSTANCE.getDefender();

		/**
		 * The meta object literal for the '<em><b>Cleansheets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFENDER__CLEANSHEETS = eINSTANCE.getDefender_Cleansheets();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.GoalkeeperImpl <em>Goalkeeper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.GoalkeeperImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getGoalkeeper()
		 * @generated
		 */
		EClass GOALKEEPER = eINSTANCE.getGoalkeeper();

		/**
		 * The meta object literal for the '<em><b>Cleansheets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOALKEEPER__CLEANSHEETS = eINSTANCE.getGoalkeeper_Cleansheets();

		/**
		 * The meta object literal for the '<em><b>Saves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOALKEEPER__SAVES = eINSTANCE.getGoalkeeper_Saves();

		/**
		 * The meta object literal for the '{@link fta_domain_model.impl.DataStorageImpl <em>Data Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.impl.DataStorageImpl
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDataStorage()
		 * @generated
		 */
		EClass DATA_STORAGE = eINSTANCE.getDataStorage();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORAGE__STORAGE_TYPE = eINSTANCE.getDataStorage_StorageType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORAGE__LOCATION = eINSTANCE.getDataStorage_Location();

		/**
		 * The meta object literal for the '{@link fta_domain_model.PlayerPosition <em>Player Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.PlayerPosition
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getPlayerPosition()
		 * @generated
		 */
		EEnum PLAYER_POSITION = eINSTANCE.getPlayerPosition();

		/**
		 * The meta object literal for the '{@link fta_domain_model.UserRole <em>User Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_domain_model.UserRole
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getUserRole()
		 * @generated
		 */
		EEnum USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see fta_domain_model.impl.Fta_domain_modelPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //Fta_domain_modelPackage
