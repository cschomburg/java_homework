package de.sim;

public class File extends FileSystemObject {

	int m_size;

	public File(String name, int size) {
		super(name);
		setSize(size);
	}

	public int getSize() {
		return m_size;
	}

	public void setSize(int size) {
		m_size = size;
	}

	public int compareTo(FileSystemObject other) {
		if (other instanceof File)
			return getName().compareTo(((File)other).getName());

		return 1;
	}

	@Override public String toString() {
		return String.format("%s Size: %d Byte", getName(), getSize());
	}
}
