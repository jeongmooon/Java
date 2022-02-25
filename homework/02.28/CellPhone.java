package h0228;

public class CellPhone {
	//Field
	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	//getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	
	//setter
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	//method
	public void call(String phoneNumber, int totalCallTime) {
		this.totalCallTime += totalCallTime;
		
		System.out.println(phoneNumber+"번호로 "+totalCallTime+" 통화함");
	}
	
	public void callculateTotalfee() {
		totalFee = totalCallTime*feePerCallTime;
	}
}
