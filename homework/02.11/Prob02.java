public class Prob02 {

	public static void main(String[] args){
		int limit = 50;
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
				System.out.println(i);
			}
		}
	}// main
}// class
