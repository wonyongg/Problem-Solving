package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon13699_x {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] t = new long[36];
        t[0] = 1;
        t[1] = 1;
        for (int j = 2; j < 36; j++) {
            for (int i = 0; i < j; i++) {
                t[j] += t[i] * t[j-1-i];
            }
        }

        System.out.println(t[n]);
    }
}

// t(0) = 1
// t(1) = t(0) * t(1-1) = t(0) * t(0)
// t(2) = t(0) * t(2-1) + t(1) * t(1-1) = t(0) * t(1) + t(1) * t(0)
// t(3) = t(0) * t(3-1) + t(1) * t(2-1) + t(2) * t(1-1) = t(0) * t(2) + t(1) * t(1) + t(2) * t(0)
//                                                        t(0) *
