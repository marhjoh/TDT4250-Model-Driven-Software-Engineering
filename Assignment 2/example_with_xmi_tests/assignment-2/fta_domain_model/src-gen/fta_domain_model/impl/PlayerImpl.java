/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Player;
import fta_domain_model.PlayerPosition;
import fta_domain_model.PlayerStatistics;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getPlayerstatistics <em>Playerstatistics</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link fta_domain_model.impl.PlayerImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final PlayerPosition POSITION_EDEFAULT = PlayerPosition.MIDFIELDER;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PlayerPosition position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayerstatistics() <em>Playerstatistics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerstatistics()
	 * @generated
	 * @ordered
	 */
	protected PlayerStatistics playerstatistics;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.PLAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerPosition getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(PlayerPosition newPosition) {
		PlayerPosition oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerStatistics getPlayerstatistics() {
		if (playerstatistics != null && playerstatistics.eIsProxy()) {
			InternalEObject oldPlayerstatistics = (InternalEObject) playerstatistics;
			playerstatistics = (PlayerStatistics) eResolveProxy(oldPlayerstatistics);
			if (playerstatistics != oldPlayerstatistics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS, oldPlayerstatistics, playerstatistics));
			}
		}
		return playerstatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerStatistics basicGetPlayerstatistics() {
		return playerstatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerstatistics(PlayerStatistics newPlayerstatistics) {
		PlayerStatistics oldPlayerstatistics = playerstatistics;
		playerstatistics = newPlayerstatistics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS,
					oldPlayerstatistics, playerstatistics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__BIRTH_DATE,
					oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.PLAYER__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.PLAYER__NAME:
			return getName();
		case Fta_domain_modelPackage.PLAYER__POSITION:
			return getPosition();
		case Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS:
			if (resolve)
				return getPlayerstatistics();
			return basicGetPlayerstatistics();
		case Fta_domain_modelPackage.PLAYER__BIRTH_DATE:
			return getBirthDate();
		case Fta_domain_modelPackage.PLAYER__AGE:
			return getAge();
		case Fta_domain_modelPackage.PLAYER__NUMBER:
			return getNumber();
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
		case Fta_domain_modelPackage.PLAYER__NAME:
			setName((String) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER__POSITION:
			setPosition((PlayerPosition) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS:
			setPlayerstatistics((PlayerStatistics) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER__BIRTH_DATE:
			setBirthDate((Date) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER__AGE:
			setAge((Integer) newValue);
			return;
		case Fta_domain_modelPackage.PLAYER__NUMBER:
			setNumber((Integer) newValue);
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
		case Fta_domain_modelPackage.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS:
			setPlayerstatistics((PlayerStatistics) null);
			return;
		case Fta_domain_modelPackage.PLAYER__BIRTH_DATE:
			setBirthDate(BIRTH_DATE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Fta_domain_modelPackage.PLAYER__NUMBER:
			setNumber(NUMBER_EDEFAULT);
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
		case Fta_domain_modelPackage.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fta_domain_modelPackage.PLAYER__POSITION:
			return position != POSITION_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER__PLAYERSTATISTICS:
			return playerstatistics != null;
		case Fta_domain_modelPackage.PLAYER__BIRTH_DATE:
			return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
		case Fta_domain_modelPackage.PLAYER__AGE:
			return age != AGE_EDEFAULT;
		case Fta_domain_modelPackage.PLAYER__NUMBER:
			return number != NUMBER_EDEFAULT;
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
		result.append(", position: ");
		result.append(position);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(", age: ");
		result.append(age);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
