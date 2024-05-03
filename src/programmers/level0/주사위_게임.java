package programmers.level0;

public class 주사위_게임 {
  public int solution(int a, int b) {
    return (a + b) % 2 != 0 ? 2 * (a + b)
        : (a % 2 != 0) ? (a * a) + (b * b) : Math.abs(a - b);
  }
}
