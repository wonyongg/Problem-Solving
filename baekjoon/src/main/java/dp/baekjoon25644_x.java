package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon25644_x {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int answer = 0;

        while (n-- > 0) {
            int current = Integer.parseInt(st.nextToken());
            answer = Math.max(answer, current - min);
            min = Math.min(min, current);
        }
        System.out.println(answer);

    }
}
