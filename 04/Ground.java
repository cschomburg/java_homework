/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class Ground {

	private boolean m_burned;

	public Ground() {}

	public Ground(boolean burned) {
		m_burned = burned;
	}

	public boolean isBurned() {
		return m_burned;
	}

	public Ground iterate(final Sector[][] grid, final int x, final int y) {
		boolean burned = m_burned;
		Tree tree = grid[x][y].getTree();
		if (tree != null && tree.isBurning() && tree.getHeight() == 1)
			burned = true;
		return new Ground(burned);
	}

	public String toString() {
		if (m_burned) {
			return "__";
		}
		return "..";
	}
}
