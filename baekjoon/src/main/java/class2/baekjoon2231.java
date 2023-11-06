package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int checkNum = i;

            while (checkNum != 0) {
                sum += checkNum % 10;
                checkNum /= 10;
            }

            if (i + sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
