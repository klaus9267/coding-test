import programmers.level1.공원_산책;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    공원_산책 s = new 공원_산책();
    System.out.println("res : " + Arrays.toString(s.solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
    System.out.println("ans : [2, 1]");
    System.out.println();
    System.out.println("res : " + Arrays.toString(s.solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
    System.out.println("ans : [0, 1]");
    System.out.println();
    System.out.println("res : " + Arrays.toString(s.solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"})));
    System.out.println("ans : [0, 0]");
  }
}