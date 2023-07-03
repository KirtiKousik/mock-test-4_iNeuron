public class Main_04 {

  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;
    int number3 = 30;

    int largestNumber;

    if (number1 > number2) {
      if (number1 > number3) {
        largestNumber = number1;
      } else {
        largestNumber = number3;
      }
    } else if (number2 > number3) {
      largestNumber = number2;
    } else {
      largestNumber = number3;
    }

    System.out.println("The largest number is " + largestNumber);
  }
}
