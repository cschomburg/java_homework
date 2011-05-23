/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.operatorbase;

import de.sim.stack.Stack;

/**
 * Basisklasse für Operatoren
 */
public abstract class Operator implements IOperator {

	protected String m_symbol;

	/**
	 * Gibt das Symbol des Operators zurück
	 *
	 * @return Symbol
	 */
	public String getSymbol() {
		return m_symbol;
	}

	/**
	 * Setzt das Symbol des Operators
	 *
	 * @param symbol Symbol
	 */
	protected void setSymbol(String symbol) {
		m_symbol = symbol;
	}

	/**
	 * Gibt die Anzahl der benötigten Parameter zurück
	 *
	 * @return Anzahl Parameter
	 */
	abstract public int getParameterCount();

	/**
	 * Liest Parameter aus Stack ein und prüft deren Anzahl
	 *
	 * @param stack Stack mit Daten
	 * @return Array mit Parametern
	 */
	public int[] checkParameter(Stack stack) {
		int paramCount = getParameterCount();
		int[] dataStore = new int[paramCount];

		for (int i = 0; i < paramCount; i++) {
			if (stack.isEmpty())
				return null;

			dataStore[i] = stack.pop();
		}

		return dataStore;
	}

	/**
	 * Führt eine Operation auf dem Stack aus
	 */
	abstract public boolean execute(Stack stack);
}
