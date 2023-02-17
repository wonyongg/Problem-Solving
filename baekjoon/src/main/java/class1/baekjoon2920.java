package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2920 {
    static String result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        System.out.println(AscOrDesc(arr));

    }

    /**
     * 옆 배열과 1씩 차이나는지를 확인하고
     * 1씩 증가하면 ascending
     * 1씩 감소하면 descending
     * 한 번이라도 어긋나면 mixed
     * @param arr 배열
     * @return 문자열 결과
     */
    public static String AscOrDesc(String[] arr) {
        for (int i = 0; i < 7; i++) {
            if (Integer.parseInt(arr[i]) == Integer.parseInt(arr[i+1]) - 1) {
                result = "ascending";
            } else if (Integer.parseInt(arr[i]) == Integer.parseInt(arr[i+1]) + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        return result;
    }
}
