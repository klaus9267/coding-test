package programmers.level1;

public class 부족한_금액_계산하기 {
  public long solution(int price, int money, int count) {
    long total = 0;
    for (int i = 1; i < count+1; i++) {
      total += (long) i * price;
    }
    return total < money ? 0 : total - money;
  }
}
