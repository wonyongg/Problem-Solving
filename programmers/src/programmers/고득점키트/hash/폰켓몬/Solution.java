package programmers.고득점키트.hash.폰켓몬;

import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            hash.add(num);
        }

        if (hash.size() > max) {
            return max;
        } else {
            return hash.size();
        }
    }
}

/**
 * 일단, 폰켓몬 종류의 최대 선택 수는 전체의 절반이다.
 * 그러므로 max = nums.length / 2
 * 그리고 hashset 객체를 생성한다.
 * hashset은 중복을 제거하므로, 배열을 전부 hashset에 옮기면 중복 폰켓몬이 제거될 것이다.
 * 여기서 hashset 객체의 size가 선택 ㅡ가능한 최대 폰켓몬 종류의 수이고,
 * 이 수가 max를 넘지 않아야하므로 if 문을 통해 넘는다면 최대 선택 수인 max일 것이다.
 * 만약 max를 넘지 않는다면 중복을 제거한 폰켓몬의 전체 수가 선택할 수 있는 폰켓몬 종류의 수의 최대 선택 수일 것이다.
 */
