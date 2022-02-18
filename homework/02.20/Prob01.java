// 홀수의 합과 짝수의 합을 출력하기
public class Prob01 {
	//method
	public void calc(int[] ix){
		int a =0;
		int b =0;
		for(int i=0; i<ix.length; i++){
			if(ix[i]%2 == 0){
				a += ix[i];
			} else{
				b += ix[i];
			}
		}
		System.out.println("홀수의 합 : "+b);
		System.out.println("짝수의 합 : "+a);
	}

	//main
	public static void main(String[] args) {
		int [] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int [] ib = new int[]{1,2,3,4,5};

		Prob01 p = new Prob01();
		System.out.println("(배열 ia)");
		p.calc(ia);
		System.out.println("(배열 ib)");
		p.calc(ib);
	}
}
