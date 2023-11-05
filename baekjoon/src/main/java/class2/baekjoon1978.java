package class2;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon1978 {
    static boolean[] prime = new boolean[1001];
    static StringTokenizer st;
    static int N;
    static int count;


    public static void main(String[] args) throws IOException {

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == false) {
                for (int j = 2; i * j <= 1000; j++) {
                    prime[i*j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (prime[num] == false) {
                count++;
            }
        }

        System.out.println(count);
    }
}
