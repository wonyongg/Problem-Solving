package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon2798 {

    static int N;
    static int M;
    static int total;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        List<Integer> numbers = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st2.nextToken()));
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++ ) {
                for (int k = i + 2; k < N; k++) {

                    if (i != j && i != k && k != j){
                        total = numbers.get(i) + numbers.get(j) + numbers.get(k);

                        if (total > max && total <= M) {
                            max = total;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
