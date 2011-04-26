/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class Ground {

	private boolean m_burned;

	public boolean isBurned() {
		return m_burned;
	}

	public Ground iterate(final Sector[][] grid, final int x, final int y) {
		Tree tree = grid[x][y].getTree();
		if (tree != null && tree.getHeight() == 0)
			m_burned = true;
		return this;
	}

	public String toString() {
		if (m_burned) {
			return "__";
		}
		return "..";
	}
}
