package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 공원_산책 {
  public int[] solution(String[] park, String[] routes) {
    List<String> height = new ArrayList<>();
    int[] now = new int[2];

    for (int i = 0; i < park[0].length(); i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < park.length; j++) {
        if (park[j].charAt(i) == 'S') {
          now[0] = j;
          now[1] = i;
        }
        sb.append(park[j].charAt(i));
      }
      height.add(sb.toString());
    }

    for (String route : routes) {
      String[] strings = route.split(" ");
      int n = Integer.parseInt(strings[1]);

      if (strings[0].equals("N")) {
        if (now[0] - n < 0) continue;
        if (height.get(now[1]).substring(now[0] - n, now[0]).contains("X")) continue;
        now[0] -= n;
      }

      if (strings[0].equals("S")) {
        if (now[0] + n >= park.length) continue;
        if (height.get(now[1]).substring(now[0], now[0] + n + 1).contains("X")) continue;
        now[0] += n;
      }

      if (strings[0].equals("W")) {
        if (now[1] - n < 0) continue;
        if (park[now[0]].substring(now[1] - n, now[1]).contains("X")) continue;
        now[1] -= n;
      }

      if (strings[0].equals("E")) {
        if (now[1] + n >= park[0].length()) continue;
        if (park[now[0]].substring(now[1], now[1] + n).contains("X")) continue;
        now[1] += n;
      }
    }

    return now;
  }
}
