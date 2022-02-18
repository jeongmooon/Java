/*
	1. Vector �� ���� ���ڿ� ���� ����ϴ� for ���� Method�� ����, ����
	2. Vector �� Ȯ���Ͽ� �ʿ��� ���(method)�� �߰�
*/

import java.util.*;

public class VectorTest02 {
	//Field

	//Constructor
	public VectorTest02(){
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement);
	}

	//method
	// Vector�� ����(?, ����)�� ���ڿ� ���� ����ϴ� Method����
	public void pringString(Vector vector){
		//for(int i=0; i<vector.size(); i++){
		//	System.out.print((String)vector.elementAt(i));
		//}

		//���� for���� ���Ͽ� ��������./ JDK1.5�� �߰��� ��� :: Enhanced For Loop
		//Vector ���ο� ����� ���� size()��ŭ �ݺ�, 1EA �� ���� Object�� �ٸ� �ش�.
		for (Object object : vector){
			//==> ���� for���� elementAt() �� Casting �� �Ͱ� ���Ͽ� ����
			System.out.print ((String)object));
		}
	}

	//main method
	public static void main(String[] args) {
		//Vector Ȯ���Ͽ� �߰��� ���(pringString())�� ������ VectorTest02 �ν��Ͻ� ����
		VectorTest02 vectorTest = new VectorTest02(10,10);

		//Vecotr�� Objcect����
		String s1 = new String("1.ȫ");
		vectorTest.add(s1);
		vectorTest.add(new String("2. ��");
		vectorTest.add("3. �� �ȳ��ϼ���");
		//Vector ����� ���� ���
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> APIȮ�� ");
		vectorTest.insertElementAt("4. ��",1);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> APIȮ�� ");
		vectorTest.insertElementAt("5. ȫ���",3);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> APIȮ�� ");
		vectorTest.removeElementAt(3);;
		vectorTest.pringString(vectorTest);
	}// main
}//class
