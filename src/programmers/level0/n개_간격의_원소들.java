package programmers.level0;

import java.util.stream.IntStream;

public class n개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length)
                        .filter(i -> i % n == 0)
                        .map(i -> num_list[i])
                        .toArray();
    }
}
