public class ForestFire {

	private Sector[][] m_grid;
	private int m_size;

	public ForestFire(int size) {
		m_size = size;
		m_grid = new Sector[size][size];

		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				grid[x][y] = new Sector();
			}
		}
	}

	public void step() {
		Sector[][] tmp = new Sector[m_size][m_size];

		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				tmp[x][y] = grid[x][y].iterate(grid, x, y);
			}
		}

		grid = tmp;
	}

	public void start(int rounds) {
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				if (grid[x][y].getTree() && Math.random() <= 0.15) {
					grid[x][y].getTree().setBurned(true);
				}
			}
		}
		
		System.out.println("Start configuration");
		System.out.println(this);

		for (int i = 1; i <= rounds; i++) {
			step();
			System.out.println("Step " + i);
			System.out.println(this);
		}
	}

	public String toString() {
		String result = "";
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				result += grid[x][y] + " ";
			}
			result += "\n";
		}
		return result;
	}
}
