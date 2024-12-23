/**
 */
package fta_domain_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tournament Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage#getTournamentType()
 * @model
 * @generated
 */
public enum TournamentType implements Enumerator {
	/**
	 * The '<em><b>KNOCKOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOCKOUT_VALUE
	 * @generated
	 * @ordered
	 */
	KNOCKOUT(0, "KNOCKOUT", "KNOCKOUT"),

	/**
	 * The '<em><b>LEAGUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAGUE_VALUE
	 * @generated
	 * @ordered
	 */
	LEAGUE(1, "LEAGUE", "LEAGUE"),

	/**
	 * The '<em><b>ROUND ROBIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_ROBIN(2, "ROUND_ROBIN", "ROUND_ROBIN");

	/**
	 * The '<em><b>KNOCKOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOCKOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KNOCKOUT_VALUE = 0;

	/**
	 * The '<em><b>LEAGUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAGUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAGUE_VALUE = 1;

	/**
	 * The '<em><b>ROUND ROBIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_ROBIN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TournamentType[] VALUES_ARRAY = new TournamentType[] { KNOCKOUT, LEAGUE, ROUND_ROBIN, };

	/**
	 * A public read-only list of all the '<em><b>Tournament Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TournamentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TournamentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tournament Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TournamentType get(int value) {
		switch (value) {
		case KNOCKOUT_VALUE:
			return KNOCKOUT;
		case LEAGUE_VALUE:
			return LEAGUE;
		case ROUND_ROBIN_VALUE:
			return ROUND_ROBIN;
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
	private TournamentType(int value, String name, String literal) {
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

} //TournamentType
