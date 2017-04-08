import java.util.Scanner;
public class IterIf {
public static void main(String[] args){
	int num1,num2,res = 0;
		String operator;
		Scanner scanner1 = new Scanner(System.in);
		for(int i=0; i<=2; i++) {
			System.out.print("Enter First Number: ");
			num1 = scanner1.nextInt();
			System.out.print("Enter Second Number: ");
			num2 = scanner1.nextInt();
			System.out.print("Enter operator (+ or *) :");
			operator = scanner1.next();
			if(operator.equals("+"))
			{
				res = num1 + num2;
			} 
			else if(operator.equals("*"))
			{
				res = num1 * num2;
			}
			else {
				System.out.println("Invalid operator");
			}
			System.out.println("Result = "+res);
		}
		
	}

}
