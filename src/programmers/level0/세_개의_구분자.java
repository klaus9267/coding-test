package programmers.level0;

import java.util.Arrays;

public class 세_개의_구분자 {
  public String[] solution(String myStr) {
    String[] strings = Arrays.stream(myStr.split("a|b|c")).filter(i -> !i.isEmpty()).toArray(String[]::new);
    return strings.length == 0 ? new String[]{"EMPTY"} : strings;
  }
}
