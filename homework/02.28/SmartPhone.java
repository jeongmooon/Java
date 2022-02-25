package h0228;

public class SmartPhone extends CellPhone {
	//Field
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate =isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	//getter
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	
	//setter
	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}

	
	@Override
	public void callculateTotalfee() {
		if(isMonthlyFixedRate) {
			setTotalFee(monthlyFixedFee);
			getTotalFee();
		} else {
			super.callculateTotalfee();
			getTotalFee();
		}
	}		
	
}
