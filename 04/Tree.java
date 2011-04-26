/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class Tree {

	private int m_height;
	private boolean m_burning;

	public Tree(int height) {
		m_height = height;
		m_burning = false;
	}

	public int getHeight() {
		return m_height;
	}

	public boolean isBurning() {
		return m_burning;
	}

	public void setBurning(boolean isBurning) {
		m_burning = isBurning;
	}

	public Tree iterate(final Sector[][] grid, final int x, final int y) {
		if (m_burning) {
			m_height--;
		}
		if (m_height == 0) {
			return null;
		}

		// Suche brennende Nachbarbäume
		if (!m_burning) {
			DX: for (int nX = x-1; nX <= x+1; nX += 2) {
				for (int nY = y-1; nY <= y+1; nY += 2) {
					if (   nX >= 0 && nX < grid[0].length && nY >= 0 && nY < grid.length
						&& grid[nX][nY].getTree() != null && grid[nX][nY].getTree().isBurning()) {
						m_burning = true;
						break DX;
					}
				}
			}
		}

		return this;
	}

	public String toString() {
		String result = "";
		if (m_burning) {
			result += "§";
		} else {
			result += "T";
		}

		result += m_height;
		return result;
	}
}
