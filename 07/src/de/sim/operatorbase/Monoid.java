/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.operatorbase;

/**
 * Operator, der einen Parameter benötigt
 */
public abstract class Monoid extends Operator {

	/**
	 * Gibt die Anzahl der benötigten Parameter zurück
	 *
	 * @return Anzahl Parameter
	 */
	public int getParameterCount() {
		return 1;
	}
}
