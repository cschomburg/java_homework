/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 02 - Programmieren (Java) - Gruppe 6
 * 12.04.11 - 19.04.11
 *
 * Aufgabe 2:
 * Listet alle Primzahlen von 1 bis 1000 auf
 */
public class Primzahl {

	public static void main(String... args) {
		for (int i = 2; i <= 1000; i++) {
			boolean divisible = false;

			for (int div = 2; div < i; div++) {
				if (i % div == 0) {
					divisible = true;
					break;
				}
			}

			if (!divisible)
				System.out.printf("%d ist eine Primzahl\n", i);
		}
	}
}
