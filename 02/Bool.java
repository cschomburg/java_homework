/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 02 - Programmieren (Java) - Gruppe 6
 * 12.04.11 - 19.04.11
 *
 * Aufgabe 1:
 * Gibt drei Wahrheitstabellen aus:
 *   a AND b AND c
 *   a OR b OR c
 *   (a OR b) XOR c
 */
public class Bool {

	public static void printAND() {
		System.out.println("a\tb\tc\tAND");
		System.out.println("------------------------------");

		for (int iA = 0; iA < 2; iA++) {
			for (int iB = 0; iB < 2; iB++) {
				for (int iC = 0; iC < 2; iC++) {
					boolean a = iA != 0;
					boolean b = iB != 0;
					boolean c = iC != 0;

					System.out.printf("%b\t%b\t%b\t%b\n", a, b, c,
							a && b && c);
				}
			}
		}
	}

	public static void printOR() {
		System.out.println("a\tb\tc\tOR");
		System.out.println("------------------------------");

		for (int iA = 0; iA < 2; iA++) {
			for (int iB = 0; iB < 2; iB++) {
				for (int iC = 0; iC < 2; iC++) {
					boolean a = iA != 0;
					boolean b = iB != 0;
					boolean c = iC != 0;

					System.out.printf("%b\t%b\t%b\t%b\n", a, b, c,
							a || b || c);
				}
			}
		}
	}

	public static void printExpression() {
		System.out.println("a\tb\tc\t(a OR b) XOR c");
		System.out.println("------------------------------");

		for (int iA = 0; iA < 2; iA++) {
			for (int iB = 0; iB < 2; iB++) {
				for (int iC = 0; iC < 2; iC++) {
					boolean a = iA != 0;
					boolean b = iB != 0;
					boolean c = iC != 0;

					boolean aORb = a || b;
					System.out.printf("%b\t%b\t%b\t%b\n", a, b, c,
							(aORb && !c) || (!aORb && c));
				}
			}
		}
	}

	public static void main(String... args) {
		printAND();
		System.out.println();
		printOR();
		System.out.println();
		printExpression();
	}
}
