package programmers.level0;

import java.util.Comparator;
import java.util.stream.IntStream;

public class 뒤에서_5등까지 {
  public int[] solution(int[] num_list) {
      return IntStream.of(num_list).boxed().sorted(Comparator.reverseOrder()).limit(5).mapToInt(i -> i).toArray();
  }
}
