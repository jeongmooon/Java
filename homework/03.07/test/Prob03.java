package h0307.test;

import java.util.Vector;

import h0307.FileUtil;
import h0307.User;

public class Prob03 {

	public static void main(String[] args) throws Exception {
		//��(����) ������ ���� FileName ����
		String pathName = "./src/data1.txt";
		
		//data.txt ���� ���
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==========================");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddres(pathName, "����");
		for (User user : vector) {
			System.out.println(user);
		}
		
		System.out.println("==========================");
		//data.txt ������ ���� ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ���� ���� �˻�");
		Vector<User> vector1 = FileUtil.fileFindAddres(pathName, "����");
		for (User user : vector1) {
			System.out.println(user);
		}
		
		System.out.println("==========================");
		//data.txt ������ ��⵵ ������ �˻�, ����� ���� Vector �ν��Ͻ� �ޱ�
		System.out.println("���� ������ ��⵵ ���� �˻�");
		Vector<User> vector2 = FileUtil.fileFindAddres(pathName, "��⵵");
		for (User user : vector2) {
			System.out.println(user);
		}
	}

}
