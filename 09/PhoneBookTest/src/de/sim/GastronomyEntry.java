package de.sim;

public class GastronomyEntry extends CommercialEntry {

	private int m_rating;

	public GastronomyEntry(String name, String phoneNumber, int rating) {
		Entry(name, phoneNumber);
		m_rating = rating;
	}

	@Override public toString() {
		return String.format("%s\tBewertung: %d Sterne",
				super.toString(), m_rating);
	}
}
