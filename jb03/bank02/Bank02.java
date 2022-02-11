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
				System.out.println(money+"원 입금함");
				break;
			case 2:
				balance -= money;
				System.out.println(money+"원 출금함");
				break;
			default :
				break;
		}
	}

	//==> 현재 금액은 display하는 method
	public void displayMoney(){
		System.out.println("현재 잔고는 : "+balance+"입니다");
	}

	//getter/setter method 생략

	
}// class
