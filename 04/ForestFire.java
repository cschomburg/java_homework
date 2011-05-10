/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 04 - Programmieren (Java) - Gruppe 6
 * 26.04.11 - 03.05.11
 */
public class ForestFire {

	private Sector[][] m_grid;
	private int m_size;

	public ForestFire(int size) {
		m_size = size;
		m_grid = new Sector[size][size];

		// Einzelne Felder initialisieren
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				m_grid[x][y] = new Sector();
			}
		}
	}

	public void step() {
		Sector[][] tmp = new Sector[m_size][m_size];

		// Einzelne Felder iterieren
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				tmp[x][y] = m_grid[x][y].iterate(m_grid, x, y);
			}
		}

		m_grid = tmp;
	}

	public boolean isFinished() {
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				if (m_grid[x][y].getTree() != null &&
					m_grid[x][y].getTree().isBurning())
				{
					return false;
				}
			}
		}

		return true;
	}

	public void start() {
		// Zufällig Bäume anzünden
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				if (m_grid[x][y].getTree() != null && Math.random() <= 0.15) {
					m_grid[x][y].getTree().setBurning(true);
				}
			}
		}
		
		System.out.println("Start configuration");
		System.out.println(this);
		
		// Simulation durchlaufen und ausgeben
		//for (int i = 1; i <= rounds; i++) {
		int i = 1;
		while (!isFinished()) {
			step();
			System.out.println("Step " + i);
			System.out.println(this);
			i++;
		}
	}

	public String toString() {
		String result = "";
		for (int x = 0; x < m_size; x++) {
			for (int y = 0; y < m_size; y++) {
				result += m_grid[x][y] + " ";
			}
			result += "\n";
		}
		return result;
	}
}
