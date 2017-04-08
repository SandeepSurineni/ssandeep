import java.util.Scanner;
public class Multiplier {
	
	public static void main(String[] args) {
		int num1,num2,result;
		System.out.print("Enter first number  (1 digit) :");
		Scanner scanner1 = new Scanner(System.in);
		num1 = scanner1.nextInt();
		System.out.print("Enter second number (1 digit) : ");
		num2 = scanner1.nextInt();
		result = num1*num2;
	System.out.print("Result is =" +result);
	}
}
