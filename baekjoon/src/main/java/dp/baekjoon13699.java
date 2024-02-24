package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon13699 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[36];
        t[0] = 1;
        t[1] = 1;
        for (int i = 2; i <= 35; i++) {
            t[i] = t[i-1] + t[i-1] * t[0];
        }

        System.out.println(t[n]);
    }
}

// t(0) = 1
// t(1) = t(0) * t(1-1) = t(0) * t(0)
// t(2) = t(0) * t(1-1) + t(1) * t(2-2) = t(0) * t(0) + t(1) * t(0)
// t(2) = t(0) * t(1-1) + t(1) * t(2-2) + t(2) * t(3-3) = t(0) * t(0) + t(1) * t(0) + t(2) * t(0)
