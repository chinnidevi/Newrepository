import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int Number1, Number2, Sum;
    System.out.print("To add two numbers, enter the first number:");
    Scanner scanner = new Scanner(System.in);
    Number1 = scanner.nextInt();
    System.out.print("Enter the second number:");
    Number2 = scanner.nextInt();
    Sum = Number1 + Number2;
    System.out.println("The sum of " + Number1 + " and " + Number2 + " is " + Sum + ".");
    
  }
}