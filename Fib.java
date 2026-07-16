import java.util.*;

public class Fib {
	static int count = 0;
	static int[] dp;
	private static int fib(int n) {
		count++;
		if(dp[n] != -1) {
			return dp[n];
		}
		if(n==0) {
			dp[n] = 0;
			return 0;
		}
		if(n==1) {
			dp[n] = 1;
			return 1;
		}
		int res = fib(n-1)+fib(n-2);
		dp[n] = res;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fib(10) + " count: " + count);
	}

}
