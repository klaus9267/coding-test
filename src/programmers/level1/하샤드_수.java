package programmers.level1;

public class 하샤드_수 {
  public boolean solution(int x) {
    int sum = String.valueOf(x).chars().map(i -> i - 48).sum();
    return x % sum == 0;
  }
}
