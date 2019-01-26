package pra;

public class maxSubSum {
	public static void main(String[] args) {
		int[] a = new int[10000];
		for (int i = 0; i < 10000; i++) {
			a[i] = (int) (Math.random()*100);
		}
		Long brfore = System.currentTimeMillis();
		maxSubSum1(a);
		Long after = System.currentTimeMillis();
		System.out.println(after-brfore);
		brfore = System.currentTimeMillis();
		maxSubSum2(a);
		after = System.currentTimeMillis();
		System.out.println(after-brfore);
	}
	
	public static int maxSubSum1(int[] a) {
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int thisSum = 0;

				for (int k = i; k < j; k++) {
					thisSum += a[k];
				}

				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}
	
	public static int maxSubSum2(int[] a) {
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {

			int thisSum = 0;

			for (int j = i; j < a.length; j++) {

				thisSum += a[j];

				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}
}
