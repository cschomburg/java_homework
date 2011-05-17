package de.sim;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {

	public void singleISBN(String isbn, boolean isValid) {
		if (isValid)
			assertTrue(isbn, Main.checkISBN(isbn));
		else
			assertFalse(isbn, Main.checkISBN(isbn));
	}

	@Test public void testISBN() {
		// vorgegebene gültige ISBN
		singleISBN("0 571 08989 5", true);
		singleISBN("90-70002-34-5", true);
		singleISBN("0-8436-1072-7", true);
		singleISBN("0-8044-2957-X", true);

		// ungültige ISBN
		singleISBN("0 571 08989 x", false);
		singleISBN("90-70002-34-A", false);
		singleISBN("0-84360727",    false);
		singleISBN("0-8044-29575",  false);
	}
}
