/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage
 * @generated
 */
public interface Fta_domain_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_domain_modelFactory eINSTANCE = fta_domain_model.impl.Fta_domain_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Tournament</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tournament</em>'.
	 * @generated
	 */
	Tournament createTournament();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bracket</em>'.
	 * @generated
	 */
	Bracket createBracket();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>League</em>'.
	 * @generated
	 */
	League createLeague();

	/**
	 * Returns a new object of class '<em>Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Robin</em>'.
	 * @generated
	 */
	RoundRobin createRoundRobin();

	/**
	 * Returns a new object of class '<em>Knockout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knockout</em>'.
	 * @generated
	 */
	Knockout createKnockout();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Extra Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Time</em>'.
	 * @generated
	 */
	ExtraTime createExtraTime();

	/**
	 * Returns a new object of class '<em>Penalty Shootout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Penalty Shootout</em>'.
	 * @generated
	 */
	PenaltyShootout createPenaltyShootout();

	/**
	 * Returns a new object of class '<em>Group Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Stage</em>'.
	 * @generated
	 */
	GroupStage createGroupStage();

	/**
	 * Returns a new object of class '<em>Defender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defender</em>'.
	 * @generated
	 */
	Defender createDefender();

	/**
	 * Returns a new object of class '<em>Goalkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goalkeeper</em>'.
	 * @generated
	 */
	Goalkeeper createGoalkeeper();

	/**
	 * Returns a new object of class '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker</em>'.
	 * @generated
	 */
	Attacker createAttacker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fta_domain_modelPackage getFta_domain_modelPackage();

} //Fta_domain_modelFactory
