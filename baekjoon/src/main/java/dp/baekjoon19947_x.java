package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon19947_x {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] dp = new int[Y + 1];

        dp[0] = H;

        for (int i = 1; i <= Y; i++) {
            dp[i] = (int) (dp[i - 1] * 1.05);
            if (i >= 3) dp[i] = (int) Math.max(dp[i], dp[i - 3] * 1.20);
            if (i >= 5) dp[i] = (int) Math.max(dp[i], dp[i - 5] * 1.35);
        }

        System.out.println(dp[Y]);
    }
}

// 1 -> 5%
// 2 -> 5%
// 3 -> 20%
// 4 -> 5%
// 5-> 35%