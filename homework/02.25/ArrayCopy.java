package h0225;

import java.util.Vector;

public class ArrayCopy {
	public Vector<String> moveToVector(String[] datas){
		Vector<String> arr = new Vector<String>(datas.length,10);
		
		System.out.println("���ϵǴ� Vector : ");
		for(int i=0; i<datas.length; i++){	
			arr.add(i,datas[datas.length-1-i]);
			//System.out.print(arr.get(i));
			
			// " 5",.... ����� ����� �ʹٸ�
			// �����ؼ� �迭 ���ڰ��� ����ϰ� true, false�� ��ǥ�� ����ϸ��
			System.out.print("\" "+arr.get(i)+"\""+((i == datas.length-1) ? "" :","));
		}
		System.out.println("�� ������ ����� Vector");
		//System.out.println(arr.get(0));
		
		return arr;
	}
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}
}

