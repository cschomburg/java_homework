package de.sim.media;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;

public class CD implements ISortable {

	private String m_artist;
	private String m_title;

	public CD(String artist, String title) {
		m_artist = artist;
		m_title = title;
	}

	@Override public String toString() {
		return String.format("CD: Artist: %s, Title: %s",
							 m_artist, m_title);
	}

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
