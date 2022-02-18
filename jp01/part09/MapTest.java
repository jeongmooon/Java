/*
	:: java.util.Map : key = value Map ������ Data����
		������ Map(interface) / Hashtable API�� Ȯ���ϰ� Method �ǹ̸� Ȯ��
		�Ʒ��� ��°���� ���� �� Ȯ��
*/

import java.util.Hashtable;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Mat<String,String> map = new Hashtable<String, String>();

		String key = new String("ȫ�浿");
		String value = new String("����");
		map.put(key,value);

		map.put("�̼���","���� ���屺");
		map.put("�ָ�","��������");
		
		String value01 = map.get("�ָ�");
		System.out.println("�ָ� ���� : "+value01);

		if(map.containsKey("�̼���")){
			System.out.println("�̼����� key�� ���� value�� ������ value : "+map.get("�̼���"));
		}

		if(map.containsKey("������")){
			System.out.println("�������� key�� ���� value�� ������ value : "+map.get("������"));
		}

		if(map.containsKey("����")){
			System.out.println("������ value�� ���� data�� �ֽ��ϴ�");
		}

		if(map.containsKey("����")){
			System.out.println("������ value�� ���� data�� �ֽ��ϴ�");
		}

	}
}
