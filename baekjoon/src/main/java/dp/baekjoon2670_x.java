package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2670_x {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] dp = new double[N+1];
        double max = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i], dp[i-1] * dp[i]);

            max = Math.max(max, dp[i]);
        }

        System.out.printf("%.3f%n", max);
    }
}
