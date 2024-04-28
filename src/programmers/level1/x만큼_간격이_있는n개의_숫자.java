package programmers.level1;

import java.util.stream.IntStream;

public class x만큼_간격이_있는n개의_숫자 {
  public long[] solution(int x, int n) {
    return IntStream.rangeClosed(1, n).mapToLong(i -> (long) x * i).toArray();
  }
}
