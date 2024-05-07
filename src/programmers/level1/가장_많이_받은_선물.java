package programmers.level1;

import java.util.*;

public class 가장_많이_받은_선물 {
  public int solution(String[] friends, String[] gifts) {
    Map<String, Map<String, Integer>> friendMap = new HashMap<>();
    Map<String, Integer> giftPointMap = new HashMap<>();

    for (int i = 0; i < friends.length; i++) {
      Map<String, Integer> map = new HashMap<>();
      for (int j = 0; j < friends.length; j++) {
        if (i == j) continue;
        map.put(friends[j], 0);
      }
      friendMap.put(friends[i], map);
      giftPointMap.put(friends[i], 0);
    }

    for (String gift : gifts) {
      String[] s = gift.split(" ");
      friendMap.get(s[0]).merge(s[1], 1, Integer::sum);
      friendMap.get(s[1]).merge(s[0], -1, Integer::sum);
      giftPointMap.merge(s[0], 1, Integer::sum);
      giftPointMap.merge(s[1], -1, Integer::sum);
    }

    List<Integer> result = new ArrayList<>();

    for (String key : friendMap.keySet()) {
      int cnt = 0;
      Map<String, Integer> pointMap = friendMap.get(key);
      for (String friend : pointMap.keySet()) {
        int point = pointMap.get(friend);
        if (point > 0) cnt++;
        else if (point == 0 && giftPointMap.get(key) > giftPointMap.get(friend)) cnt++;
      }
      result.add(cnt);
    }

    result.sort(Comparator.reverseOrder());
    return result.get(0);
  }
}
