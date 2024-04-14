package programmers.level0;

import java.util.stream.IntStream;

public class 배열_비교하기 {
  public int solution(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return Integer.compare(arr1.length, arr2.length);
    }

    return Integer.compare(
        IntStream.of(arr1).sum(),
        IntStream.of(arr2).sum()
    );
  }
}
