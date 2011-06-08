import java.util.HashMap;

public class InternalPhoneBook {
	
	private HashMap<String, String> m_phoneBook;

	public InternalPhoneBook() {
		m_phoneBook = new HashMap<String, String>();
	}

	public void add(String phoneNumber, String name) {
		m_phoneBook.put(phoneNumber, name);
	}

	public String getCallerID(String phoneNumber) {
		String caller = m_phoneBook.get(phoneNumber);
		if (caller == null) {
			caller = phoneNumber.toString() + " unbekannter Teilnehmer";
		}
		return caller;
	}
}
