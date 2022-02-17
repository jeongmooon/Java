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
		System.out.println("ù��° ���簢���� ����");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����");
		rec1.setLength(keyboard.nextInt());


		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setLength(keyboard.nextInt());
		
		// TODO 1) �� ���簢���� ���̸� ���Ͻÿ�
		if(rec1.area() > rec2.area()){
			System.out.println("���̴� "+rec1.getColor()+"���簢���� �� Ů�ϴ�");
		} else if(rec1.area() < rec2.area()){
			System.out.println("���̴� "+rec2.getColor()+"���簢���� �� Ů�ϴ�");
		} else {
			System.out.println("���̴� �����ϴ�");
		}

		// TODO 2) �� ���簢���� �ѷ��� ���Ͻÿ�
		if(rec1.perimeter() > rec2.perimeter()){
			System.out.println("�ѷ��� "+rec1.getColor()+"���簢���� �� Ů�ϴ�");
		} else if(rec1.perimeter() < rec2.perimeter()){
			System.out.println("�ѷ��� "+rec2.getColor()+"���簢���� �� Ů�ϴ�");
		} else {
			System.out.println("�ѷ��� �����ϴ�");
		}
	}//main
}// class
