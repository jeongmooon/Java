package h0307;

public class User {
	private String name;
	private String adress;
	private String phoneNumber;
	private String sex;
	
	public User() {
	}

	public User(String name, String adress, String phoneNumber, String sex) {
		super();
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "이름 " + name + ", 핸드폰 : " + phoneNumber + ", 성별 : " + sex + ", 주소 : " + adress;
	}
	
	//getter
	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getSex() {
		return sex;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
