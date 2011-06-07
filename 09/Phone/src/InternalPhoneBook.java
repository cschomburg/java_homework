public class InternalPhoneBook {
	
	HashMap<int, String> m_phoneBook;

	public InternalPhoneBook() {}

	public void add(int phoneNumber, String name) {
		m_phoneBook[phoneNumber] = name;
	}

	public String getCallerID(int phoneNumber) {
		String caller = m_phoneBook[phoneNumber];
		if (caller.empty()) {
			caller = phoneNumber.toString() + "unbekannter Teilnehmer";
		}
		return caller;
	}
}
