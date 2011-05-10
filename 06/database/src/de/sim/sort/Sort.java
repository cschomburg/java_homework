package de.sim.sort;

import de.sim.enumeration.SortMode;
import de.sim.interfaces.ISortable;

public class Sort {

	public static void sort(ISortable[] array, SortMode mode) {
		for (int pos = 0; pos < array.length; pos++) {

			// Finde kleinsten Wert
			int minPos = pos;
			String minString = array[minPos].getSortString(mode);
			for (int i = pos+1; i < array.length; i++) {
				String currString = array[i].getSortString(mode);
				if (currString.compareTo(minString) < 0) {
					minPos = i;
					minString = currString;
				}
			}

			// Tausche Werte
			ISortable tmp = array[pos];
			array[pos] = array[minPos];
			array[minPos] = tmp;
		}
	}
}
