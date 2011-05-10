package de.sim.media;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;

public class Book implements ISortable {

	private String m_author;
	private String m_title;

	public Book(String author, String title) {
		m_author = author;
		m_title = title;
	}

	@Override public String toString() {
		return String.format("Book: Author: %s, Title: %s",
							 m_author, m_title);
	}

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
