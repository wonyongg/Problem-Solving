package class1;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(A + B + "\n");
        bw.write(A - B + "\n");
        bw.write(A * B + "\n");
        bw.write(A / B + "\n");
        bw.write(A % B + "\n");

        bw.flush();
        bw.close();
    }
}
