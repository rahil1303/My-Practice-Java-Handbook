import java.util.*;

public class Solution {
  public static void main(String[] args){
    try(Scanner input = new Scanner(System.in)) {
    int i = input.nextInt();
    double d = input.nextDouble();
    input.nextLine();
    String s = input.nextLine();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
    }
  }
}
