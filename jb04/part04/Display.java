abstract class BusCharge {
	//Field
	String section;
	//Constructor
	public BusCharge(){
	}
	public BusCharge(String str){
		section = str;
	}
	//method
	public void information(){
		System.out.println("버스요금안내");
	}

	//public void charge(){
	//	System.out.println("학생 : 300, 일반인 : 500, 어르신 : 공짜");
	//}
	public abstract void charge();
}//end of class

class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge(){
		System.out.println(":: 300원\n");
	}
}// end of class

class Adult extends BusCharge {
	public Adult(){
		super("일반인");
	}
	public void charge(){
		System.out.println(":: 500원\n");
	}
}// end of class

class Old extends BusCharge {
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println(":: 공짜\n");
	}
}// end of class

public class Display {
	//main method
	public static void main(String args[]){
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 Method 호출되었는지 확인

		b2.information();
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 Method 호출되었는지 확인

		b3.information();
		System.out.println(b1.section);
		b1.charge(); // 어떤 클래스의 Method 호출되었는지 확인
	}// end of main
}// end of class

// 추상적클래스가 extends로 있으면 
// 아래에 하위클래스는 반드시 override를 해주어야 한다.
// 왜냐하면 추상클래스는 추상메소드가 행위를 하지 못하기 때문에
// 추상클래스로는 인스턴스도 생성이 되지 않는다.