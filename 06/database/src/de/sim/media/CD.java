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
 * Eine CD
 */
public class CD implements ISortable {

	private String m_artist;
	private String m_title;

	/**
	 * Erstellt eine CD mit Interpreten und Titel
	 *
	 * @param artist Interpret der CD
	 * @param title Titel der CD
	 */
	public CD(String artist, String title) {
		m_artist = artist;
		m_title = title;
	}

	/**
	 * Gibt eine String-Repräsentation zurück
	 *
	 * @return String
	 */
	@Override public String toString() {
		return String.format("CD: Artist: %s, Title: %s",
							 m_artist, m_title);
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
		case FIRST_NAME:
			return m_artist;
		case TITLE:
		default:
			return m_title;
		}
	}
}
