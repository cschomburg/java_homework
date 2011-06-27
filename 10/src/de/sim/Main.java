/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 10 - Programmieren (Java) - Gruppe 6
 * 21.06.11 - 28.06.11
 */

package de.sim;

public class Main {

	public static void main(String... args) {
		Drive drive = new Drive("A");

		// Laufwerk füllen
		try {
			drive.add("", new Folder("Daten"));
			drive.add("Daten", new Folder("Dokumente"));
			drive.add("Daten", new File("uebung10.txt", 1024));
			// drive.add("Daten/Meow", new File("uebung10.txt", 1024)); // Exception
			drive.add("", new Folder("Programme"));
		} catch (FSONotFoundException exception) {
			System.out.println("Error: " + exception.toString());
		}
		System.out.println(drive.toString() + "\n");

		// Löschen testen
		try {
			drive.delete("Daten", "uebung10.txt");
		} catch (FSONotFoundException exception) {
			System.out.println("Error: " + exception.toString());
		}
		System.out.println(drive.toString());
	}
}
