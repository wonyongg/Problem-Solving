package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon15624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long[] dp = new long[num + 1];

        if (num == 0) {
            System.out.println(0);
        } else {
            for (int i = 2; i <= num; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2])  % 1000000007;
            }

            System.out.println(dp[num]);
        }
    }
}
