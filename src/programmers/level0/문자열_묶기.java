package programmers.level0;

import java.util.*;
import java.util.stream.Collectors;

public class 문자열_묶기 {
  public int solution(String[] strArr) {
    Map<Integer, List<String>> map = Arrays.stream(strArr).collect(Collectors.groupingBy(String::length));
    return Collections.max(map.values(), Comparator.comparing(List::size)).size();
  }
}
