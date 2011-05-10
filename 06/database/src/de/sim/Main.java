package de.sim;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;
import de.sim.media.*;
import de.sim.sort.Sort;

public class Main {

	static public void main(String... args) {
		ISortable[] sortables = {
			new CD("Dire Straits", "Brothers In Arms"),
			new Book("Michael Ende", "Die unendliche Geschichte"),
			new CD("Iron Maiden", "A Matter Of Life And Death"),
			new DVD("Steven Spielberg", "Raiders of the Lost Ark"),
			new Book("J. R. R. Tolkien", "The Lord of the Rings"),
		};

		sortAndPrint(SortMode.LAST_NAME, sortables);
		sortAndPrint(SortMode.FIRST_NAME, sortables);
		sortAndPrint(SortMode.TITLE, sortables);
	}

	static public void sortAndPrint(SortMode mode, final ISortable[] sortables) {
		Sort.sort(sortables, mode);

		System.out.println("\nSortmode: " + mode.toString());
		for (ISortable value : sortables) {
			System.out.println(value);
		}
	}
}
