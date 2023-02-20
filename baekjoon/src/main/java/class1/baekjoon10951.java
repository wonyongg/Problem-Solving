package class1;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10951 {
    public static void main(String[] args) throws NullPointerException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        // EOF 문제
        while ((str = br.readLine()) != null && !(str.isEmpty())) {

            StringTokenizer st = new StringTokenizer(str);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A + B + "\n");
        }
        bw.flush();
        bw.close();
    }
}

/**
 * EOF를 몰라서 엄청 헤멨다.
 * 자세한 내용은 블로깅 해놓을 예정이다.
 *
 * 처음에는 nullpointer를 처리하기 위해 try catch 문을 이용했으나 시간 초과가 떴다.
 * (str = br.readLine()) != null && !(str.isEmpty()) 이 두 개를 모두 써야 백준과 IDE에서 EOF라고 인식하고 통과가 되는 듯하다.
 */


