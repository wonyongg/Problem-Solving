package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N+1];

        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(1);
        } else {
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            System.out.println(dp[N]);
        }
    }
}

// 1
// 10
// 100, 101
// 1000, 1001, 1010
// 10000, 10001, 10010, 10100, 10101