/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 03 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 *
 * Ein Baum in der Waldbrandsimulation
 */
public class Tree {

	private int m_height;
	private boolean m_burning;

	/**
	 * Erstellt einen Baum mit einer festen Höhe und ggf, ob er brennen soll.
	 *
	 * @param height Höhe des Baumes
	 * @param isBurning ob der Baum brennt
	 */
	public Tree(int height, boolean isBurning) {
		m_height = height;
		m_burning = isBurning;
	}

	/**
	 * Gibt die aktuelle Höhe des Baumes zurück.
	 *
	 * @return Höhe
	 */
	public int getHeight() {
		return m_height;
	}

	/**
	 * Gibt zurück, ob der Baum gerade brennt.
	 *
	 * @return brennt
	 */
	public boolean isBurning() {
		return m_burning;
	}

	/**
	 * Legt fest, ob der Baum brennt oder nicht.
	 *
	 * @param isBurning brennt
	 */
	public void setBurning(boolean isBurning) {
		m_burning = isBurning;
	}

	/**
	 * Führt einen Schritt in der Simulation des Baumes durch.
	 *
	 * @param grid das Simulationsfeld
	 * @param x die X-Koordinate des Baumes
	 * @param y die Y-Koordinate des Baumes
	 * @return neuer Baum oder null
	 */
	public Tree iterate(final Sector[][] grid, final int x, final int y) {
		if (m_burning) {
			m_height--;
		}
		if (m_height == 0) {
			return null;
		}


		if (!m_burning) {
			DX: for (int nX = x-1; nX <= x+1; nX += 2) {
				for (int nY = y-1; nY <= y+1; nY += 2) {
					if (grid[nX][nY].getTree() != null && grid[nX][nY].getTree().isBurning()) {
						m_burning = true;
						break DX;
					}
				}
			}
		}

		return new Tree(m_height, m_burning);
	}

	/**
	 * Gibt einen String repräsentativ für den Zustand des Baums zurück
	 *
	 * @return String
	 */
	public String toString() {
		String result = "";
		if (m_burning) {
			result += "$";
		} else {
			result += "T";
		}

		result += m_height;
		return result;
	}
}
