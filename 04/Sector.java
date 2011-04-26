public class Sector {

	private Tree m_tree;
	private Ground m_ground;

	public Sector() {
		if (Math.random() > 0.3) {
			int height = (int)Math.random()*4 + 1;
			m_tree = new Tree(height, false);
		} else {
			m_tree = null;
		}
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
