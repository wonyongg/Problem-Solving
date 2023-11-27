package class2;

import java.io.*;

public class baekjoon1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) break;

            String[] numbers = input.split("");

            int count = 0;
            String result = "yes";
            for (int i = numbers.length -  1; i >= 0; i--) {
                if (!(numbers[count].equals(numbers[i]))) {
                    result = "no";
                    break;
                }
                count++;
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}
