package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기6 {
  public int[] solution(int[] arr) {
    int i = 0;
    List<Integer> stk = new ArrayList<>();
    while (i < arr.length) {
      if (stk.isEmpty()) {
        stk.add(arr[i]);
        i++;
      } else if (stk.get(stk.size() - 1) == arr[i]) {
        stk.remove(stk.size() - 1);
        i++;
      } else if (stk.get(stk.size() - 1) != arr[i]) {
        stk.add(arr[i]);
        i++;
      }
    }
    return !stk.isEmpty() ? stk.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
  }
}
