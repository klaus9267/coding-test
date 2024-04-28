package programmers.level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class 전국대회선발고사 {
  public int solution(int[] rank, boolean[] attendance) {
    int[] arr = IntStream.range(0, rank.length)
        .filter(i -> attendance[i])
        .boxed()
        .sorted(Comparator.comparingInt(a -> rank[a]))
        .limit(3)
        .mapToInt(i -> i)
        .toArray();

    System.out.println(Arrays.toString(arr));
    return arr[0] * 10000 + 100 * arr[1] + arr[2];
  }
}
