/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.operatorbase;

import de.sim.stack.Stack;

/**
 * Interface für einen Operator
 */
public interface IOperator {
	String getSymbol();
	int getParameterCount();
	boolean execute(Stack s);
}
