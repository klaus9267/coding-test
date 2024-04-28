package programmers.level1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 없는_숫자_더하기 {
  public int solution(int[] numbers) {
    List<Integer> list = IntStream.of(numbers).boxed().collect(Collectors.toList());
    return IntStream.range(0, 10).filter(i->!list.contains(i)).sum();
  }
}
