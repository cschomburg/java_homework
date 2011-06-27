/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 10 - Programmieren (Java) - Gruppe 6
 * 21.06.11 - 28.06.11
 */

package de.sim;

public abstract class FileSystemObject implements Comparable<FileSystemObject> {

	private String m_name;

	public FileSystemObject(String name) {
		setName(name);
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		m_name = name;
	}
}
