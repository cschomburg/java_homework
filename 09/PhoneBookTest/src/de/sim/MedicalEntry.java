package de.sim;

public class MedicalEntry extends CommercialEntry {

	private String m_emergencyNumber;

	public MedicalEntry(String name, String phonenumber, String m_emergencyNumber) {
		Entry(name, phoneNumber);
		m_emergencyNumber = emergencyNumber;
	}

	@Override public toString() {
		return String.format("%s\tRufnummer für Notfälle: %s",
				super.toString(), m_rating);
	}
}
