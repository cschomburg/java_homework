/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 01 - Programmieren (Java) - Gruppe 6
 * 05.04.11 - 12.04.11
 *
 * Berechnet die Fakultät einer fest genannten Zahl.
 */
public class Fact {

	public static void main(String... args) {
		int n = 5;

		int i = n;
		int factorial = 1;
		while (i > 1) {
			factorial *= i;
			i--;
		}

		System.out.println("Factorial of " + n + " is " + factorial);
	}
}
