package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; 9 >= i; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num*i);
        }
    }
}

/**
 * println으로 해놓고 왜 안되는지 고민함.
 * 알고보니 printf(형식 지정자를 이용해 특정 형식으로 출력)을 사용했어야 했다.
 * 이것도 까먹다니... 알고리즘 놓지말자.
 */
