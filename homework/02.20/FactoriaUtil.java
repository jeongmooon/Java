import java.util.Scanner;

public class FactoriaUtil {
	//Field
	int i=1;
	int r=1;

	//method
	public int factorial(int n){
		// 구현하시오		
			i++;		
			r = r*i;
		if(n-i>0){	
			factorial(n);
		}
		return r;
	}

	// main
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input\t\t\t\t= ");

		FactoriaUtil util = new FactoriaUtil();
		System.out.print("Result = " + util.factorial(keyboard.nextInt()));
	}
}
