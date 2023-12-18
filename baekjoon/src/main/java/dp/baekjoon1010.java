package dp;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon1010 {

    static int n;
    static int m;
    static StringTokenizer st;

    static final int[][] dp = new int[31][31];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String nm = br.readLine();
            st = new StringTokenizer(nm, " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(combination(m, n)));
            bw.newLine();

            t--;
        }

        bw.flush();
        bw.close();
    }

    static int combination(int n, int r) {
        // 이미 계산된 경우
        if (dp[n][r] > 0) return dp[n][r];
        else if (n == r || r == 0) return dp[n][r] = 1;
        else return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}

