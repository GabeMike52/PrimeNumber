import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println("PrimeNumber");
    Scanner read = new Scanner(System.in);
    int number;
    boolean isPrime;
    do {
      System.out.println("Type the number you wish to know if is a Prime Number or not, or type 0 to end the program.");
      number = read.nextInt();
      if (number == 0) {
        break;
      }else if (number <= 1 || number != 2 && number % 2 == 0 || number != 3 && number % 3 == 0 || number != 5 && number % 5 == 0 || number != 7 && number % 7 == 0) {
        isPrime = false;
      } else {
        isPrime = true;
      }
      if(!isPrime) {
        System.out.println("The number " + number + " is not a Prime Number.");
      } else {
        System.out.println("The number " + number + " is a Prime Number.");
      }
    } while (number != 0);
  }
}
