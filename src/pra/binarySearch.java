package pra;

public class binarySearch {
	
	private static final int NOT_FOUND = -1;
	
	public static <T extends Comparable<? super T>> 
	int binarySearch(T[] a,T b) {
		int low = 0 ,high = a.length-1;
		
		while (low <= high) {
			int mid = (low + high)/2;
			if (a[mid].compareTo(b)<0) {
				low = mid + 1;
			}else if (a[mid].compareTo(b)>0) {
				high = mid - 1;
			}else 
				return mid;
		}
		
		return NOT_FOUND;
	}
	
	public static long gcd(long m,Long n) {
		
		while (n!=0) {
			Long rem = m%n;
			m = n;
			n = rem;
		}
		
		return m;
	} 
}
