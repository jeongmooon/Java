public class Bank03{

	//Field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;	

	// setter method
	public void setBankName(String args){
		this.bankName = args;
	}

	public void setUserName(String args){
		this.userName = args;
	}

	public void setCommand(String args){
		int c = Integer.parseInt(args);
		this.command = c;
	}

	public void setMoney(String args){
		int m = Integer.parseInt(args);
		this.money = m;
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
