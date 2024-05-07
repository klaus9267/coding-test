package programmers.level1;

public class 바탕화면_정리 {
  public int[] solution(String[] wallpaper) {
    int width = wallpaper[0].length();
    int height = wallpaper.length;

    boolean isSet = false;
    int[] s = new int[]{50, 50};
    int[] e = new int[2];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (wallpaper[i].charAt(j) == '#') {
          if (i < s[0]) s[0] = i;
          if (j < s[1]) s[1] = j;
          if (i + 1 > e[0]) e[0] = i + 1;
          if (j + 1 > e[1]) e[1] = j + 1;
        }
      }
    }

    return new int[]{s[0], s[1], e[0], e[1]};
  }
}
