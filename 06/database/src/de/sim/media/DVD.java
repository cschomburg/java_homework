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
 * Eine DVD
 */
public class DVD implements ISortable {

	private String m_director;
	private String m_title;

	/**
	 * Erstellt eine DVD mit Regisseur und Titel
	 *
	 * @param director Regisseur der DVD
	 * @param title Titel der DVD
	 */
	public DVD(String director, String title) {
		m_director = director;
		m_title = title;
	}

	/**
	 * Gibt eine String-Repräsentation zurück
	 *
	 * @return String
	 */
	@Override public String toString() {
		return String.format("DVD: Director: %s, Title: %s",
							 m_director, m_title);
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
			return m_director.replaceAll("^(.+) (.+?)$", "$2, $1");
		case FIRST_NAME:
			return m_director;
		case TITLE:
		default:
			return m_title;
		}
	}
}
