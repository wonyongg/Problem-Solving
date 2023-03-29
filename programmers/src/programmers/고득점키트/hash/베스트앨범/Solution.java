package programmers.고득점키트.hash.베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        /**
         *  해시맵을 통해 장르별 전체 플레이 수를 저장함
         *  key : 장르, value : 장르별 전체 플레이 수
         */
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; genres.length > i; i++) {
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
        }

        /**
         * 장르 배열리스트를 만들, 해시맵의 key(장르)를 저장한 후
         * sort메서드를 통해 해시맵의 value(장르별 전체 플레이 수)를 기준으로 내림차순 정렬함
         * 이 문제의 가장 핵심 포인트라고 생각.
         */
        ArrayList<String> genre = new ArrayList<>();
        for (String key : hm.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> hm.get(o2) - hm.get(o1));

        /**
         * 노래의 고유넘버를 저장하는 배열리스트를 생성
         * 이중 for 문을 통해 장르 배열리스트의 수만큼 돌아가는데(플레이 수 기준으로 정렬된 장르 배열리스트)
         * 쉽게 얘기해서 플레이 수 기준으로 정렬된 장렬과 같은 장렬만 뽑아
         * 개별적으로 플레이 수가 가장 많은 노래 고유번호의 인덱스를 두 개 저장한 후 songNumber에 순서대로 저장
         */
        ArrayList<Integer> songNumber = new ArrayList<>();
        for (int i = 0; genre.size() > i; i++) {
            int first = 0;
            int second = 0;
            int firstIdx = -1;
            int secondIdx = -1;
            for (int j = 0; genres.length > j; j++) {
                if (genre.get(i).equals(genres[j]) && first < plays[j]) {
                    first = plays[j];
                    firstIdx = j;
                }
            }


            for (int j = 0; genres.length > j; j++) {
                if (genre.get(i).equals(genres[j]) && second < plays[j] && j != firstIdx) {
                    second = plays[j];
                    secondIdx = j;
                }
            }

            songNumber.add(firstIdx);
            /* 장르가 하나만 있을 수 있기 때문에 기본값이 -1이며, 하나만 있을 경우 secondIdx는 무시됨 */
            if (secondIdx >= 0) songNumber.add(secondIdx);
        }

        /**
         * 배열 자체를 리턴해야 하므로 인트 타입의 배열 생성 후 옮기고 출력
         */
        int[] result = new int[songNumber.size()];

        for (int i = 0; songNumber.size() > i; i++) {
            result[i] = songNumber.get(i);
        }

        return result;
    }
}
