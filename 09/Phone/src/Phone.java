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
