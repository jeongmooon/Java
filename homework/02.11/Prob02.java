public class Prob02 {

	public static void main(String[] args){
		int limit = 50;
		boolean prime = false;

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
				System.out.println(i);
			}
		}
	}// main
}// class