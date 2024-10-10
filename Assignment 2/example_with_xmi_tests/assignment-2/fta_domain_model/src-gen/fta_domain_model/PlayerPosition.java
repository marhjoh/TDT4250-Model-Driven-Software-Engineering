/**
 */
package fta_domain_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Player Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerPosition()
 * @model
 * @generated
 */
public enum PlayerPosition implements Enumerator {
	/**
	 * The '<em><b>GOALKEEPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOALKEEPER_VALUE
	 * @generated
	 * @ordered
	 */
	GOALKEEPER(0, "GOALKEEPER", "GOALKEEPER"),

	/**
	 * The '<em><b>DEFENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENDER_VALUE
	 * @generated
	 * @ordered
	 */
	DEFENDER(1, "DEFENDER", "DEFENDER"),

	/**
	 * The '<em><b>MIDFIELDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELDER_VALUE
	 * @generated
	 * @ordered
	 */
	MIDFIELDER(2, "MIDFIELDER", "MIDFIELDER"),

	/**
	 * The '<em><b>ATTACKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACKER(3, "ATTACKER", "ATTACKER");

	/**
	 * The '<em><b>GOALKEEPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOALKEEPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOALKEEPER_VALUE = 0;

	/**
	 * The '<em><b>DEFENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFENDER_VALUE = 1;

	/**
	 * The '<em><b>MIDFIELDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDFIELDER_VALUE = 2;

	/**
	 * The '<em><b>ATTACKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATTACKER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Player Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlayerPosition[] VALUES_ARRAY = new PlayerPosition[] { GOALKEEPER, DEFENDER, MIDFIELDER,
			ATTACKER, };

	/**
	 * A public read-only list of all the '<em><b>Player Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlayerPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlayerPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlayerPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Player Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlayerPosition get(int value) {
		switch (value) {
		case GOALKEEPER_VALUE:
			return GOALKEEPER;
		case DEFENDER_VALUE:
			return DEFENDER;
		case MIDFIELDER_VALUE:
			return MIDFIELDER;
		case ATTACKER_VALUE:
			return ATTACKER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PlayerPosition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PlayerPosition
