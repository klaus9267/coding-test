package programmers.level1;

import java.util.stream.IntStream;

public class 내적 {
  public int solution(int[] a, int[] b) {
    return IntStream.range(0, a.length).map(idx -> a[idx] * b[idx]).sum();
  }
}
