class Util {
	
	public int findPrimeCount(int limit){
		int[] arr = findPrimeReturnArray(limit);
		return arr.length;
	}

	public int[] findPrimeReturnArray(int limit){
		boolean prime = false;
		String[] stringArr;
		String stringPrime = "";

		for(int i=2; i<=limit; i++){
		// �ʱⰪ �ʱ�ȭ
		prime = false;
		for(int j=2; j<i; j++){
			if(i%j ==0){
				// i���� i-1������ ������ ������ �������� 0 ���ִٸ� �Ҽ��� �ƴ�
				prime = true;
			}
		}
		if(!prime){
			// false ��� �Ҽ� true��� �Ҽ����ƴ�
			stringPrime += (i+",");
			}
		}
		stringArr = stringPrime.split(",");

		int intArr[] = new int[stringArr.length];
		for(int i=0; i<stringArr.length; i++){
			intArr[i] = Integer.parseInt(stringArr[i]);
		}

		return intArr;
	}

}
public class Prob01 {	

	public static void main(String[] args) {
		int limit = 67;
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~ "+limit+"������ �Ҽ��� ������ "+primeCount +"EA �̸� �Ҽ��� �Ʒ��� ����");
		System.out.println("//////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+((primeArray.length-1) != i ? "," :""));
		}
	}
}
