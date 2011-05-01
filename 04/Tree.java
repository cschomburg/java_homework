/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class Tree {

	private int m_height;
	private boolean m_burning;

	public Tree(int height, boolean burning) {
		m_height = height;
		m_burning = burning;
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
		int height = m_height;
		boolean burning = m_burning;

		if (burning) {
			height--;
		}
		if (height == 0) {
			return null;
		}

		// Suche brennende Nachbarbäume
		if (!burning) {
			burning = isTreeBurning(grid, x, y-1) || isTreeBurning(grid, x, y+1)      // Oben, unten
					  || isTreeBurning(grid, x-1, y) || isTreeBurning(grid, x+1, y);  // Links, Rechts
		}

		return new Tree(height, burning);
	}

	public static boolean isTreeBurning(final Sector[][]grid, final int x, final int y) {
		return (   (x >= 0) && (x < grid.length)		// X in Gitter
				&& (y >= 0) && (y < grid[0].length)		// Y in Gitter
			    && (grid[x][y].getTree() != null)		// Baum existiert
				&& grid[x][y].getTree().isBurning());	// Baum brennt
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
