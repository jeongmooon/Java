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

	
}// class
