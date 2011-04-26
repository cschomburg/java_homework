public class ForestFireSimulation {

	public static void main(String... args) {
		int rounds = 10;
		int size = 15;

		if (args.length > 0) {
			rounds = Integer.parseInt(args[0]);
		}
		if (args.length > 1) {
			size = Integer.parseInt(args[1]);
		}

		ForestFire forestFire = new ForestFire(size);
		forestFire.start(rounds);
	}
}
