package class1;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; num >= i; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A+B + "\n");
        }

        bw.flush();
        bw.close();
    }
}

/**
 * 다수의 결과값을 출력할 때는
 * BufferedWriter를 이용하여 값을 저장해놓고,
 * 한 번에 출력하는 것이 효율적이다.
 * bw.flush(); -> 모아둔 데이터를 모두 출력
 */
