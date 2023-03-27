package programmers.고득점키트.hash.전화번호목록;

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        /**
         * 정렬을 이용하여 접두사가 같거나 비슷한 것끼리 모아둔 후 양 옆을 비교하여 검색
         * 세 개가 같아도, 어차피 같으면 false이므로 상관 없음.
         * 건너 뛰어 같을 일도 없음.
         * */
        Arrays.sort(phone_book);

        for (int i = 0; phone_book.length - 1 > i; i++) {
            /* 접두사 확인 startsWith 포인트 */
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
