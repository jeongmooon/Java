//package h0228;

import java.util.Vector;

public class Prob02 {
	//Field
	//Constructor
	//Method
	public Vector<String> dataChange(String[] strData){
		for(int i=0; i<strData.length; i++) {
			StringBuffer strb = new StringBuffer(strData[i]);
			String str = new String(strb.reverse());
			strData[i] = str;
		}
		
		Vector<String> v = new Vector<String>();
		
		for(int loop=strData.length-1; 0<=loop; loop--) {
			v.add(strData[loop]);
		}
		//System.out.println(v);
		return v;
	}
	
	//main
	public static void main(String[] args) {
		Prob02 st = new Prob02();
		String[] strData = {"Java Programming","JDBC","Oracle10g","JSP/Servlet"};
		Vector<String> v = st.dataChange(strData);
		
		for (int i = 0; i < strData.length; i++) {
			System.out.println(v.elementAt(i));			
		}
	}//main
}//class
