package programmers;

import java.util.*;

// Test 작성 클래스
public class Main {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String loser = "";

        HashMap<String, Integer> hm = new HashMap<>();

        for (String p : participant) hm.put(p, hm.getOrDefault(p, 0) + 1);
        for (String c : completion) hm.put(c, hm.get(c) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) loser = key;
        }

        System.out.println(loser);
    }
}
