package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2579_x {

    static int[] stairs;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        stairs = new int[N+1];
        dp = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = stairs[0];
        dp[1] = stairs[1];

        if (N >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }

        System.out.println(find(N));
    }

    static int find(int N) {
        // 아직 탐색하지 않는 N번째 계단일 경우
        if(dp[N] == null) {
            dp[N] = Math.max(find(N - 2), find(N - 3) + stairs[N - 1]) + stairs[N];
        }

        return dp[N];
    }
}

// 1 : 10 -> 10
// 2 : 10 + 20 -> 30
// 3 : 20 + 15 -> 35
// 4 : 20 + 25 -> 50
// 5 : 10 20 25 10 -> 65
// 6 : 10 20 25 20 -> 75


