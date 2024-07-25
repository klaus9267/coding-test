class Solution {
  public int solution(int[] common) {
    int x = common[1] - common[0];
    int y = common[2] - common[1];
    int n = common[common.length - 1];

    return x == y
        ? n + (common[2] - common[1])
        : n * (common[2] / common[1]);
  }
}