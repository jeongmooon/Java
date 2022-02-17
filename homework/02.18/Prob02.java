public class Prob02 {
	//method
	public void printSeason(int month){
		String s="";
		
		switch(month){
			case 3 :
			case 4 :
			case 5 :
				s = "��";
				break;
			case 6 :
			case 7 :
			case 8 :
				s = "����";
				break;
			case 9 :
			case 10 :
			case 11 :
				s = "����";
				break;
			case 12 :
			case 1:
			case 2 :
				s = "�ܿ�";
				break;
		}
		System.out.println(s+"�� �¾�̳׿�.");
	}

	//main
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		
		//���͸�
		if (month<1 || 12<month) {
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}
		
		//ȣ��
		new Prob02().printSeason(month);
	}// main
}//class
