package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] ans = new int[photo.length];

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < name.length; i++) {
      map.put(name[i], yearning[i]);
    }

    for (int i = 0; i < photo.length; i++) {
      for (String person : photo[i]) {
        ans[i] += map.get(person) != null ? map.get(person) : 0;
      }
    }

    return ans;
  }
}
