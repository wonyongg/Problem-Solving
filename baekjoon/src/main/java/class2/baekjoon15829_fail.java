package class2;

import java.io.*;

public class baekjoon15829_fail {
    static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bw.readLine());
        String str = new String(bw.readLine());
        long sum = 0;
        long pow = 1;
        char[] arr = str.toCharArray();
        for(int i = 0; i < L; i++)
        {
            sum += (arr[i] - 'a' + 1) * pow % M; //분배법칙
            pow = pow * 31 % M; //분배법칙
        }
        long hash = sum % M;
        System.out.println(hash);
    }
}

/**
 * 나중에 다시 풀것
 */