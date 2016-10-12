package number;

import java.io.*;

public class AddTwoBinary {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      String[] array = s.split(" ");
      System.out.println(sumBinary(array[0], array[1]));
    }
  }
  
  public static int sumBinary(String s1, String s2) {
      int bin1 = Integer.parseInt(s1, 2);
      int bin2 = Integer.parseInt(s2, 2);
      int sum = bin1 + bin2;
      return sum;
  }
}