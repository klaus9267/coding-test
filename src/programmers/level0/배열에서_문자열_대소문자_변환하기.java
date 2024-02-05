package programmers.level0;

import java.util.stream.IntStream;

public class 배열에서_문자열_대소문자_변환하기 {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length).mapToObj(j -> j % 2 == 1 ? strArr[j].toUpperCase() : strArr[j].toLowerCase()).toArray(String[]::new);
    }
}
