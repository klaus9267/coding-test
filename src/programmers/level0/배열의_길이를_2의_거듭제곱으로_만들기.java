package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
  public int[] solution(int[] arr) {
    List<Integer> list = List.of(1, 2, 4, 8, 16, 32, 64, 128, 256, 512);
    if (list.contains(arr.length)) {
      return arr;
    }
    int i = list.stream().filter(j -> j > arr.length).findFirst().get();
    return IntStream.concat(Arrays.stream(arr), Arrays.stream(new int[i - arr.length])).toArray();
  }
}
