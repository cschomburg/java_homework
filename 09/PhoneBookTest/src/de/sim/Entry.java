package de.sim;

public class Entry {

	private String m_name;
	private String m_phoneNumber;

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

	@Override public void toString() {
		return m_name + "..." + m_phoneNumber;
	}
}
