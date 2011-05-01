/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class Sector {

	private Tree m_tree;
	private Ground m_ground;

	public Sector() {
		if (Math.random() > 0.3) {
			int height = (int)(Math.random()*5) + 1;
			m_tree = new Tree(height, false);
		} else {
			m_tree = null;
		}

		m_ground = new Ground();
	}

	public Sector(Tree tree, Ground ground) {
		m_tree = tree;
		m_ground = ground;
	}

	public Tree getTree() {
		return m_tree;
	}

	public Ground getGround() {
		return m_ground;
	}

	public Sector iterate(final Sector[][] grid, final int x, final int y) {
		if (m_tree != null) {
			return new Sector(m_tree.iterate(grid, x, y),
							  m_ground.iterate(grid, x, y));
		}
		return this;
	}

	public String toString() {
		if (m_tree != null) {
			return m_tree.toString();
		} else {
			return m_ground.toString();
		}
	}
}
