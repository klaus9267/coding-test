package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 순서바꾸기 {
    public int[] solution(int[] num_list, int n) {
        int[] arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);
        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
        System.out.println(list.toString());
        for (int i : arr2) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
