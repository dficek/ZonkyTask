package cz.zonky.marketplace.loan.cache;

import java.util.ArrayList;
import java.util.List;

/**
 * Internal In-memory data cache.
 * 
 * @author Daniel Ficek
 */
public class DataCache {
	
	private final List<Integer> loans = new ArrayList<>();

	private static final DataCache dataCache = new DataCache();
	
	private DataCache() {
		// Singleton
	}
	
	public static DataCache getInstanceOf() {
		return dataCache;
	}

	public List<Integer> getLoans() {
		return loans;
	}
	
}
