package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N > 0) {
            if (N >= 5 && N % 5 == 0) {
                N -= 5;
                count++;
            } else if (N >= 3 && N % 3 == 0) {
                N -= 3;
                count++;
            } else if (N >= 5) {
                N -= 5;
                count++;
            } else if (N >= 3) {
                N -= 3;
                count++;
            } else {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}