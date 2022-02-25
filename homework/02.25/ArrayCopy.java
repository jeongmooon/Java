package h0225;

import java.util.Vector;

public class ArrayCopy {
	public Vector<String> moveToVector(String[] datas){
		Vector<String> arr = new Vector<String>(datas.length,10);
		
		System.out.println("리턴되는 Vector : ");
		for(int i=0; i<datas.length; i++){	
			arr.add(i,datas[datas.length-1-i]);
			//System.out.print(arr.get(i));
			
			// " 5",.... 모양을 만들고 싶다면
			// 분해해서 배열 인자값을 출력하고 true, false로 쉼표를 출력하면됨
			System.out.print("\" "+arr.get(i)+"\""+((i == datas.length-1) ? "" :","));
		}
		System.out.println("의 순서로 저장된 Vector");
		//System.out.println(arr.get(0));
		
		return arr;
	}
	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}
}

