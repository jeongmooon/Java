package jp03.part04;
import java.io.*;

import com.sun.xml.internal.bind.api.BridgeContext;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		
		//read 수 count 위한 변수
		int readCount = 0;
		
		//SinkStream ==> 말단에서 단숙 입출력만담당
		FileReader fr = new FileReader(args[0]);
		//FileStream ==> 추가적인 기능을 제공
		BufferedReader br = new BufferedReader(fr);
		
		//==> 위의 두 line과 아래를 비교하자
		//BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
		String oneLine = null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine(); 	//API확인
			if(oneLine ==null) {		//API확인
				break;
			}
			System.out.println("한줄출력 : "+readCount+" "+oneLine);
		}
		
		//Stream close
		br.close();
		fr.close();
	}

}
