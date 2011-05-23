package de.sim;

import org.junit.*;
import static org.junit.Assert.*;

import de.sim.stack.Stack;

public class StackCalcTest {

	public void singleTest(String input, String expected) {
		StackCalc calc = new StackCalc();
		Stack stack = calc.calc(input);

		// Formatiere Stack-Ausgabe
		String contents = "";
		while (!stack.isEmpty()) {
			if (!contents.isEmpty())
				contents += ",";
			contents += stack.pop();
		}

		assertEquals(expected, "["+contents+"]");
	}

	@Test public void testCalc() {
		singleTest("4 5 + 3 *",          "[27]");
		singleTest("9 50 -1 jgz 27 /",   "[3]");
		singleTest("1 2 3 4 5 * + -",    "[21,1]");
		singleTest("1 2 3 4 5 * + - +",  "[22]");
		singleTest("3 -2 * abs",         "[6]");
	}
}
