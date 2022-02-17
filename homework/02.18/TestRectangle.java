import java.util.Scanner;

class Rectangle {

	//Field
	String color;
	int width;
	int length;
	int area;
	int perimeter;
	
	//Constructor
	public Rectangle(){
	}

	//setter
	public void setColor(String str) {
		color = str;
	}

	public void setWidth(int a) {
		width = a;
	}

	public void setLength(int a) {
		length = a;
	}

	//getter
	public String getColor(){
		return color;
	}
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	
	//method
	public int area() {
		area = (width*length);
		return area;
	}

	public int perimeter() {
		perimeter = 2*(width+length);
		return perimeter;
	}

}//class*/

public class TestRectangle {	

	//main
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로");
		rec1.setLength(keyboard.nextInt());


		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로");
		rec2.setLength(keyboard.nextInt());
		
		// TODO 1) 두 직사각형의 넓이를 비교하시오
		if(rec1.area() > rec2.area()){
			System.out.println("넓이는 "+rec1.getColor()+"직사각형이 더 큽니다");
		} else if(rec1.area() < rec2.area()){
			System.out.println("넓이는 "+rec2.getColor()+"직사각형이 더 큽니다");
		} else {
			System.out.println("넓이는 같습니다");
		}

		// TODO 2) 두 직사각형의 둘레를 비교하시오
		if(rec1.perimeter() > rec2.perimeter()){
			System.out.println("둘레는 "+rec1.getColor()+"직사각형이 더 큽니다");
		} else if(rec1.perimeter() < rec2.perimeter()){
			System.out.println("둘레는 "+rec2.getColor()+"직사각형이 더 큽니다");
		} else {
			System.out.println("둘레는 같습니다");
		}
	}//main
}// class
