package dp;

import java.io.*;

public class baekjoon24416 {

    static int rfCount;
    static int dpCount;

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int dp = dp(n);
        int rf = rf(n);


        System.out.println(rfCount + " " + dpCount);
    }

    public static int dp(int n){
        dp = new int[41];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dpCount++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int rf(int n) {
        if (n == 1 || n == 2) {
            rfCount++;
            return  1;
        } else {
            return rf(n - 1) + rf( n - 2);
        }
    }
}
