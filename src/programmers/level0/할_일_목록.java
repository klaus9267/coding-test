package programmers.level0;

import java.util.stream.IntStream;

public class 할_일_목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
                        .filter(i -> !finished[i])
                        .mapToObj(i -> todo_list[i])
                        .toArray(String[]::new);
    }
}
