import java.util.Scanner;

public class Main_01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double number = input.nextDouble();

    if (number > 0.0)
      System.out.println(number + " is positive");
    else if (number < 0.0)
      System.out.println(number + " is negative");
    else
      System.out.println(number + " is 0");
  }
}
