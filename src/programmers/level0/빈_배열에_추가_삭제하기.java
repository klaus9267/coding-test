package programmers.level0;

import java.util.Stack;

public class 빈_배열에_추가_삭제하기 {
  public int[] solution(int[] arr, boolean[] flag) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (flag[i]) for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
      else for (int j = 0; j < arr[i]; j++) stack.pop();
    }

    return stack.stream().mapToInt(i -> i).toArray();
  }
}
