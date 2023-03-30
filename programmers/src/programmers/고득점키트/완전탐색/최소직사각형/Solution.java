package programmers.고득점키트.완전탐색.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        int maxRow = 0; // 가로 최대 길이
        int maxCol = 0; // 세로 최대 길이

        /**
         * 명함을 돌려 넣을 수도 있으므로, 가로, 세로 중 긴 부분을 가로 길이로 고정
         * 이후에 가로 중 최대 길이, 세로 중 최대길이를 곱하면 최소값을 구할 수 있다.
         */
        for (int i = 0; sizes.length > i; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            if (sizes[i][0] > maxRow) maxRow = sizes[i][0];
            if (sizes[i][1] > maxCol) maxCol = sizes[i][1];
        }

        return maxRow * maxCol;
    }
}
