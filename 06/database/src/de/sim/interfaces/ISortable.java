/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 06 - Programmieren (Java) - Gruppe 6
 * 10.05.11 - 17.05.11
 */

package de.sim.interfaces;

import de.sim.enumeration.SortMode;

/**
 * Ein sortierbares Objekt
 */
public interface ISortable {

	public String getSortString(SortMode mode);
}
