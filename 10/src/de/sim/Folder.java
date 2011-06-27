/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 10 - Programmieren (Java) - Gruppe 6
 * 21.06.11 - 28.06.11
 */

package de.sim;

import java.util.Vector;
import java.util.Collections;
import java.util.regex.*;

public class Folder extends FileSystemObject {

	private Vector<FileSystemObject> m_contents;

	public Folder(String name) {
		super(name);
		m_contents = new Vector<FileSystemObject>();
	}

	public int compareTo(FileSystemObject other) {
		if (other instanceof Folder)
			return getName().compareTo(((Folder)other).getName());

		return -1;
	}

	public void add(String path, FileSystemObject object) throws FSONotFoundException {
		// Zielordner erreicht?
		if (path == null || path.isEmpty()) {
			m_contents.add(object);
			Collections.sort(m_contents);
			return;
		}

		// Finde nächsten Unterordner-Namen und Rest des Strings (falls verfügbar)
		Matcher matcher = Pattern.compile("^(\\w+)/?([\\w/])*$").matcher(path);
		matcher.find();
		String folderName = matcher.group(1);
		String newPath = matcher.group(2);

		// Hole Ordner aus Liste
		Folder folder = null;
		for (FileSystemObject currObject : m_contents) {
			if (currObject.getName() == folderName && currObject instanceof Folder) {
				folder = (Folder)currObject;
				break;
			}
		}

		if (folder == null) // Ordner nicht gefunden
			throw new FSONotFoundException(folderName);

		// Unterordner Anfrage übermitteln
		folder.add(matcher.group(2), object);
	}

	public void delete(String path, String name) throws FSONotFoundException {
		// Zielordner erreicht?
		if (path == null || path.isEmpty()) {
			for (int i = 0; i < m_contents.size(); i++) {
				if (m_contents.elementAt(i).getName() == name) {
					m_contents.remove(i);
					return;
				}
			}
			return;
		}

		// Finde nächsten Unterordner-Namen und Rest des Strings (falls verfügbar)
		Matcher matcher = Pattern.compile("^(\\w+)/?([\\w/])*$").matcher(path);
		matcher.find();
		String folderName = matcher.group(1);
		String newPath = matcher.group(2);

		// Hole Ordner aus Liste
		Folder folder = null;
		for (FileSystemObject currObject : m_contents) {
			if (currObject.getName() == folderName && currObject instanceof Folder) {
				folder = (Folder)currObject;
				break;
			}
		}

		if (folder == null) // Ordner nicht gefunden
			throw new FSONotFoundException(folderName);

		// Unterordner Anfrage übermitteln
		folder.delete(matcher.group(2), name);
	}

	@Override public String toString() {
		// String aus Inhalten zusammensetzen
		String str = "";
		for (FileSystemObject object : m_contents) {
			str += "\n" + object.toString();
		
		}

		// Wieder aufteilen, um zeilenweise diesen Ordnernamen davorzuhängen
		String[] lines = str.split("\\n");
		str = "";
		for (String line : lines) {
			if (!str.isEmpty())
				str += "\n";
			str += getName() + (line.isEmpty() ? "" : "/") + line;
		}
		return str;
	}
}
