package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon16395 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][r+1];

        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[1][1] = 1;

        int count = 2;
        for (int i = 2; n >= i; i++) {
            for (int j = 0; r >= j; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == j) {
                    dp[i][j] = 1;
                } else if (i < j){
                }
                else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n-1][r-1]);
    }
}
