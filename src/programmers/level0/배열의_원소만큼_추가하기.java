package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열의_원소만큼_추가하기 {
  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      for (int j = 0; j < i; j++) {
        list.add(i);
      }
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
