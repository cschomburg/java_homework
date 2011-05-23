/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim;

import de.sim.stack.Stack;
import de.sim.operatorbase.IOperator;
import de.sim.operators.*;

/**
 * Stack-Rechner-Klasse
 */
public class StackCalc {

	private Stack m_stack;
	private IOperator[] m_oplist;

	/**
	 * Standardkonstruktor
	 */
	public StackCalc() {
		m_stack = new Stack();
		m_oplist = new IOperator[]{
			new Absolute(),
			new Addition(),
			new Subtraction(),
			new Multiplication(),
			new Division(),
			new JumpGreaterZero(),
		};
	}

	/**
	 * Prüft, ob der String dem Symbol eines Operatoren entspricht
	 *
	 * @param op ein String
	 * @return Position des Operators im Array oder -1
	 */
	public int checkOp(String op) {
		for (int i = 0; i < m_oplist.length; i++) {
			if (m_oplist[i].getSymbol().equals(op))
				return i;
		}

		return -1;
	}

	/**
	 * Erhält eine Folge aus Zahlen und Operatoren und gibt den
	 * berechneten String zurück
	 *
	 * @param string Folge aus Zahlen und Operatoren
	 * @return berechneter Stack
	 */
	public Stack calc(String string) {
		String[] elements = string.split(" ");

		for (String element : elements) {

			int opPos = checkOp(element);
			if (opPos == -1) {
				m_stack.push(Integer.parseInt(element));
			} else {
				IOperator op = m_oplist[opPos];
				if (!op.execute(m_stack)) {
					System.out.printf("Error: Too few arguments for '%s'!\n", op.getSymbol());
					System.exit(1);
				}
			}
		}

		return m_stack;
	}
}
