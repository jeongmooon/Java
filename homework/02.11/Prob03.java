import java.util.Scanner;

public class Prob03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� :");
		
		int inputInt = keyboard.nextInt();
		int r = 1;
		// �Ʒ��� �����Ͻÿ�
		if(inputInt < 2 || 9 <inputInt){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}

		// ���丮��
		for(int i=1; i<=inputInt; i++){
			r = r*i;
		}
		System.out.println(r);
	}
}
