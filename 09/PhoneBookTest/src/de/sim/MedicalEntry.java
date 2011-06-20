/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 09 - Programmieren (Java) - Gruppe 6
 * 07.06.11 - 21.06.11
 */

package de.sim;

public class MedicalEntry extends CommercialEntry {

	private String m_emergencyNumber;

	public MedicalEntry(String name, String phoneNumber, String emergencyNumber) {
		setName(name);
		setPhoneNumber(phoneNumber);
		m_emergencyNumber = emergencyNumber;
	}

	@Override public String toString() {
		return String.format("%s\tRufnummer für Notfälle: %s",
				super.toString(), m_emergencyNumber);
	}
}
