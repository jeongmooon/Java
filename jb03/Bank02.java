public class Bank02{

	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Constructor
	public Bank02(){
	}

	public Bank02(String s1, String s2){
		bankName = s1;
		userName = s2;
	}

	public Bank02(String s1, String s2, String s3){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
	}

	public Bank02(String s1, String s2, String s3, String s4){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
		money = Integer.parseInt(s4);
	}

	//method
	public void deposit(){
		switch(command){
			case 1:
				balance += money;
				System.out.println(money+"�� �Ա���");
				break;
			case 2:
				balance -= money;
				System.out.println(money+"�� �����");
				break;
			default :
				break;
		}
	}

	//==> ���� �ݾ��� display�ϴ� method
	public void displayMoney(){
		System.out.println("���� �ܰ�� : "+balance+"�Դϴ�");
	}

	//getter/setter method ����

	//main method
	public static void main(String[] args) {
		//�Է� data�� ��ȿ�� check
		if(args.length<2){
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: ���ڰ��� �ּ� 2���� �ʿ��մϴ�.");
			System.exit(0);
		}
		System.out.println(args[0]+"���� �ְŷ�������"+args[1]+"�Դϴ�");
		Bank02 b =new Bank02();

		switch(args.length){
			case 2:
				b = new Bank02(args[0],args[1]);
				break;
			/*case 3:
				System.out.println("���ڸ� �߸��Է���");
				break;*/
			case 4:
				b = new Bank02(args[0],args[1],args[2],args[3]);
				b.deposit();
				break;
			default:
				System.out.println("Ȥ�� ���ڰ��� �ʹ� ������, �������� �ƴ���");
				break;
		}

		b.displayMoney();

	}// main
}// class
