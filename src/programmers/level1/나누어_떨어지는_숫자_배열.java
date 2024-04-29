package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
  public int[] solution(int[] arr, int divisor) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      if (i % divisor == 0) list.add(i);
    }
    list.sort(Comparator.naturalOrder());

    if (list.isEmpty()) return new int[]{-1};
    int[] array = new int[list.size()];

    for (int i = 0; i < list.size(); i++) {
      array[i] = list.get(i);
    }
    return array;
  }
}
