package org.adams.training.java.collection;

public class CollectionTypes {

	// A, X, B
	//

	/*
	 * Implements Set
	 */
	class HashSet {
		// unordered, unsorted - iterates in random order
		// uses hashCode()

	}

	// A, X, B
	// A, X, B

	/*
	 * Implements Set
	 */
	class LinkedHashSet {
		// ordered - iterates order of insertion
		// unsorted
		// uses hashCode()

	}

	// A, C, B
	// A, B, C

	/*
	 * Implements Set, NavigableSet
	 */
	class TreeSet {
		// sorted order is maintained
		// implements NavigableSet

	}
	
	/*
	 * Implements Map
	 */
	class HashMap {
		// unordered, unsorted
		// key's hashCode() is used

	}
	
	/*
	 * Implements Map
	 */
	class Hashtable {
		// Synchronized - Thread Safe - version of HashMap
		// unordered, unsorted
		// key's hashCode() is used
		// HashMap allows a key with NULL value. Hashtable doesn't.

	}

	/*
	 * Implements Map
	 */
	class LinkedHashMap {
		// insertion order is maintained (optionally can maintain access order as well
		// slower insertion and deletion
		// faster iteration

	}


	/*
	 * Implements Map, NavigableMap
	 */
	class TreeMap {
		// sorted order is maintained
		// implements NavigableMap

	}

}
