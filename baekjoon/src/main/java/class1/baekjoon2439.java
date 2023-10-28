package class1;

import java.io.*;

public class baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] stars = new String[N];

        for (int i = 0; i < stars.length; i++) {
            stars[i] = "*";

            for (int j = stars.length - 1; j >= 0; j--) {
                if (stars[j] == null) {
                    bw.write(" ");
                } else {
                    bw.write(stars[j]);
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
