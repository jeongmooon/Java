public class Bank03app
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
		Bank03 b =new Bank03();
		
		if(args.length == 2) {
			b.setBankName(args[0]);
			b.setUserName(args[1]);

		} else if(args.length == 4) {
			b.setBankName(args[0]);
			b.setUserName(args[1]);
			b.setCommand(args[2]);
			b.setMoney(args[3]);
		}
		
		b.deposit();
		b.displayMoney();

	}// main
}