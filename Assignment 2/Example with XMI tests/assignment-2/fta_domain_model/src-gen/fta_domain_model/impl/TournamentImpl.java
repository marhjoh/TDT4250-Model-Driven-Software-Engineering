/**
 */
package fta_domain_model.impl;

import fta_domain_model.Bracket;
import fta_domain_model.DataStorage;
import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Match;
import fta_domain_model.Team;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentFormat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTournamentType <em>Tournament Type</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getTournamentformat <em>Tournamentformat</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getNumberOfTeams <em>Number Of Teams</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link fta_domain_model.impl.TournamentImpl#getDatastorage <em>Datastorage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
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
	 * The default value of the '{@link #getTournamentType() <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOURNAMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTournamentType() <em>Tournament Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentType()
	 * @generated
	 * @ordered
	 */
	protected String tournamentType = TOURNAMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

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
	 * The cached value of the '{@link #getTournamentformat() <em>Tournamentformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournamentformat()
	 * @generated
	 * @ordered
	 */
	protected TournamentFormat tournamentformat;

	/**
	 * The default value of the '{@link #getNumberOfTeams() <em>Number Of Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTeams()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TEAMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTeams() <em>Number Of Teams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTeams()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTeams = NUMBER_OF_TEAMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrackets() <em>Brackets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrackets()
	 * @generated
	 * @ordered
	 */
	protected Bracket brackets;

	/**
	 * The cached value of the '{@link #getDatastorage() <em>Datastorage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastorage()
	 * @generated
	 * @ordered
	 */
	protected DataStorage datastorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.TOURNAMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTournamentType() {
		return tournamentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentType(String newTournamentType) {
		String oldTournamentType = tournamentType;
		tournamentType = newTournamentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE,
					oldTournamentType, tournamentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this,
					Fta_domain_modelPackage.TOURNAMENT__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectEList<Team>(Team.class, this, Fta_domain_modelPackage.TOURNAMENT__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TournamentFormat getTournamentformat() {
		if (tournamentformat != null && tournamentformat.eIsProxy()) {
			InternalEObject oldTournamentformat = (InternalEObject) tournamentformat;
			tournamentformat = (TournamentFormat) eResolveProxy(oldTournamentformat);
			if (tournamentformat != oldTournamentformat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT, oldTournamentformat,
							tournamentformat));
			}
		}
		return tournamentformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TournamentFormat basicGetTournamentformat() {
		return tournamentformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTournamentformat(TournamentFormat newTournamentformat) {
		TournamentFormat oldTournamentformat = tournamentformat;
		tournamentformat = newTournamentformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT,
					oldTournamentformat, tournamentformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfTeams(int newNumberOfTeams) {
		int oldNumberOfTeams = numberOfTeams;
		numberOfTeams = newNumberOfTeams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS,
					oldNumberOfTeams, numberOfTeams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bracket getBrackets() {
		return brackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrackets(Bracket newBrackets, NotificationChain msgs) {
		Bracket oldBrackets = brackets;
		brackets = newBrackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.TOURNAMENT__BRACKETS, oldBrackets, newBrackets);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrackets(Bracket newBrackets) {
		if (newBrackets != brackets) {
			NotificationChain msgs = null;
			if (brackets != null)
				msgs = ((InternalEObject) brackets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Fta_domain_modelPackage.TOURNAMENT__BRACKETS, null, msgs);
			if (newBrackets != null)
				msgs = ((InternalEObject) newBrackets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Fta_domain_modelPackage.TOURNAMENT__BRACKETS, null, msgs);
			msgs = basicSetBrackets(newBrackets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__BRACKETS,
					newBrackets, newBrackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStorage getDatastorage() {
		if (datastorage != null && datastorage.eIsProxy()) {
			InternalEObject oldDatastorage = (InternalEObject) datastorage;
			datastorage = (DataStorage) eResolveProxy(oldDatastorage);
			if (datastorage != oldDatastorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE, oldDatastorage, datastorage));
			}
		}
		return datastorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStorage basicGetDatastorage() {
		return datastorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatastorage(DataStorage newDatastorage) {
		DataStorage oldDatastorage = datastorage;
		datastorage = newDatastorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE,
					oldDatastorage, datastorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
			return ((InternalEList<?>) getMatches()).basicRemove(otherEnd, msgs);
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return basicSetBrackets(null, msgs);
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			return getName();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			return getTournamentType();
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
			return getMatches();
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			return getTeams();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			if (resolve)
				return getTournamentformat();
			return basicGetTournamentformat();
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			return getNumberOfTeams();
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return getBrackets();
		case Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE:
			if (resolve)
				return getDatastorage();
			return basicGetDatastorage();
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			setName((String) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			setTournamentType((String) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
			getMatches().clear();
			getMatches().addAll((Collection<? extends Match>) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			getTeams().clear();
			getTeams().addAll((Collection<? extends Team>) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			setTournamentformat((TournamentFormat) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			setNumberOfTeams((Integer) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			setBrackets((Bracket) newValue);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE:
			setDatastorage((DataStorage) newValue);
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			setTournamentType(TOURNAMENT_TYPE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
			getMatches().clear();
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			getTeams().clear();
			return;
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			setTournamentformat((TournamentFormat) null);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			setNumberOfTeams(NUMBER_OF_TEAMS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			setBrackets((Bracket) null);
			return;
		case Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE:
			setDatastorage((DataStorage) null);
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
		case Fta_domain_modelPackage.TOURNAMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENT_TYPE:
			return TOURNAMENT_TYPE_EDEFAULT == null ? tournamentType != null
					: !TOURNAMENT_TYPE_EDEFAULT.equals(tournamentType);
		case Fta_domain_modelPackage.TOURNAMENT__MATCHES:
			return matches != null && !matches.isEmpty();
		case Fta_domain_modelPackage.TOURNAMENT__TEAMS:
			return teams != null && !teams.isEmpty();
		case Fta_domain_modelPackage.TOURNAMENT__TOURNAMENTFORMAT:
			return tournamentformat != null;
		case Fta_domain_modelPackage.TOURNAMENT__NUMBER_OF_TEAMS:
			return numberOfTeams != NUMBER_OF_TEAMS_EDEFAULT;
		case Fta_domain_modelPackage.TOURNAMENT__BRACKETS:
			return brackets != null;
		case Fta_domain_modelPackage.TOURNAMENT__DATASTORAGE:
			return datastorage != null;
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
		result.append(", tournamentType: ");
		result.append(tournamentType);
		result.append(", numberOfTeams: ");
		result.append(numberOfTeams);
		result.append(')');
		return result.toString();
	}

} //TournamentImpl
