package programmers.level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 배열의_원소_삭제하기 {
  public int[] solution(int[] arr, int[] delete_list) {
    List<Integer> list = IntStream.of(delete_list).boxed().collect(Collectors.toList());
    return IntStream.of(arr).filter(i -> !list.contains(i)).toArray();
  }
}
