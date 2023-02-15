package class1;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; count >= i; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String[] list = str.split("");

            /**
             * for (String s : list) {
             *     bw.write((s.repeat(num));
             * }
             * 처음에는 위의 for문을 이용해 풀었다.
             * IntelliJ에서는 예시 출력대로 나와 정답이라고 생각했는데 제출해보니 틀렸다고 나왔다.
             * 이유는 문자(char)로 이어붙인게 아니라 문자열(String.repeat)을 이어붙였기 때문이었다.
             * 문제를 잘 읽자. 문자인가 문자열인가 꼭 확인하자.
             */

            for (String s : list) {
                for (int j = 1; num >= j; j++) {
                    bw.write(s.charAt(0)); // for문을 이용해 '문자'를 반복해서 넣었다.
                }
            }
            bw.write("\n"); // 하나의 입력이 끝나면 개행 처리
        }

        bw.flush();
        bw.close();
    }
}
