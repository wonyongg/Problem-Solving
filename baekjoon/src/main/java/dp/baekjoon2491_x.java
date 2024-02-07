package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2491_x {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] dp = new int[3][N+1];
        dp[0][1] = Integer.parseInt(st.nextToken());
        dp[1][1] = 1;
        dp[2][1] = 1;

        int max = 0;

        if (N == 1) max = 1;

        for (int i = 2; i <= N; i++) {
            dp[0][i] = Integer.parseInt(st.nextToken());
            if (dp[0][i-1] <= dp[0][i]) {
                dp[1][i] = dp[1][i-1] + 1;
            } else {
                dp[1][i] = 1;
            }

            if (dp[0][i-1] >= dp[0][i]) {
                dp[2][i] = dp[2][i-1] + 1;
            } else {
                dp[2][i] = 1;
            }

            max = Math.max(max,Math.max(dp[1][i], dp[2][i]));
        }

        System.out.println(max);
    }
}
// 1 44 3
// (4) i = 2, 1 <= 4, 2 | 1
// (4) i = 3, 4 <= 4, 3 | 2
// (3) i = 4, 1 | 4 >= 3, 3