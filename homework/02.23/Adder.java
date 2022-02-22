public class Adder {
	public int excute(String expr){
		int result = 0;
		String[] a = expr.split("\\+");
		 for(int i=0 ; i<a.length ; i++) {
            result += Integer.parseInt(a[i]);
        }
		return result;
	}

	/*public int excute(String expr){
		int result = 0;+
		String strNum ="";
		for(int i=0; i<expr.length();i++){
			char c = expr.charAt(i);
			if(c=='+'){
				result += Integer.parseInt(strNum);
				strNum ="+";
			} else{
				strNum += c;
			}			
		}
		return (result+Integer.parseInt(strNum));
	}*/

	public static void main(String[] args) {
		Adder adder = new Adder();
		String expr ="3+5+9+1";
		System.out.println(expr+"="+adder.excute(expr));
		String expr1 ="11+45+77+3";
		System.out.println(expr+"="+adder.excute(expr1));
		String expr2 ="33+51+12+11";
		System.out.println(expr+"="+adder.excute(expr2));
	}
}
