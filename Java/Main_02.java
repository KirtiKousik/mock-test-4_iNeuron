import java.util.Scanner;

public class Main_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    int a = 0;
    int b = 1;
    int c;

    System.out.println("The Fibonacci series up to " + number + " is:");
    System.out.println(a);
    System.out.println(b);

    for (int i = 3; i <= number; i++) {
      c = a + b;
      System.out.println(c);
      a = b;
      b = c;
    }
  }
}
