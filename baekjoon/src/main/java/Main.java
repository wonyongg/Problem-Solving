import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; 9 >= i; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num*i);
        }
    }
}
/**
 * 통과 후 다음 사용을 위해 삭제!!
 */
