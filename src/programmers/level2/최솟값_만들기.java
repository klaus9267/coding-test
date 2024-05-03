package programmers.level2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값_만들기 {
  public int solution(int[] A, int[] B) {
    Arrays.sort(A);
    Integer[] b = new Integer[B.length];
    for (int i = 0; i < b.length; i++) {
      b[i] = B[i];
    }
    Arrays.sort(b, Collections.reverseOrder());

    int i = 0;
    for (int j = 0; j < b.length; j++) {
      i += A[j] * b[j];
    }
    return i;
  }
}
