package programmers.level0;

import java.time.LocalDateTime;
import java.util.Arrays;

public class 날짜_비교하기 {
  public int solution(int[] date1, int[] date2) {
//    LocalDateTime a = LocalDateTime.of(date1[0], date1[1], date1[2], 0, 0);
//    LocalDateTime b = LocalDateTime.of(date2[0], date2[1], date2[2], 0, 0);
//    return a.isBefore(b) ? 1 : 0;
    return Arrays.compare(date1, date2) < 0 ? 1 : 0;
  }
}
