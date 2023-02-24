package class1;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon11654 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char ascii = sc.next().charAt(0);
        int result = ascii;

        System.out.println(result);
    }
}

/**
 * 단순한 Ascii 출력
 * char -> int로 형변환
 *
 * int -> char로 출력(수동 타입 변환)
 * (char) (9 + '0')
 * Ascii 코드 57을 문자형으로 바꾸면
 * 9 + '0'(48) = '57'이 나온다.
 */
