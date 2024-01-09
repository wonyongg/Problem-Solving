package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baekjoon13301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger[] dp = new BigInteger[n + 1];

        if (n == 1) {
            System.out.println(4);
        } else {
            dp[0] = BigInteger.valueOf(0);
            dp[1] = BigInteger.valueOf(4);
            dp[2] = BigInteger.valueOf(6);

            for (int i = 3; i < n + 1; i ++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }

            System.out.println(dp[n]);
        }
    }
}
