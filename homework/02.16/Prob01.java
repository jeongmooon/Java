import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int sum = 0;
		// �ְ����
		int maxInt=1001;

		Scanner keyboard = new Scanner(System.in);
		System.out.print(" ���� ������ �Է��ϼ��� : ");
		number = keyboard.nextInt();
		
		// ����
		if(0<number && number<maxInt){
			// ���ڹݺ���
			for(int i=1; i<maxInt; i++){
				// ī��Ʈ, �� ���ϱ�
				if(i%number == 0){
					count++;
					sum += i;
				}
			}
		}
		// �����
		System.out.println(number + "�� ��� ���� = " +count);
		System.out.println(number + "�� ��� �� = " + sum);
	}// main
}// calss
