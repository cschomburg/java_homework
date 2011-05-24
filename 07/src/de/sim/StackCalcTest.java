/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim;

import org.junit.*;
import static org.junit.Assert.*;

import de.sim.stack.Stack;

/**
 * Testet den Stackrechner
 */
public class StackCalcTest {

	/**
	 * Führt einen einzelnen Test aus
	 *
	 * @param input eingebener String
	 * @param expected erwarteter Ergebnis-Stack
	 */
	public void singleTest(String input, String expected) {
		StackCalc calc = new StackCalc();
		Stack stack = calc.calc(input);
		assertEquals(expected, stack.toString());
	}

	/**
	 * Testet die Vorgaben aus dem Übungsblatt
	 */
	@Test public void testCalc() {
		singleTest("4 5 + 3 *",          "[27]");
		singleTest("9 50 -1 jgz 27 /",   "[3]");
		singleTest("1 2 3 4 5 * + -",    "[21,1]");
		singleTest("1 2 3 4 5 * + - +",  "[22]");
		singleTest("3 -2 * abs",         "[6]");
	}
}
