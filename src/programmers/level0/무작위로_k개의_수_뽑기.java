package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 무작위로_k개의_수_뽑기 {
  public int[] solution(int[] arr, int k) {
    List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
    if (list.size() >= k) {
      return list.stream().limit(k).mapToInt(i -> i).toArray();
    }
    return IntStream.range(0, k).map(i -> i < list.size() ? list.get(i) : -1).limit(k).toArray();
  }
}
