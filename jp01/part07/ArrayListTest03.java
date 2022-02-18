/*
	1. Vector, ArrayList�� Hierarchy�� ���� �� Ŭ������ ���� �� ���������� ���´�
		���� �н��� Thread�� ����ȭ �κп��� �ٸ� ������ �Ѵ�.(==>  ���� �н�)
	2. Generic(jdk 1.5�߰����)
		- ArrayLisy ������ ������ DataType�� �̸� ���� ����
		- Data ����� ������ DataType�� �����Ǿ� ������ ������ ����ȯ�� ���ʿ�
*/

import java.util.*;

public class ArrayListTest03 {
	//main
	public static void main(String[] args) {

		//ArrayList ������ ����(����,����)�� �ν��Ͻ� DataType����
		ArrayList<String> arrayList = new ArrayList<String>(10);
		
		//add(E obj) : E�� ���ڷ� �޴´ٴ� �̤ѹ̴� ? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1 = new String("1. ȫ");
		arrayList.add(s1);
		arrayList.add(new String("2. ��"));
		arrayList.add(new String("3. �� �ȳ��ϼ���"));
		
		//Vector ����� ���� ���
		for(int i=0; i<arrayList.size(); i++){
			//Generic������� ������ ����ȯ ���ʿ�
			System.out.print(arrayList.get(i));
		}
		
		//System.out.println("\nJDK 1.5�߰���� :: Generic, Enhanced For Loop���");
		//==> ���� for���� ���Ͽ� ��������./JDK1.5�� �߰� ��� :: Enhanced For Loop
		//Vector ���ο� ����� ���� size() ��ŭ �ݺ�, 1EA�� ���� String�ش�.(Generic �������....)
		for(String value : arrayList){
			System.out.print(value);
		}

		System.out.println("\n ==> APIȮ�� ");
		arrayList.add(1,"4. ��");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> APIȮ�� ");
		arrayList.set(3,"5. ȫ���");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

		System.out.println("\n ==> APIȮ�� ");
		arrayList.remove(3);
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
	}
}