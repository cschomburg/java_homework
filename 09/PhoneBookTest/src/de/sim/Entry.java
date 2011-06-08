package de.sim;

public class Entry {

	private String m_name;
	private String m_phoneNumber;

	public Entry() {}

	public Entry(String name, String phoneNumber) {
		m_name = name;
		m_phoneNumber = phoneNumber;
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		m_name = name;
	}
	
	public String getPhoneNumber() {
		return m_phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		m_phoneNumber = phoneNumber;
	}

	@Override public String toString() {
		return padding(m_name, 25) + m_phoneNumber;
	}

	public static String padding(String str, int length) {
		int diff = length - str.length();
		if (diff <= 0)
			return str;
		return str + String.format("%-" + diff + "s", "").replaceAll(" ", ".");
	}
}
