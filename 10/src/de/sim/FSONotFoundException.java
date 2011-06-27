/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 10 - Programmieren (Java) - Gruppe 6
 * 21.06.11 - 28.06.11
 */

package de.sim;

public class FSONotFoundException extends Exception {

	private String m_name;

	public FSONotFoundException(String name) {
		m_name = name;
	}

	public String getName() {
		return m_name;
	}

	@Override public String toString() {
		return String.format("FileSystemObject '%s' not found!", getName());
	}
}
