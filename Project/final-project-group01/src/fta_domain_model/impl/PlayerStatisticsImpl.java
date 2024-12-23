/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.PlayerStatistics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.PlayerStatisticsImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerStatisticsImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerStatisticsImpl#getFouls <em>Fouls</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerStatisticsImpl#getYellowCards <em>Yellow Cards</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerStatisticsImpl#getRedCards <em>Red Cards</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlayerStatisticsImpl extends MinimalEObjectImpl.Container implements PlayerStatistics {
	/**
	 * The default value of the '{@link #getGoals() <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected int goals = GOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSISTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected int assists = ASSISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFouls() <em>Fouls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFouls()
	 * @generated
	 * @ordered
	 */
	protected static final int FOULS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFouls() <em>Fouls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFouls()
	 * @generated
	 * @ordered
	 */
	protected int fouls = FOULS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYellowCards() <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowCards()
	 * @generated
	 * @ordered
	 */
	protected static final int YELLOW_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYellowCards() <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellowCards()
	 * @generated
	 * @ordered
	 */
	protected int yellowCards = YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedCards() <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedCards()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRedCards() <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedCards()
	 * @generated
	 * @ordered
	 */
	protected int redCards = RED_CARDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.PLAYER_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoals() {
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoals(int newGoals) {
		int oldGoals = goals;
		goals = newGoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER_STATISTICS__GOALS,
					oldGoals, goals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAssists() {
		return assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssists(int newAssists) {
		int oldAssists = assists;
		assists = newAssists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER_STATISTICS__ASSISTS,
					oldAssists, assists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFouls() {
		return fouls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFouls(int newFouls) {
		int oldFouls = fouls;
		fouls = newFouls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER_STATISTICS__FOULS,
					oldFouls, fouls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYellowCards() {
		return yellowCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYellowCards(int newYellowCards) {
		int oldYellowCards = yellowCards;
		yellowCards = newYellowCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.PLAYER_STATISTICS__YELLOW_CARDS, oldYellowCards, yellowCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRedCards() {
		return redCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedCards(int newRedCards) {
		int oldRedCards = redCards;
		redCards = newRedCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER_STATISTICS__RED_CARDS,
					oldRedCards, redCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.PLAYER_STATISTICS__GOALS:
			return getGoals();
		case Fta_domain_modelPackage.PLAYER_STATISTICS__ASSISTS:
			return getAssists();
		case Fta_domain_modelPackage.PLAYER_STATISTICS__FOULS:
			return getFouls();
		case Fta_domain_modelPackage.PLAYER_STATISTICS__YELLOW_CARDS:
			return getYellowCards();
		case Fta_domain_modelPackage.PLAYER_STATISTICS__RED_CARDS:
			return getRedCards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fta_domain_modelPackage.PLAYER_STATISTICS__GOALS:
			setGoals((Integer) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__ASSISTS:
			setAssists((Integer) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__FOULS:
			setFouls((Integer) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__YELLOW_CARDS:
			setYellowCards((Integer) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__RED_CARDS:
			setRedCards((Integer) newValue);
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
		case Fta_domain_modelPackage.PLAYER_STATISTICS__GOALS:
			setGoals(GOALS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__ASSISTS:
			setAssists(ASSISTS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__FOULS:
			setFouls(FOULS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__YELLOW_CARDS:
			setYellowCards(YELLOW_CARDS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__RED_CARDS:
			setRedCards(RED_CARDS_EDEFAULT);
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
		case Fta_domain_modelPackage.PLAYER_STATISTICS__GOALS:
			return goals != GOALS_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__ASSISTS:
			return assists != ASSISTS_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__FOULS:
			return fouls != FOULS_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__YELLOW_CARDS:
			return yellowCards != YELLOW_CARDS_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER_STATISTICS__RED_CARDS:
			return redCards != RED_CARDS_EDEFAULT;
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
		result.append(" (goals: ");
		result.append(goals);
		result.append(", assists: ");
		result.append(assists);
		result.append(", fouls: ");
		result.append(fouls);
		result.append(", yellowCards: ");
		result.append(yellowCards);
		result.append(", redCards: ");
		result.append(redCards);
		result.append(')');
		return result.toString();
	}

} //PlayerStatisticsImpl
