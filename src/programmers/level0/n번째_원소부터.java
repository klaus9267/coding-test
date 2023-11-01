package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class n번째_원소부터 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.stream(num_list)
                     .boxed()
                     .collect(Collectors.toList())
                     .subList(n-1, num_list.length)
                     .stream()
                     .mapToInt(Integer::valueOf)
                     .toArray();
    }

}
