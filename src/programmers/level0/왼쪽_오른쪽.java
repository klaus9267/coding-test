package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 왼쪽_오른쪽 {
    public String[] solution(String[] str_list) {
        List<Integer> idx = IntStream.range(0, str_list.length)
                                     .boxed()
                                     .filter(i -> str_list[i].equals("r") || str_list[i].equals("l"))
                                     .collect(Collectors.toList());
        if (idx.isEmpty()) {
            return new String[]{};
        } else if (str_list[idx.get(0)].equals("r")) {
            return Arrays.copyOfRange(str_list, idx.get(0) + 1, str_list.length);
        } else {
            return Arrays.copyOfRange(str_list, 0, idx.get(0));
        }
    }
}
