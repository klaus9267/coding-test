package programmers.level0;

import java.util.stream.IntStream;

public class ㅂ5명씩 {
    public String[] solution(String[] names) {
        return IntStream.iterate(0, i -> i < names.length, i -> i + 5)
                        .mapToObj(i -> names[i])
                        .toArray(String[]::new);
    }
}
