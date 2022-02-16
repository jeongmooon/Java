public class Bank02app
{
	//main method
	public static void main(String[] args) {
		//�Է� data�� ��ȿ�� check
		if(args.length<2){
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: ���ڰ��� �ּ� 2���� �ʿ��մϴ�.");
			System.exit(0);
		}
		System.out.println(args[0]+"���� �ְŷ������� "+args[1]+"�Դϴ�");
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
}