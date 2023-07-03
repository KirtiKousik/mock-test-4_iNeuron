import java.util.Scanner;

public class Main_03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of numbers: ");
    int numberOfNumbers = scanner.nextInt();

    int sum = 0;
    int i = 1;

    do {
      System.out.println("Enter number " + i + ": ");
      int number = scanner.nextInt();
      sum += number;
      i++;
    } while (i <= numberOfNumbers);

    double average = (double) sum / numberOfNumbers;
    System.out.println("The average of the numbers is " + average);
  }
}