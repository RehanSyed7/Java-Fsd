import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an Arithmetic operator: (+,-,*,/) ");
		char operator = sc.next().charAt(0);
		if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
			System.out.println(" Invalid operator, Select the operator..!");
		} else {
			double num1, num2, result;
			System.out.println("Enter the First Number: ");
			num1 = sc.nextDouble();
			System.out.println("Enter the second Number: ");
			num2 = sc.nextDouble();
			if (operator == '+') {
				result = num1 + num2;
			} else if (operator == '-') {
				result = num1 - num2;
			} else if (operator == '*') {
				result = num1 * num2;
			} else {
				result = num1 / num2;
			}
			System.out.println("The Result is : " + result);
		}
	}
}
