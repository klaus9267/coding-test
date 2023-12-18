package programmers.level0;

import java.util.Arrays;

public class ㅂ1로만들기 {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).map(this::setCnt).sum();
    }

    private int setCnt(int i) {
        int cnt = 0;
        boolean flag = true;
        while (flag) {
            if (i == 1) {
                flag = false;
            } else if (i % 2 == 0) {
                i /= 2;
            } else {
                i = (i - 1) / 2;
            }
            cnt++;
        }
        return cnt - 1;
    }
}
