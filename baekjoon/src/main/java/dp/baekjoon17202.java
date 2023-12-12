package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon17202 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String A = br.readLine();
        String[] aArrays = A.split("");
        String B = br.readLine();
        String[] bArrays = B.split("");

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            nums.add(Integer.parseInt(aArrays[i]));
            nums.add(Integer.parseInt(bArrays[i]));
        }

        while (nums.size() > 2) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < nums.size() - 1; i++) {
                int num = nums.get(i) + nums.get(i + 1);
                tmp.add(num % 10);
            }

            nums = tmp;
        }

        System.out.println(String.valueOf(nums.get(0)) + nums.get(1));
    }
}
