/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 06 - Programmieren (Java) - Gruppe 6
 * 10.05.11 - 17.05.11
 */

package de.sim;

/**
 * Hauptklasse
 */
public class Main {

	/**
	 * Prüft eine ISBN auf Gültigkeit
	 *
	 * @param isbn die ISBN
	 * @return true bei Gültigkeit
	 */
	public static boolean checkISBN(String isbn) {
		int sum = 0;
		int factor = 10;
		for (int i = 0; i < isbn.length(); i++) {
			char c = isbn.charAt(i);
			int value;

			if (c == ' ' || c == '-')
				continue;
			if (factor == 1 && c == 'X') {
				value = 10;
			} else {
				value = Character.digit(c, 10);
				if (value == -1) // Ungültiges Zeichen
					return false;
			}

			if (factor <= 0)
				return false; // Zu viele Ziffern

			sum += factor * value;
			factor--;
		}

		if (factor > 0)
			return false; // Zu wenig Ziffern

		return (sum % 11 == 0);
	}

	public static void main(String... args) {
		if (args.length == 0) {
			System.out.println("Error: No ISBN given!");
			System.exit(1);
		}

		String isbn = args[0];

		if (checkISBN(isbn)) {
			System.out.println("Valid ISBN");
		} else {
			System.out.println("Invalid ISBN");
		}
	}
}
