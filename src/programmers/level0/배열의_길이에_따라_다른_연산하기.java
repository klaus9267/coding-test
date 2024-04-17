package programmers.level0;

import java.util.stream.IntStream;

public class 배열의_길이에_따라_다른_연산하기 {
  public int[] solution(int[] arr, int n) {
    return arr.length % 2 == 0
        ? IntStream.range(0, arr.length).map(i -> i % 2 == 0 ? arr[i] : arr[i] + n).toArray()
        : IntStream.range(0, arr.length).map(i -> i % 2 != 0 ? arr[i] : arr[i] + n).toArray();
  }
}
