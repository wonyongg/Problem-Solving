package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String[] stringIntegerList = input.split(" ");

        List<Integer> intgerList = new ArrayList<>();

        for (String stringInteger : stringIntegerList) {
            intgerList.add(Integer.valueOf(stringInteger));
        }

        Collections.sort(intgerList);

        System.out.println(intgerList.get(0) + " " + intgerList.get(intgerList.size()-1));
    }
}
