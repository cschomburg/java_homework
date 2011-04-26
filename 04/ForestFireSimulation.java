/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class ForestFireSimulation {

	public static void main(String... args) {
		int rounds = 10;
		int size = 15;

		// Erster Parameter: Anzahl Runden
		if (args.length > 0) {
			rounds = Integer.parseInt(args[0]);
		}
		// Zweiter Parameter: Größe Feld
		if (args.length > 1) {
			size = Integer.parseInt(args[1]);
		}

		ForestFire forestFire = new ForestFire(size);
		forestFire.start(rounds);
	}
}
