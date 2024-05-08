package programmers.level0;

public class 조건에_맞게_수열_변환하기 {
  public int[] solution(int[] arr) {
    int[] ans = new int[arr.length];

    for (int i = 0; i < ans.length; i++) {
      if (arr[i] >= 50 && arr[i] % 2 == 0) ans[i] = arr[i] / 2;
      else if (arr[i] < 50 && arr[i] % 2 == 1) ans[i] = arr[i] * 2;
      else ans[i] = arr[i];
    }

    return ans;
  }
}
