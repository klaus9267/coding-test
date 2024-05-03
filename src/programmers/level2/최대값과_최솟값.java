package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최대값과_최솟값 {
  public String solution(String s) {
    String[] arr = s.split(" ");
    List<Integer> list = new ArrayList<>();
    for (String str : arr) {
      list.add(Integer.parseInt(str));
    }
    return Collections.min(list) + " " + Collections.max(list);
  }
}
