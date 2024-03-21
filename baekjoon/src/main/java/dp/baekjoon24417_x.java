package dp;

import java.io.*;

public class baekjoon24417_x {

    static int tailRecursiveFuncCount = 0;
    static int fibonacciCount = 0;

    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        tailRecursiveFunc(n, 0, 1);
        dp(n);

        bw.write(String.valueOf(tailRecursiveFuncCount % 1000000007));
        bw.write(" ");
        bw.write(String.valueOf(fibonacciCount));
        bw.flush();
        bw.close();
    }

    static int tailRecursiveFunc(int n, int first, int second) {

        if (n <= 1) {
            tailRecursiveFuncCount++;
            return second;
        } else {
            return tailRecursiveFunc(n-1, second, first + second);
        }
    }

    static int dp(int n) {
        if (n == 1 || n == 2) {
            fibonacciCount++;
            return 1;
        } else {
            dp = new int[n + 1];

            for (int i = 3; i <= n; i++) {
                fibonacciCount++;
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }
}