package programmers.level0;

import java.util.stream.IntStream;

public class ㅂ2의영역 {
    public int[] solution(int[] arr) {
        int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if (idx.length == 0) return new int[]{-1};
        return IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
    }
}
