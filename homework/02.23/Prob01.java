public class Prob01 {
	public static void printGugudan(int no){
		if(no<0 || 9<no){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다"); 
			return;
		}

		for(int i=0; i<9; i++){
			for(int j=0; j<no; j++){
				System.out.print((j+1)+"*"+(i+1)+"="+(j+1)*(i+1)+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("주어진 숫자까지의 구구단을 찍습니다");
		System.out.println("=========Sample 1========");
		printGugudan(4);

		System.out.println("=========Sample 2========");
		printGugudan(9);

		System.out.println("=========Sample 3========");
		printGugudan(-1);

		System.out.println("=========Sample 4========");
		printGugudan(10);
	}
}
