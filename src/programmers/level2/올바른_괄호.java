package programmers.level2;

public class 올바른_괄호 {
  boolean solution(String s) {
    if (s.startsWith(")") || s.length() % 2 != 0 || s.endsWith("(")) {
      return false;
    }

    int i = 0;
    for (String str : s.split("")) {
      if (str.equals("(")) i++;
      else i--;
      if (i < 0) return false;
    }

    return i == 0;
  }
}
