package programmers.level0;

import java.util.stream.Collectors;

public class A강조하기 {
    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
