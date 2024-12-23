/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Player;
import fta_domain_model.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getTeamSize <em>Team Size</em>}</li>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getManagerName <em>Manager Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getTotalGoals <em>Total Goals</em>}</li>
 *   <li>{@link fta_domain_model.impl.TeamImpl#getTeamID <em>Team ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	
	/**
     * Overriding equals method to define equality for Team objects.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // Samme referanse
	    if (obj == null || getClass() != obj.getClass()) return false; // Ulike klasser
	    TeamImpl team = (TeamImpl) obj;
	    return teamID == team.getTeamID() || (name != null && name.equals(team.getName()));
	}

	/**
     * Overriding equals method to define equality for Team objects.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public int hashCode() {
        return 31 * (name != null ? name.hashCode() : 0) + Integer.hashCode(teamID);
    }
	
	
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeamSize() <em>Team Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TEAM_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTeamSize() <em>Team Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamSize()
	 * @generated
	 * @ordered
	 */
	protected int teamSize = TEAM_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The default value of the '{@link #getManagerName() <em>Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerName() <em>Manager Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerName()
	 * @generated
	 * @ordered
	 */
	protected String managerName = MANAGER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalGoals() <em>Total Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGoals()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_GOALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalGoals() <em>Total Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalGoals()
	 * @generated
	 * @ordered
	 */
	protected int totalGoals = TOTAL_GOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeamID() <em>Team ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamID()
	 * @generated
	 * @ordered
	 */
	protected static final int TEAM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTeamID() <em>Team ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamID()
	 * @generated
	 * @ordered
	 */
	protected int teamID = TEAM_ID_EDEFAULT;

	private static int nextTeamID = 1; // Static counter for unique IDs

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TeamImpl() {
		super();
		teamID = nextTeamID++;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTeamSize() {
		return teamSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeamSize(int newTeamSize) {
		int oldTeamSize = teamSize;
		teamSize = newTeamSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TEAM__TEAM_SIZE, oldTeamSize,
					teamSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, Fta_domain_modelPackage.TEAM__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagerName() {
		return managerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerName(String newManagerName) {
		String oldManagerName = managerName;
		managerName = newManagerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TEAM__MANAGER_NAME,
					oldManagerName, managerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalGoals() {
		return totalGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalGoals(int newTotalGoals) {
		int oldTotalGoals = totalGoals;
		totalGoals = newTotalGoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TEAM__TOTAL_GOALS,
					oldTotalGoals, totalGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTeamID() {
		return teamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeamID(int newTeamID) {
		int oldTeamID = teamID;
		teamID = newTeamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TEAM__TEAM_ID, oldTeamID,
					teamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fta_domain_modelPackage.TEAM__PLAYERS:
			return ((InternalEList<?>) getPlayers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.TEAM__NAME:
			return getName();
		case Fta_domain_modelPackage.TEAM__TEAM_SIZE:
			return getTeamSize();
		case Fta_domain_modelPackage.TEAM__PLAYERS:
			return getPlayers();
		case Fta_domain_modelPackage.TEAM__MANAGER_NAME:
			return getManagerName();
		case Fta_domain_modelPackage.TEAM__TOTAL_GOALS:
			return getTotalGoals();
		case Fta_domain_modelPackage.TEAM__TEAM_ID:
			return getTeamID();
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
		case Fta_domain_modelPackage.TEAM__NAME:
			setName((String) newValue);
			return;
		case Fta_domain_modelPackage.TEAM__TEAM_SIZE:
			setTeamSize((Integer) newValue);
			return;
		case Fta_domain_modelPackage.TEAM__PLAYERS:
			getPlayers().clear();
			getPlayers().addAll((Collection<? extends Player>) newValue);
			return;
		case Fta_domain_modelPackage.TEAM__MANAGER_NAME:
			setManagerName((String) newValue);
			return;
		case Fta_domain_modelPackage.TEAM__TOTAL_GOALS:
			setTotalGoals((Integer) newValue);
			return;
		case Fta_domain_modelPackage.TEAM__TEAM_ID:
			setTeamID((Integer) newValue);
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
		case Fta_domain_modelPackage.TEAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TEAM__TEAM_SIZE:
			setTeamSize(TEAM_SIZE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TEAM__PLAYERS:
			getPlayers().clear();
			return;
		case Fta_domain_modelPackage.TEAM__MANAGER_NAME:
			setManagerName(MANAGER_NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TEAM__TOTAL_GOALS:
			setTotalGoals(TOTAL_GOALS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TEAM__TEAM_ID:
			setTeamID(TEAM_ID_EDEFAULT);
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
		case Fta_domain_modelPackage.TEAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fta_domain_modelPackage.TEAM__TEAM_SIZE:
			return teamSize != TEAM_SIZE_EDEFAULT;
		case Fta_domain_modelPackage.TEAM__PLAYERS:
			return players != null && !players.isEmpty();
		case Fta_domain_modelPackage.TEAM__MANAGER_NAME:
			return MANAGER_NAME_EDEFAULT == null ? managerName != null : !MANAGER_NAME_EDEFAULT.equals(managerName);
		case Fta_domain_modelPackage.TEAM__TOTAL_GOALS:
			return totalGoals != TOTAL_GOALS_EDEFAULT;
		case Fta_domain_modelPackage.TEAM__TEAM_ID:
			return teamID != TEAM_ID_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", teamSize: ");
		result.append(teamSize);
		result.append(", managerName: ");
		result.append(managerName);
		result.append(", totalGoals: ");
		result.append(totalGoals);
		result.append(", teamID: ");
		result.append(teamID);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
