import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      BigInteger s = BigInteger.valueOf(0L);

      int n = sc.nextInt();
      for (int j = 0; j < n; j++) {
        BigInteger s1 = new BigInteger(sc.next());
        s = s.add(s1);
      }

      String result = switch (s.compareTo(BigInteger.ZERO)) {
        case 0 -> "0";
        case 1 -> "+";
        case -1 -> "-";
        default -> "error";
      };

      System.out.println(result);
    }
  }
}
