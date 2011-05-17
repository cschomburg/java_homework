/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 06 - Programmieren (Java) - Gruppe 6
 * 10.05.11 - 17.05.11
 */

package de.sim.media;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;

/**
 * Ein Buch
 */
public class Book implements ISortable {

	private String m_author;
	private String m_title;

	/**
	 * Erstellt ein Buch mit Autor und Titel
	 *
	 * @param author Autor des Buches
	 * @param title Titel des Buches
	 */
	public Book(String author, String title) {
		m_author = author;
		m_title = title;
	}

	/**
	 * Gibt eine String-Repräsentation zurück
	 *
	 * @return String
	 */
	@Override public String toString() {
		return String.format("Book: Author: %s, Title: %s",
							 m_author, m_title);
	}

	/**
	 * Gibt je nach Modus den gewünschten String zum Sortieren zurück
	 *
	 * @param mode Sortierungsmodus
	 * @return Sort-String
	 */
	public String getSortString(SortMode mode) {
		switch (mode) {
		case LAST_NAME:
			return m_author.replaceAll("^(.+) (.+?)$", "$2, $1");
		case FIRST_NAME:
			return m_author;
		case TITLE:
		default:
			return m_title;
		}
	}
}
