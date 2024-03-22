package dp;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon25214_x {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (N-- > 0) {
            int current = Integer.parseInt(st.nextToken());
            if (min > current) min = current;
            else ans = Math.max(ans, current-min);
            sb.append(ans).append(' ');
        }
        System.out.println(sb);
    }
}
// 1 1
// 11 2 1 2 2