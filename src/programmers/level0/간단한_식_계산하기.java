package programmers.level0;

public class 간단한_식_계산하기 {
  public int solution(String binomial) {
    String[] strings = binomial.split(" ");
    if (strings[1].equals("+")) {
      return Integer.valueOf(strings[0]) + Integer.valueOf(strings[2]);
    } else if (strings[1].equals("-")) {
      return Integer.valueOf(strings[0]) - Integer.valueOf(strings[2]);
    } else {
      return Integer.valueOf(strings[0]) * Integer.valueOf(strings[2]);
    }
  }
}
