package programmers.level1;

public class 콜라츠_추측 {
  public int solution(int num) {
    long num1 = (long) num;
    int cnt = 0;
    while (num1 != 1 ) {
      if (num1 % 2 == 0) num1 /= 2;
      else num1 = num1 * 3 + 1;
      cnt++;
      if ( cnt > 500) {
        cnt = -1;
        break;
      }
    }
    return cnt;
  }
}
