package programmers.level0;

import java.util.stream.IntStream;

public class 홀수vs짝수 {
    public int solution(int[] num_list) {
        int add = IntStream.rangeClosed(1, num_list.length)
                           .filter(i -> i % 2 == 1)
                           .reduce(0, (i, j) -> i + num_list[j - 1]);
        int even = IntStream.rangeClosed(1, num_list.length)
                            .filter(i -> i % 2 == 0)
                            .reduce(0, (i, j) -> i + num_list[j - 1]);
        return Math.max(add, even);
    }
}
