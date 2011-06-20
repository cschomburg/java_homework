/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 09 - Programmieren (Java) - Gruppe 6
 * 07.06.11 - 21.06.11
 */

public class Phone {

	public static void main(String... args) {
		InternalPhoneBook book = new InternalPhoneBook();

		book.add("0123-987456", "Dr. House");
		book.add("555-1234567", "Al's Pancake House");

		System.out.println(book.getCallerID("555-1234567"));
		System.out.println(book.getCallerID("0123-987456"));
		System.out.println(book.getCallerID("123"));
	}
}
