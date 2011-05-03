package de.sim;

import de.sim.tree.*;
import de.sim.parser.*;
import de.sim.walker.*;

public class Main {

	public static void main(String... args) {
		if (args.length < 1) {
			System.out.println("FEHLER: Eine S-Expression wird benoetigt!");
			return;
		}

		Parser parser = new Parser();
		Walker walker = new Walker();

		Node root = parser.start(args[0]);
		int result = walker.walk(root);

		System.out.println(result);
	}
}
