package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] strArr = new String[5];

        System.out.println(strArr);

        for (String s : strArr) {
            System.out.println(s);
        }

        strArr[0] = "apple";
        strArr[1] = "banana";
        strArr[2] = "cola";
        strArr[3] = "chicken";
        strArr[4] = "pizza";

        System.out.println(Arrays.toString(strArr));
    }
}
