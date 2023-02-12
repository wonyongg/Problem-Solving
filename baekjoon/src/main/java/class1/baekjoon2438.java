package class1;

import java.io.*;

public class baekjoon2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; num >= i; i++) {
            /**
             * 파이썬의 문자열 곱하기("*" * i) 대신에
             * 자바에서는 repeat를 사용하여 문자열을 반복 입력할 수 있다.
             */
            String star = "*".repeat(i);
            bw.write(star + "\n");
        }
        bw.flush();
        bw.close();
    }
}
