package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열_바꿔서_찾기 {
  public int solution(String myString, String pat) {
    return myString.chars().mapToObj(c -> (char) c == 'A' ? "B" : "A").collect(Collectors.joining()).contains(pat) ? 1 : 0;
  }
}
