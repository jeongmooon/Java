abstract class Shape {
	//Field
	private String name;
	protected double area;

	public Shape(){
	}
	public Shape(String name){
		this.name = name;
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setArea(double area){
		this.area = area;
	}
	//getter
	public String getName(){
		return name;
	}
	public double getArea(){
		return area;
	}
	
	public void print(){
		System.out.println(getName()+"의 면적은"+area);
	}

	public abstract void calculationArea();
}

class Circle extends Shape {
	private double radius;

	public Circle(){}
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void calculationArea(){
		// Math API호출해서 PI값 가져오기(public이여서 호출가능)
		super.setArea(radius*radius*Math.PI);		
	}
}

class Rectangular extends Shape {
	private double width;
	private double hight;

	public Rectangular(){}
	public Rectangular(String name, double width, double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}

	//setter
	public void setWidth(double width){
		this.width=width;
	}
	public void setHight(double higth){
		this.hight=hight;
	}
	//getter
	public double getWidth(){
		return width;
	}
	public double getHigth(){
		return hight;
	}
	//method
	public void calculationArea(){
		super.setArea(width*hight);
	}
}
public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("원", 10);
		//System.out.print(shape[0].area);
		shape[1] = new Rectangular("직사각형", 10,20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}
	}
}
