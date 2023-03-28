package programmers.고득점키트.hash.위장;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        int answer = 1;

        /**
         * hashMap의 getOrDefault 메서드를 이용해 각 옷 종류마다 바꿀 수 있는 개수를 value에 넣음
         */
        for (int i = 0; clothes.length > i; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }

        /**
         * keySet을 돌면서 키(옷 종류)에 해당하는 value(바꿀 수 있는 개수)에 +1을 더해 answer에 곱함
         * 이렇게 되면 최소 하나의 옷 종류를 입거나, 여러 옷을 입는 전체 조합의 경우의 수가 나옴
         */
        for (String key : hm.keySet()) {
            answer *= (hm.get(key) + 1);
        }

        /**
         * 아무것도 입지 않는 경우의 수 1을 빼면 됨
         */
        return answer - 1;
    }
}
