package h0304;

public class Account {
	//Field
		private String accountNo;
		private boolean creditLine;
		private int creditLineLimit;
		private int balance;
		
		//Constructor
		public Account() {		
		}
		public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
			this.accountNo = accountNo;
			this.creditLine = creditLine;
			this.creditLineLimit = creditLineLimit;
			this.balance = balance;
		}
			
		@Override
		public String toString() {
			return "계좌번호 :"+getAccountNo()+", 잔고 : "+balance+"\t"+ ((creditLine) ? ("[[ -"+getCreditLineLimit()+"원 마이너스 통장]]") : "");
		}
		
		//getter
		public String getAccountNo() {
			return accountNo;
		}
		public boolean isCreditLine() {
			return creditLine;
		}
		public int getCreditLineLimit() {
			return creditLineLimit;
		}
		public int getBalance() {
			return balance;
		}
		
		//setter
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public void setCreditLine(boolean creditLine) {
			this.creditLine = creditLine;
		}
		public void setCreditLineLimit(int creditLineLimit) {
			this.creditLineLimit = creditLineLimit;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		//method
		public void withdraw(int money) throws Exception {
			balance -= money;
			if(balance <0) {
				if(creditLine) {
					if(Math.abs(balance)>creditLineLimit) {
						balance +=money;
						throw new Exception("잔고부족 출금 불가");
					} else {
						return;
					}
				} else {
					balance += money;
					throw new Exception("잔고부족 출금 불가");
				}
			}
		}
		public void deposit(int money) {
			balance += money;
		}
}