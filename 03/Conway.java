/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 03 - Programmieren (Java) - Gruppe 6
 * 19.04.11 - 26.04.11
 *
 * Aufgabe 1:
 * Implementation von Conways Game of Life
 */
class Conway {

	public int[][] grid;
	public int[][] tmp;

	/**
	 * Initialisiert das Gitter mit einem Glider
	 */
	public Conway() {
		grid = new int[10][10];
	}

	/**
	 * Überprüft die Nachbarn und setzt entsprechend den Zustand der Zelle
	 *
	 * @param x X-Position der Zelle
	 * @param y Y-Position der Zelle
	 */
	public void checkAndSet(int x, int y) {
		int neighbours = 0;

		// Obere Reihe
		if (y > 1) {
			if (x > 1) {
				neighbours += grid[y-1][x-1]; // Links
			}
			neighbours += grid[y-1][x]; // Mitte
			if (x < grid.length-1) {
				neighbours += grid[y-1][x+1]; // Rechts
			}
		}

		// Mittlere Reihe
		if (x > 1) {
			neighbours += grid[y][x-1]; // Links
		}
		if (x < grid[0].length - 1) {
			neighbours += grid[y][x+1]; // Rechts
		}

		// Untere Reihe
		if (y < grid[0].length - 1) {
			if (x > 1) {
				neighbours += grid[y+1][x-1]; // Links
			}
			neighbours += grid[y+1][x]; // Mitte
			if (x < grid[0].length - 1) {
				neighbours += grid[y+1][x+1]; // Rechts
			}
		}

		// Regeln
		if (neighbours == 2) {
			tmp[y][x] = grid[y][x];
		} else if (neighbours == 3) {
			tmp[y][x] = 1;
		} else {
			tmp[y][x] = 0;
		}
	}

	/**
	 * Gibt das aktuelle Spielfeld aus
	 */
	public void print() {
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				if (grid[y][x] == 1) {
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

		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
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

	/**
	 * Fügt ein Muster an der Stelle (x, y) ins Gitter ein
	 *
	 * @param pattern Zweidimensionales Array mit Muster
	 * @param x X-Koordinate
	 * @param y Y-Koordinate
	 */
	public void setPattern(final int[][] pattern, int x, int y) {
		for (int pY = 0; pY < pattern.length; pY++) {
			for (int pX = 0; pX < pattern[pY].length;  pX++) {
				int gX = pX + x;
				int gY = pY + y;

				if ((gY >= 0) && (gY < grid.length)
					&& (gX >= 0) && (gX < grid[0].length)) {
					grid[gY][gX] = pattern[pY][pX];
				}
			}
		}
	}
}
