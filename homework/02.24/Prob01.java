class Util {
	String[] b;
	public int findPrimeCount(int limit){
		boolean prime = false;
		String a = "";

		for(int i=2; i<=limit; i++){
		// 초기값 초기화
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i부터 i-1까지의 모든수를 나눠서 나머지가 0 이있다면 소수가 아님
				prime = true;
			}
		}
		if(!prime){
			// false 라면 소수 true라면 소수가아님
			a += (i+",");
			}
		}
		b = a.split(",");
		return b.length;
	}

	public int[] findPrimeReturnArray(int limit){
		int a[] = new int[b.length];
		for(int i=0; i<b.length; i++){
			a[i] = Integer.parseInt(b[i]);
		}
		return a;
	}

}
public class Prob01 {	

	public static void main(String[] args) {
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~ "+limit+"까지의 소수의 갯수는 "+primeCount +"EA 이며 소수는 아래와 같다");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}
