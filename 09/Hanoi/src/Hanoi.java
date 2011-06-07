public class Hanoi {

	private int[][] m_board;
	private int m_steps;

	private static String[] labels = new String[]{ "A", "B", "C" };

	public static void main(String... args) {
		Hanoi hanoi = new Hanoi(5);
		hanoi.move(5, 0, 1, 2); // Verschiebe alle Elemente von Turm 0 nach Turm 2
	}

	public Hanoi(int disks) {
		m_board = new int[3][disks];
		for (int i = 0; i < disks; i++)
			m_board[0][i] = disks-i;
	}

	public void move(int numDisks, int from, int cache, int to) {
		if (numDisks <= 0)
			return;

		move(numDisks-1, from, to, cache); // Verschiebe alle oberen Elemente auf unseren "Zwischenspeicher"-Turm
		moveSingle(from, to);              // Verschiebe das untere Element zum Zielturm

		System.out.printf("Schritt %d: %s -> %s\n%s\n\n",
				          m_steps, labels[from], labels[to], toString());

		move(numDisks-1, cache, from, to); // Verschiebe alle oberen Elemente auf den Zielturm
	}

	public void moveSingle(int from, int to) {
		m_steps++;

		// Hole Position des obersten Elements im Ursprungsturm
		int[] towerFrom = m_board[from];
		int posFrom = towerFrom.length-1;
		while (posFrom > 0 && towerFrom[posFrom] == 0)
			posFrom--;

		// Hole Element, breche ab, wenn keines auf dem Turm liegt
		int disk = towerFrom[posFrom];
		if (disk == 0) {
			System.out.printf("Turm %d hat keine Scheibe zum Verschieben!\n", from);
			System.exit(1);
		}

		// Hole Position des obersten Elements vom Zielturm
		int[] towerTo = m_board[to];
		int posTo = towerTo.length-1;
		while (posTo > 0 && towerTo[posTo] == 0)
			posTo--;

		// Oberstes Element gefunden?
		if (towerTo[posTo] > 0) {
			// Breche ab, wenn Scheibe kleiner ist als unsere neue
			if (towerTo[posTo] < disk) {
				System.out.printf("Turm %d's Scheibe %d ist kleiner als %d!\n",
								  to, towerTo[posTo], disk);
				System.exit(1);
			}

			// Nimm die freie Position über dem obersten Element
			posTo++;
		}

		// Verschiebe Element
		towerTo[posTo] = disk;
		towerFrom[posFrom] = 0;
	}

	@Override public String toString() {
		String str = "";
		for (int i = 0; i < m_board.length; i++) {
			if (!str.isEmpty())
				str += "\n";
			str += labels[i] + "|";
			for (int disk : m_board[i]) {
				if (disk == 0)
					break;
				str += disk;
			}
		}
		return str;
	}
}
