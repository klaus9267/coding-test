package programmers.level0;

import java.util.Arrays;

public class 문자열_정수의_합 {
  public int solution(String num_str) {
    return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).reduce(Integer::sum).stream().sum();
  }
}
