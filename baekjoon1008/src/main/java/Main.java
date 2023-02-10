import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();

        StringTokenizer st = new StringTokenizer(nums);

        /**
         * 방법 1
         double num1 = double.valueOf(st.nextToken());
         double num2 = double.valueOf(st.nextToken());
         double answer1 = num1/num2;
         */

        /** 방법 2 형변환  */
        int num1 = Integer.valueOf(st.nextToken());
        int num2 = Integer.valueOf(st.nextToken());
        double answer = (double) num1/num2;

        System.out.println(answer);
    }
}