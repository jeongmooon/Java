package h0228.test;
import h0228.CellPhone;
import h0228.SmartPhone;

public class Prob {

	public static void main(String[] args) {

		//전화번호 feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		//상대전화번호와 통화시간을 인자로 전달하는 call MEthod 호출
		cellPhone.call("010-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.callculateTotalfee();
		System.out.println(cellPhone.getPhoneNumber()+"의 통화 시간은 "+
							cellPhone.getTotalCallTime()+" 이며 \n"+
							"단가 "+cellPhone.getFeePerCallTime()+
							" 총 요금은 "+cellPhone.getTotalFee()+"원 입니다");
		
		System.out.println("===========================================");
		
		//전화번호 feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
		SmartPhone smartPhone = new SmartPhone("010-010-010",200);
		//상대전화번호와 통화시간을 인자로 전달하는 call MEthod 호출
		smartPhone.call("010-017-017",10);
		smartPhone.callculateTotalfee();
		System.out.println(smartPhone.getPhoneNumber()+"의 통화 시간은 "+
							smartPhone.getTotalCallTime()+" 이며 \n"+
							"단가 "+smartPhone.getFeePerCallTime()+
							" 총 요금은 "+smartPhone.getTotalFee()+"원 입니다");
		
		System.out.println("===========================================");

		//전화번호 feePerCallTime을 초기화하는 생성자 호출 인스턴스 생성
		SmartPhone smartPhone01 = new SmartPhone("111-111-111",0, true, 3000);
		//상대전화번호와 통화시간을 인자로 전달하는 call MEthod 호출
		smartPhone01.call("010-017-017",10);
		smartPhone01.call("016-016-016",10);
		smartPhone01.callculateTotalfee();
		System.out.println(smartPhone01.getPhoneNumber()+"의 통화 시간은 "+
							smartPhone01.getTotalCallTime()+" 이며 \n"+
							"단가 "+smartPhone01.getFeePerCallTime()+
							" 총 요금은 "+smartPhone01.getTotalFee()+"원 입니다");
		
		System.out.println("===========================================");
	}

}
