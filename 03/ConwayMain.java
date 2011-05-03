/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 03 - Programmieren (Java) - Gruppe 6
 * 19.04.11 - 26.04.11
 *
 * Aufgabe 1:
 * Implementation von Conways Game of Life
 */
public class ConwayMain {

	public static void main(String... args) {
		int rounds = 10;
		if (args.length > 0)
			rounds = Integer.parseInt(args[0]);

		Conway game = new Conway();

		int[][] pulsar = {{ 1, 1, 0, 0 },
						  { 1, 1, 0, 0 },
						  { 0, 0, 1, 1 },
						  { 0, 0, 1, 1 }};

		int[][] glider = {{ 0, 1, 0 },
						   { 0, 0, 1 },
						   { 1, 1, 1 }};

		int[][] spaceship = {{ 1, 0, 0, 1, 0 },
							 { 0, 0, 0, 0, 1 },
							 { 1, 0, 0, 0, 1 },
							 { 0, 1, 1, 1, 1 }};

		game.setPattern(glider, 3, 3);

		game.start(rounds);
	}
}
