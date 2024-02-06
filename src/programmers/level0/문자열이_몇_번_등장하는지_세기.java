package programmers.level0;

import java.util.stream.IntStream;

public class 문자열이_몇_번_등장하는지_세기 {
    public int solution(String myString, String pat) {
        return IntStream.rangeClosed(0, myString.length() - pat.length()).reduce(0, (total, n) -> myString.substring(n, n + pat.toCharArray().length).equals(pat) ? total + 1 : total);
    }
}
