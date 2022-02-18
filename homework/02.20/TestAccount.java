class Account {
	//Field
	String accNo;
	int balance;
	
	//Constructor
	public Account(String str){
		accNo = str;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
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
		//입금
		balance += save;
		System.out.println(accNo+" 계좌의 잔고에 "+balance+"만원이 입금되었습니다.");
	}

	public void deposit(int deposit){
		//출금
		balance -= deposit;
		System.out.println(accNo+" 계좌의 잔고에 "+balance+"만원이 출금되었습니다.");
	}
}

public class TestAccount {
	public static void main(String[] args) {
		String accNo = null;
		int balance = 0;

		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원입니다");

		accObj.save(100);
		balance = accObj.getBalance();
		System.out.println(accObj.getAccNo() + " 계좌의 잔고는 "+balance+"만원입니다");

		accObj.deposit(30);
		balance = accObj.getBalance();
		System.out.println(accNo + " 계좌의 잔고는 "+balance+"만원입니다");
	}
}
