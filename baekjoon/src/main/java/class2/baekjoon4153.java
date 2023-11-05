package class2;
import java.io.*;
import java.util.Arrays;

public class baekjoon4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            String[] list = input.split(" ");
            int[] intList = new int[3];

            for (int i = 0; i < intList.length; i++) {
                intList[i] = Integer.parseInt(list[i]);
            }

            Arrays.sort(intList);

            int a = intList[0];
            int b = intList[1];
            int hypotenuse = intList[2];

            if (a == 0 && b == 0 && hypotenuse == 0) {
                break;
            } else if (a != 0 && b != 0 && hypotenuse != 0 && Math.pow(hypotenuse, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                bw.write("right" + "\n");
            } else {
                bw.write("wrong" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
