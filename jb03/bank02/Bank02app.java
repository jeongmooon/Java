public class Bank02app
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
		Bank02 b =new Bank02();

		switch(args.length){
			case 2: 
				b = new Bank02(args[0],args[1]);
				break;
			/*case 3:
				System.out.println("인자를 잘못입력함");
				break;*/
			case 4:
				b = new Bank02(args[0],args[1],args[2],args[3]);
				b.deposit();
				break;
			default:
				System.out.println("혹시 인자값이 너무 많은게, 적은것이 아닌지");
				break;
		}
		b.displayMoney();

	}// main
}
