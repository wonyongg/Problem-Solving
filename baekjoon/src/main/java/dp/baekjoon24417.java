package dp;

import java.io.*;

public class baekjoon24417 {

    static int recursiveFuncCount = 0;
    static int fibonacciCount = 0;

    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int init = 1;
        int total = 0;

        recursiveFunc(n, total, init);
        fibonacci(n);

        bw.write(String.valueOf((total + init) % 1000000007));
        bw.write(" ");
        bw.write(String.valueOf(fibonacciCount));
        bw.flush();
        bw.close();
    }

    static int recursiveFunc(int n, int total, int init) {

        if (n == 1 || n == 2) {
            return init;
        } else {
            return recursiveFunc(n-1, init, total + init);
        }
    }

    static int fibonacci(int n) {
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