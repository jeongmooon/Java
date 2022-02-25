package h0228.test;
import h0228.CellPhone01;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone01 myPhone = new CellPhone01("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		
		System.out.println("==============================================");
		
		myPhone.call(300);
		myPhone.printBattery();
		
		System.out.println("==============================================");
		
		myPhone.charge(-50);
		myPhone.printBattery();
		
		System.out.println("==============================================");
		
		myPhone.call(40);
		myPhone.printBattery();
		
		System.out.println("==============================================");
		
		try {
			myPhone.call(-20);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("==============================================");
		
		CellPhone01 yourPhone = new CellPhone01("SCH-600");
		//CellPhone01 yourPhone1 = new CellPhone01("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다");
		} else {
			System.out.println("다른 모델입니다");
		}
	}

}
