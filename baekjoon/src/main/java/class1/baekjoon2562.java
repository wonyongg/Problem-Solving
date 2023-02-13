package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int max = 0; // 최대값
        int index = 0; // 최대값의 인덱스

        /**
         * 우선 리스트 안에 9개 의 자연수를 차례로 담는다.
         */
        for (int i = 0; i <= 8; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        /**
         * 인덱스 0의 값부터 하나씩 꺼내
         * max값과 비교하여 더 큰 경우 max에 대입
         * 인덱스 값은 0부터 시작하기 때문에 i + 1
         */
        for (int i = 0; i <= 8; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
