package de.sim;

public class EntryList<T extends Entry> {
	
	private m_list = Vector<T>;

	void add(T entry) {
		m_list.add(entry);
	}

	@Override public toString() {
		String str = "";
		for (T entry : m_list) {
			if (!str.empty())
				str += "\n";
			str += entry.toString();
		}
		return str;
	}
}
