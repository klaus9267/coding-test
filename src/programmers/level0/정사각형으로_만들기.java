package programmers.level0;

import java.util.Arrays;

public class 정사각형으로_만들기 {

  class Solution {
    public int[][] solution(int[][] arr) {
      int[][] result = arr.length > arr[0].length
          ? new int[arr.length][arr.length]
          : new int[arr[0].length][arr[0].length];

      if (arr.length <= arr[0].length) {
        for (int i = 0; i < arr.length; i++) {
          result[i] = arr[i].clone();
        }
      } else {
        for (int i = 0; i < arr.length; i++) {
          result[i] = Arrays.copyOf(arr[i], arr.length);
        }
      }
      return result;
    }
  }
}
