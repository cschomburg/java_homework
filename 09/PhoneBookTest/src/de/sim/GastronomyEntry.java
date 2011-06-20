/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 09 - Programmieren (Java) - Gruppe 6
 * 07.06.11 - 21.06.11
 */

package de.sim;

public class GastronomyEntry extends CommercialEntry {

	private int m_rating;

	public GastronomyEntry(String name, String phoneNumber, int rating) {
		setName(name);
		setPhoneNumber(phoneNumber);
		m_rating = rating;
	}

	@Override public String toString() {
		return String.format("%s\tBewertung: %d Sterne",
				super.toString(), m_rating);
	}
}
