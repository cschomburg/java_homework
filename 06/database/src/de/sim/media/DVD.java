package de.sim.media;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;

public class DVD implements ISortable {

	private String m_director;
	private String m_title;

	public DVD(String director, String title) {
		m_director = director;
		m_title = title;
	}

	@Override public String toString() {
		return String.format("DVD: Director: %s, Title: %s",
							 m_director, m_title);
	}

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
