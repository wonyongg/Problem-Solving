import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] stringIntegerList = input.split(" ");

        int sum = 0;

        for (String stringInteger : stringIntegerList) {
            sum += Math.pow(Integer.valueOf(stringInteger), 2);
        }

        System.out.println(sum % 10);
    }
}
/**
 * 통과 후 다음 사용을 위해 삭제!!
 */
