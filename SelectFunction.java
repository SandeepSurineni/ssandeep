
public class SelectFunction {
	public static void main(String args[]) {
		System.out.println("hello");
		int num1 = 2;
		int num2 = 4;
		String operator ="+";
		int result = 0;
		for(int i=0; i<=2; i++) {
			System.out.println("Enter num1: "+num1);
			System.out.println("Enter num2: "+num2);
			System.out.println("Enter the operator: "+operator);
			if(operator == "+")
				result = num1+num2;
			if(operator == "-")
				result = num1-num2;
			if(operator == "*")
				result = num1*num2;
			System.out.println("Result"+result);
		}
	}
}
