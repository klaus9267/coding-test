package programmers.level0;

import java.util.Arrays;

public class 공백으로_구분하기2 {
  public String[] solution(String my_string) {
    String[] strings = my_string.replaceAll("\\s+", " ").split(" ");
    System.out.println(Arrays.toString(strings));
    return Arrays.toString(strings).startsWith(" ") ? Arrays.copyOfRange(strings, 1, strings.length) : strings;
  }
}
