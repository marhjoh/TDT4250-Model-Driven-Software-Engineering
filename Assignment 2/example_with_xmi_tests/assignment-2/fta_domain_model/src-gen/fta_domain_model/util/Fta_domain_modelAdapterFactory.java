/**
 */
package fta_domain_model.util;

import fta_domain_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage
 * @generated
 */
public class Fta_domain_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fta_domain_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_domain_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Fta_domain_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fta_domain_modelSwitch<Adapter> modelSwitch = new Fta_domain_modelSwitch<Adapter>() {
		@Override
		public Adapter caseTeam(Team object) {
			return createTeamAdapter();
		}

		@Override
		public Adapter caseTournament(Tournament object) {
			return createTournamentAdapter();
		}

		@Override
		public Adapter caseMatch(Match object) {
			return createMatchAdapter();
		}

		@Override
		public Adapter casePlayer(Player object) {
			return createPlayerAdapter();
		}

		@Override
		public Adapter caseBracket(Bracket object) {
			return createBracketAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseTournamentFormat(TournamentFormat object) {
			return createTournamentFormatAdapter();
		}

		@Override
		public Adapter caseDoubleElimination(DoubleElimination object) {
			return createDoubleEliminationAdapter();
		}

		@Override
		public Adapter caseRoundRobin(RoundRobin object) {
			return createRoundRobinAdapter();
		}

		@Override
		public Adapter caseSingleElimination(SingleElimination object) {
			return createSingleEliminationAdapter();
		}

		@Override
		public Adapter caseMatchRules(MatchRules object) {
			return createMatchRulesAdapter();
		}

		@Override
		public Adapter caseStandard(Standard object) {
			return createStandardAdapter();
		}

		@Override
		public Adapter caseExtraTime(ExtraTime object) {
			return createExtraTimeAdapter();
		}

		@Override
		public Adapter casePenaltyShootout(PenaltyShootout object) {
			return createPenaltyShootoutAdapter();
		}

		@Override
		public Adapter caseGroupStage(GroupStage object) {
			return createGroupStageAdapter();
		}

		@Override
		public Adapter caseUserRoles(UserRoles object) {
			return createUserRolesAdapter();
		}

		@Override
		public Adapter casePlayerStatistics(PlayerStatistics object) {
			return createPlayerStatisticsAdapter();
		}

		@Override
		public Adapter caseDefender(Defender object) {
			return createDefenderAdapter();
		}

		@Override
		public Adapter caseGoalkeeper(Goalkeeper object) {
			return createGoalkeeperAdapter();
		}

		@Override
		public Adapter caseDataStorage(DataStorage object) {
			return createDataStorageAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Tournament
	 * @generated
	 */
	public Adapter createTournamentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Bracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Bracket
	 * @generated
	 */
	public Adapter createBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.TournamentFormat <em>Tournament Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.TournamentFormat
	 * @generated
	 */
	public Adapter createTournamentFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.DoubleElimination <em>Double Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.DoubleElimination
	 * @generated
	 */
	public Adapter createDoubleEliminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.RoundRobin <em>Round Robin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.RoundRobin
	 * @generated
	 */
	public Adapter createRoundRobinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.SingleElimination <em>Single Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.SingleElimination
	 * @generated
	 */
	public Adapter createSingleEliminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.MatchRules <em>Match Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.MatchRules
	 * @generated
	 */
	public Adapter createMatchRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.ExtraTime <em>Extra Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.ExtraTime
	 * @generated
	 */
	public Adapter createExtraTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.PenaltyShootout <em>Penalty Shootout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.PenaltyShootout
	 * @generated
	 */
	public Adapter createPenaltyShootoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.GroupStage <em>Group Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.GroupStage
	 * @generated
	 */
	public Adapter createGroupStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.UserRoles <em>User Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.UserRoles
	 * @generated
	 */
	public Adapter createUserRolesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.PlayerStatistics <em>Player Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.PlayerStatistics
	 * @generated
	 */
	public Adapter createPlayerStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Defender <em>Defender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Defender
	 * @generated
	 */
	public Adapter createDefenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.Goalkeeper <em>Goalkeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.Goalkeeper
	 * @generated
	 */
	public Adapter createGoalkeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_domain_model.DataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_domain_model.DataStorage
	 * @generated
	 */
	public Adapter createDataStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Fta_domain_modelAdapterFactory
