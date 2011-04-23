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
		game.start(rounds);
	}
}


/**
 * Ein Spielfeld
 */
class Conway {

	public int[][] grid;
	public int[][] tmp;

	/**
	 * Initialisiert das Gitter mit einem Glider
	 */
	public Conway() {
		grid = new int[10][10];

		grid[5][4] = 1;
		grid[6][5] = 1;
		grid[4][6] = 1;
		grid[5][6] = 1;
		grid[6][6] = 1;
	}

	/**
	 * Überprüft die Nachbarn und setzt entsprechend den Zustand der Zelle
	 *
	 * @param x X-Position der Zelle
	 * @param y Y-Position der Zelle
	 */
	public void checkAndSet(int x, int y) {
		int neighbours = 0;
		if (y > 1) {
			if (x > 1) {
				neighbours += grid[x-1][y-1];
			}
			neighbours += grid[x][y - 1];
			if (x < grid.length-1) {
				neighbours += grid[x+1][y-1];
			}
		}

		if (x > 1) {
			neighbours += grid[x-1][y];
		}
		if (x < grid[0].length - 1) {
			neighbours += grid[x+1][y];
		}

		if (y < grid[0].length - 1) {
			if (x > 1) {
				neighbours += grid[x-1][y+1];
			}
			neighbours += grid[x][y+1];
			if (x < grid[0].length - 1) {
				neighbours += grid[x+1][y+1];
			}
		}

		if (neighbours < 2 || neighbours > 3) {
			tmp[x][y] = 0;
		} else if (neighbours == 3) {
			tmp[x][y] = 1;
		} else {
			tmp[x][y] = grid[x][y];
		}
	}

	/**
	 * Gibt das aktuelle Spielfeld aus
	 */
	public void print() {
		for (int y = 0; y < grid[0].length; y++) {
			for (int x = 0; x < grid.length; x++) {
				if (grid[x][y] == 1) {
					System.out.print("0");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Führt einen Schritt im gesamten Gitter aus
	 */
	public void step() {
		tmp = new int[grid.length][grid[0].length];

		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				checkAndSet(x, y);
			}
		}
		grid = tmp;
	}

	/**
	 * Führt eine Anzahl von Schritten aus und gibt in jedem Schritt denZustand zurück
	 *
	 * @param rounds Anzahl der durchzuführenden Schritte
	 */
	public void start(int rounds) {
		System.out.println("Start configuration:");
		print();

		for (int round = 1; round <= rounds; round++) {
			step();
			System.out.printf("\nStep %d\n", round);
			print();
		}
	}
}
