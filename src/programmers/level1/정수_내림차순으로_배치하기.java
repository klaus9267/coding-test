package programmers.level1;

import java.util.Comparator;

public class 정수_내림차순으로_배치하기 {
  public long solution(long n) {
    return String.valueOf(n).chars()
        .map(i -> i - 48)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToLong(i -> i)
        .reduce(0, (cur, next) -> cur * 10 + next);
  }
}
