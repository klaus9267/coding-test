import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list) {
        return IntStream.range(0, num_list.length).boxed().filter(idx -> num_list[idx] < 0).findFirst().orElse(-1);
    }
}

