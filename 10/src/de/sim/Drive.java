/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 10 - Programmieren (Java) - Gruppe 6
 * 21.06.11 - 28.06.11
 */

package de.sim;

public class Drive extends Folder {

	public Drive(String name) {
		super(name);
	}

	@Override public void add(String path, FileSystemObject object) throws FSONotFoundException {
		if (object instanceof Drive) {
			System.out.printf("Error: Can't add Drive '%s' to '%s'\n", object.getName(), getName());
			return;
		}

		super.add(path, object);
	}

	@Override public String toString() {
		return "Drive: " + super.toString();
	}
}
