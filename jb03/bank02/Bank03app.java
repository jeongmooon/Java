public class Bank03app
{
	//main method
	public static void main(String[] args) {
		//입력 data의 유효성 check
		if(args.length<2){
			System.out.println("[usage]:: java Bank [customerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
			System.exit(0);
		}
		System.out.println(args[0]+"님의 주거래은행은 "+args[1]+"입니다");
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
