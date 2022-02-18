class Account {
	//Field
	String accNo;
	int balance;
	
	//Constructor
	public Account(String str){
		accNo = str;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}

	//getter
	public String getAccNo(){
		return accNo;
	}
	public int getBalance(){
		return balance;
	}

	//method
	public void save(int save){
		//�Ա�
		balance += save;
		System.out.println(accNo+" ������ �ܰ� "+balance+"������ �ԱݵǾ����ϴ�.");
	}

	public void deposit(int deposit){
		//���
		balance -= deposit;
		System.out.println(accNo+" ������ �ܰ� "+balance+"������ ��ݵǾ����ϴ�.");
	}
}

public class TestAccount {
	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�����Դϴ�");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " ������ �ܰ�� "+balance+"�����Դϴ�");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " ������ �ܰ�� "+balance+"�����Դϴ�");
	}
}
