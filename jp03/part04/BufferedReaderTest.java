package jp03.part04;
import java.io.*;

import com.sun.xml.internal.bind.api.BridgeContext;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		
		//read �� count ���� ����
		int readCount = 0;
		
		//SinkStream ==> ���ܿ��� �ܼ� ����¸����
		FileReader fr = new FileReader(args[0]);
		//FileStream ==> �߰����� ����� ����
		BufferedReader br = new BufferedReader(fr);
		
		//==> ���� �� line�� �Ʒ��� ������
		//BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine(); 	//APIȮ��
			if(oneLine ==null) {		//APIȮ��
				break;
			}
			System.out.println("������� : "+readCount+" "+oneLine);
		}
		
		//Stream close
		br.close();
		fr.close();
	}

}
