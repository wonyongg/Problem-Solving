package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String[] stringIntegerList = input.split("");

        int sum = 0;

        for (String stringInteger : stringIntegerList) {
            sum += Integer.valueOf(stringInteger);
        }

        System.out.println(sum);
    }
}
