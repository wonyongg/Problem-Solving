package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon15489 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] dp = new int[31][31];

        dp[1][1] = 1;

        for (int i = 2; i <= 30; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        long total = 0;
        int max = 1;
        int count = 1;
                  // R=3, C=1, W=4
        for (int i = R; i < R+W; i++) {
            for (int j = C; j < C+W; j++) {
                if (count <= max) {
                    total += dp[i][j];
                    count++;
                }

            }
            count = 1;
            max++;
        }

        System.out.println(total);
    }
}
