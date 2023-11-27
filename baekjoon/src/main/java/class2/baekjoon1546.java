package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon1546 {
    static int maxNum;
    static double changeScore;
    static double allScore = 0.0;
    static double result = 0.0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> scoreList = new ArrayList<>();
        List<Double> changeScoreList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(scoreList, Collections.reverseOrder());

        maxNum = scoreList.get(0);
        changeScoreList.add(100.0);
        for (int i = 1; i < N; i++) {
            changeScore = (double) scoreList.get(i) / maxNum * 100;
            changeScoreList.add(changeScore);
        }

        for (Double changeScore : changeScoreList) {
            allScore += changeScore;
        }

        result = allScore / N;

        System.out.println(result);
    }
}