package pra;
/*
*
*@author longwh
*@since2019Äê1ÔÂ29ÈÕ
*/
public class pow {
	
	public static void main(String[] args) {
		long x = 12345;
		int n = 100;
		int m = 1000000000;
		Long brfore1 = System.currentTimeMillis();
		for (int i = 0; i < m; i++) {
			pow(x, n);
		}
		Long after1 = System.currentTimeMillis();
		System.out.println(after1-brfore1);
	
		Long brfore2 = System.currentTimeMillis();
		for (int i = 0; i < m; i++) {
			pow3(x, n);
		}
		Long after2 = System.currentTimeMillis();
		System.out.println(after2-brfore2);
		
	}
	
	public static long pow(long x,int n) {
		
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return x;
		}
		if (isEven(n)) 
			return pow(x*x,n/2);
		else
			return pow(x*x,n/2)*x;
	}
	
	public static long pow1(long x,int n) {
		
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return x;
		}
		if (isEven(n)) 
			return pow(pow(x,2),n/2);
		else
			return pow(x*x,n/2)*x;
	}

	public static long pow2(long x,int n) {
		
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return x;
		}
		if (isEven(n)) 
			return pow(pow(x,n/2),2);
		else
			return pow(x*x,n/2)*x;
	}
	
	public static long pow3(long x,int n) {
		
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return x;
		}
		if (isEven(n)) 
			return pow(x,n/2)*pow(x,n/2);
		else
			return pow(x*x,n/2)*x;
	}
	
	public static boolean isEven(int n) {
		return n%2==0;
	}
	
}
