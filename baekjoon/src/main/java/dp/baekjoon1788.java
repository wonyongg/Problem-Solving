package dp;

import java.io.*;

public class baekjoon1788 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;


        if (n == 0) {
            bw.write("0" + "\n");
            bw.write("0");

        } else if (n > 3) {
            bw.write("1" + "\n");
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] % 1000000000;
            }
            bw.write(dp[n]);
        } else if (n <= -1) {
            bw.write("-1" + "\n");
            for (int i = -1; true; i--) {
                dp[i] = dp[i + 2] - dp[i + 1];
            }
            bw.write("");
        }
    }
}