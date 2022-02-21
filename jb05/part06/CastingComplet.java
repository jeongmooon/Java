class Super {
	public void a(){
		System.out.println("Super : a()");
	}
}

class Sub extends Super {
	public void a(){
		System.out.println("Overriding된 Sub : a()");
	}
	public void b(){
		System.out.println("Sub : b()");
	}
}

public class CastingComplet {
	public static void main(String args[]){
		System.out.println("\n 여기는 Super s1 = new Super()부분");
		Super s1 = new Super();
		s1.a();

		System.out.println("\n 여기는 Super s2 = new Sub()부분");
		Sub s2 = new Sub();
		s2.a();
		s2.b();

		System.out.println("\n 여기는 Super s3 = new Sub()부분");
		Super s3 = new Sub();
		s3.a();

		System.out.println("\n casting연산자를 이용 Sub sub = (Sub)s3 명시적 형변환");
		Sub sub = (Sub)s3; //<<== casting 연산자 이용 명시적 형변환
		sub.b();
	}
}
