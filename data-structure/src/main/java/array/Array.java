package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] strArr1 = new String[5];
        String[] strArr2 = {"a", "b", "c", "d", "e"};



        System.out.println(strArr1);

        for (String s : strArr1) {
            System.out.println(s);
        }

        strArr1[0] = "apple";
        strArr1[1] = "banana";
        strArr1[2] = "cola";
        strArr1[3] = "chicken";
        strArr1[4] = "pizza";

        System.out.println(Arrays.toString(strArr1));

        String[] forCopyArr1 = new String[10];
        forCopyArr1[0] = "melon";
        forCopyArr1[1] = "tomato";
        forCopyArr1[2] = "hamburger";

        System.arraycopy(strArr1, 0, forCopyArr1, 3, 4);

        System.out.println("### forCopyArr1 (arraycopy) : " + Arrays.toString(forCopyArr1));

        String[] forCopyArr2;
        forCopyArr2 = Arrays.copyOf(strArr1, strArr1.length);
        System.out.println("### forCopyArr2 (copyOf) : " + Arrays.toString(forCopyArr2));

        forCopyArr2 = Arrays.copyOfRange(strArr2, 1, 4);
        System.out.println("### forCopyArr2 (copyOfRange) : " + Arrays.toString(forCopyArr2));
    }
}
