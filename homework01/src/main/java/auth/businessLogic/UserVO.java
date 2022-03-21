package auth.businessLogic;

import java.util.HashMap;
import java.util.Map;

public class UserVO {
	//Field
	private String id;
	private String passwd;
	private String name;
	private String gender;
	private String cal;
	private String luCal;
	private String education;
	private String job;
	private String merry;
	private String childnum;
	private String contactnum;
	private String phonenum;
	private String adress;
	private boolean active;
	
	public UserVO() {
	}

	@Override
	public String toString() {
		return "[id=" + id + ", passwd=" + passwd + ", name=" + name + ", gender=" + gender + ", cal=" + cal
				+ ", luCal=" + luCal + ", education=" + education + ", job=" + job + ", merry=" + merry + ", childnum="
				+ childnum + ", contactnum=" + contactnum + ", phonenum=" + phonenum + ", adress=" + adress
				+ "]";
	}

	// getter
	public String getId() {
		return id;
	}

	public String getPasswd() {
		return passwd;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getCal() {
		return cal;
	}

	public String getLuCal() {
		return luCal;
	}

	public String getEducation() {
		return education;
	}

	public String getJob() {
		return job;
	}

	public String getMerry() {
		return merry;
	}

	public String getChildnum() {
		return childnum;
	}

	public String getContactnum() {
		return contactnum;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public String getAdress() {
		return adress;
	}
	
	public boolean isActive() {
		return active;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCal(String cal) {
		this.cal = cal;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMerry(String merry) {
		this.merry = merry;
	}

	public void setChildnum(String childnum) {
		this.childnum = childnum;
	}

	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	public void setLuCal(String luCal) {
		this.luCal = luCal;
	}
	
	public void setAll(Map<String,String> UM) {
		this.id = UM.get("id");
		this.passwd = UM.get("passwd");
		this.name = UM.get("name");
		this.gender = UM.get("gender");
		this.cal = UM.get("cal");
		this.luCal = UM.get("luCal");
		this.education = UM.get("education");
		this.job = UM.get("jobs");
		this.merry = UM.get("merry");
		this.childnum = UM.get("childnum");
		this.contactnum = UM.get("contactnum");
		this.phonenum = UM.get("phone");
		this.adress = UM.get("adress");
	}
	
	public String[] getAll() {
		String[] all = new String[]{id,passwd,name,gender,cal,luCal,education,job,merry,childnum,contactnum,phonenum,adress};
		return all;
	}
}
