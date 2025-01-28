package calculator;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Basic Calculator!");
    System.out.println("Enter the first number:");
    double num1 = scanner.nextDouble();

    System.out.println("Enter an operator (+, -, *, /):");
    char operator = scanner.next()charAt(0);

    System.out.println("Enter the second number:");
    double num2 = scanner.nextDouble();

    double result;

    swtich (operator) {
      case '+':
        result = num1 + num2
        System.out.println("Result: " + result);
        break;
      case '-':
        result = num1 - num2
        System.out.println("Result: " + result);
        break;
      case '*':
        result = num1 * num2
        System.out.println("Result: " + result);
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Invalid oeprator. Please use +, -, *, or /.");
    }

    scanner.close();
    System.out.println("Thank you for using the calculator!");
  }
}  
