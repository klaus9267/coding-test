package programmers.level0;

import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {
  public String[] solution(String myString) {
    return Arrays.stream(myString.split("x")).filter(i->!i.isBlank()).sorted().toArray(String[]::new);
  }
}
