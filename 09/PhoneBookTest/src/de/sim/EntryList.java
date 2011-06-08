package de.sim;

import java.util.Vector;

public class EntryList<T extends Entry> {

	private Vector<T> m_list;

	public EntryList() {
		m_list = new Vector<T>();
	}
	
	void add(T entry) {
		m_list.add(entry);
	}

	@Override public String toString() {
		String str = "";
		for (T entry : m_list) {
			if (!str.isEmpty())
				str += "\n";
			str += entry.toString();
		}
		return str;
	}
}
