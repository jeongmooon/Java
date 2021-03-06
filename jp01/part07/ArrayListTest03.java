/*
	1. Vector, ArrayList의 Hierarchy를 보면 두 클래스는 동일 한 공유구조를 갖는다
		추후 학습한 Thread의 동기화 부분에서 다른 동작을 한다.(==>  추후 학습)
	2. Generic(jdk 1.5추가기능)
		- ArrayLisy 생성시 관리할 DataType을 미리 선언 가능
		- Data 추출시 관리할 DataType이 결정되어 있으니 명시적 형변환이 불필요
*/

import java.util.*;

public class ArrayListTest03 {
	//main
	public static void main(String[] args) {

		//ArrayList 생성시 관리(저장,추출)될 인스턴스 DataType명시
		List<String> arrayList = new ArrayList<String>(10);
		
		//add(E obj) : E를 인자로 받는다는 이ㅡ미는 ? :: Generic 사용으로 묵시적 형변환 불필요
		String s1 = new String("1. 홍");
		arrayList.add(s1);
		arrayList.add(new String("2. 동"));
		arrayList.add(new String("3. 님 안녕하세요"));
		
		//Vector 저장된 값을 출력
		for(int i=0; i<arrayList.size(); i++){
			//Generic사용으로 명시적 형변환 불필요
			System.out.print(arrayList.get(i));
		}
		
		//System.out.println("\nJDK 1.5추가기능 :: Generic, Enhanced For Loop사용");
		//==> 위의 for문과 비교하여 이해하자./JDK1.5에 추가 기능 :: Enhanced For Loop
		//Vector 내부에 저장된 값을 size() 만큼 반복, 1EA씩 추출 String준다.(Generic 사용으로....)
		for(String value : arrayList){
			System.out.print(value);
		}

		System.out.println("\n ==> API확인 ");
		arrayList.add(0,"4. 길");
		arrayList.set(0,"4. 길");
		System.out.println(arrayList.get(1)+"<<<<<<<<");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> API확인 ");
		arrayList.set(3,"5. 홍길순");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> API확인 ");
		arrayList.remove(3);
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
	}
}
