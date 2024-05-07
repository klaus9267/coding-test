package programmers.level1;

public class 덧칠하기 {
  public int solution(int n, int m, int[] section) {
    if (section.length > 1 && m >= section[section.length - 1] - section[0] + 1) return 1;
    if (m == 1) return section.length;

    int cnt = 1;
    int i = section[0] + m;
    for (int j = 1; j < section.length; j++) {
      if (section[j] < i) continue;
      else {
        cnt++;
        i = m + section[j];
      }
    }

    return cnt;
  }
}
