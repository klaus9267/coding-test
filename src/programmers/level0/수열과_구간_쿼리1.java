package programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 수열과_구간_쿼리1 {
    public int[] solution(int[] arr, int[][] queries) {
        Arrays.stream(queries).forEach(query -> {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] += 1;
            }
        });
        return arr;
    }
}
