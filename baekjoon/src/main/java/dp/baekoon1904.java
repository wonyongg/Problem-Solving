package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekoon1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N+1];
        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }

            System.out.println(dp[N]);
        }
    }

    // N = 1 | 1 -> 1
    // N = 2 | 00, 11 -> 2
    // N = 3 | 100, 001, 111 -> 3
    // N = 4 | 0000, 0011, 1100, 1001, 1111 -> 5
    // N = 5 | 00001, 10000, 00111, 11100, 10011, 11001, 11111, 00100 -> 8
}
