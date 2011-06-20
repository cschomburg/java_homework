/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 09 - Programmieren (Java) - Gruppe 6
 * 07.06.11 - 21.06.11
 */

package de.sim;

public class PhoneBookTest {

	public static void main(String... args) {
		YellowPages yellowPages = new YellowPages();
		yellowPages.add(new GastronomyEntry("Al's Pancake World", "555-1234567", 4));
		yellowPages.add(new MedicalEntry("Dr. House", "0123-987456", "911"));
		System.out.println("Die Gelben Seiten:");
		System.out.println(yellowPages.toString());

		PhoneBook phoneBook = new PhoneBook();
		phoneBook.add(new Entry("Willy Meyer", "0171-1234567"));
		phoneBook.add(new MedicalEntry("Dr. Jan Itor", "0511-246810", "112"));
		phoneBook.add(new GastronomyEntry("Karls heisse Pfanne", "0511-456456", 2));
		System.out.println("\nDas Örtliche:");
		System.out.println(phoneBook.toString());
	}
}
