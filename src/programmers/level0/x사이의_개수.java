package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class x사이의_개수 {
  public int[] solution(String myString) {
    if (!myString.endsWith("x")) {
      return Arrays.stream(myString.split("x")).mapToInt(String::length).toArray();
    } else {
      List<Integer> list = Arrays.stream(myString.split("x")).mapToInt(String::length).boxed().collect(Collectors.toList());
      list.add(0);
      return list.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
