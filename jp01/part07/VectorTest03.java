/*
	:: Generic : jdk1.5추가기능
		- Vector 생성시 관리할 DataType을 미리선언 가능
		- Data추출시 관리할 DataType이 결정되어 잇으니 명시적형변환이 불필요
*/

import java.util.*;

public class VectorTest03 {
	//main
	public static void main(String[] args) {

		//Vector 객체 생성시 관리(저장,추출)될 인스턴스 DataType명시
		List<String> vector = new Vector<String>(10,10);
		
		//Vectordp String저장
		//add(E obj) : E를 인자로 받는다는 이ㅡ미는 ? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1. 홍");
		vector.add(s1);
		vector.add(new String("2. 동"));
		vector.add(new String("3. 님 안녕하세요"));
		
		//Vector 저장된 값을 출력
		for(int i=0; i<vector.size(); i++){
			//Generic사용으로 명시적 형변환 불필요
			String s = vector.get(i);
			System.out.print(s);
			//System.out.print(vector.elementAt(i));
		}
		
		//System.out.println("\nJDK 1.5추가기능 :: Generic, Enhanced For Loop사용");
		//==> 위의 for문과 비교하여 이해하자./JDK1.5에 추가 기능 :: Enhanced For Loop
		//Vector 내부에 저장된 값을 size() 만큼 반복, 1EA씩 추출 String준다.(Generic 사용으로....)
		for(String value : vector){
			System.out.print(value);
		}

		System.out.println("\n ==> API확인 ");
		vector.add(1, "4. 길");
		for(String value : vector){
			System.out.print(value);
		}

		System.out.println("\n ==> API확인 ");
		vector.set(3, "5. 홍길순");
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.get(i));
		}

		System.out.println("\n ==> API확인 ");
		vector.remove(3);
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.get(i));
		}
	}
}
