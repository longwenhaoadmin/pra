package pra;

public class maxSubSum {
	public static void main(String[] args) {
		int[] a = new int[100000000];
		for (int i = 0; i < 100000000; i++) {
			a[i] = (int) (Math.random()*100);
		}
		/*Long brfore = System.currentTimeMillis();
		System.out.println(maxSubSum2(a));
		Long after = System.currentTimeMillis();
		System.out.println(after-brfore);*/
		Long brfore2 = System.currentTimeMillis();
		System.out.println(maxSubSum4(a));
		Long after2 = System.currentTimeMillis();
		System.out.println(after2-brfore2);
		Long brfore1 = System.currentTimeMillis();
		System.out.println(maxSubSum3(a));
		Long after1 = System.currentTimeMillis();
		System.out.println(after1-brfore1);
	}
	
	public static int maxSubSum3(int[] a) {
		return maxSubSumRec(a,0,a.length-1);
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
	
	public static int maxSubSumRec(int[] a,int left,int right) {
		if (left == right) {
			if (a[left] > 0) {
				return a[left];
			}
			else 
				return 0;
		}
		
		int center = (left+right)/2;
		int maxLeftSum = maxSubSumRec(a, left, center);
		int maxRightSum = maxSubSumRec(a, center+1, right);
		
		int maxLeftBorderSum = 0,LeftBorderSum = 0;
		for (int i = center; i >= left; i--) {
			LeftBorderSum += a[i];
			if (LeftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = LeftBorderSum;
			}
		}
		
		int maxRightBorderSum = 0,RightBorderSum = 0;
		for (int i = center+1; i <= right; i++) {
			RightBorderSum += a[i];
			if (RightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = RightBorderSum;
			}
		}
		
		return max3(maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum);
	}
	
	public static int max3(int a,int b,int c) {
		int d = b>=c?b:c;
		return a>=d?a:d;
	}
	
	public static int maxSubSum4(int[] a) {
		int thisSum = 0,maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			thisSum += a[i];
			
			if (thisSum > maxSum) {
				maxSum = thisSum;
			}else if (thisSum < 0) {
				thisSum = 0;
			}
		}
		return maxSum;
	}
}
