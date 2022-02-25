package jp03.part05;
import java.io.*;

public class FileWriterTestFilter01 {

	public static void main(String[] args) throws IOException {

		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";
		
		int readCount = 0; //read�� Count�ϱ� ���� ����
		
		System.out.println("copy�� file �̸��� �Է��ϼ��� : ");
		//copy�� FileName�� �Է¹ޱ�
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		//==> ���� Data�� read �� �� �ִ� BufferedReader ����
		br = new BufferedReader(new FileReader(fileName));
		
		//==> �纻���� �̸� �����
		copyFileName = fileName+"_copy";
		//==> Data�� write �� �� �ִ� BufferedWriter����
		bw = new BufferedWriter(new FileWriter(copyFileName));
		
		//read/writer �ϴ� while��
		String source = null;
		while ((source=br.readLine()) != null) {
			bw.write(source);
			readCount++;	
		}
		bw.flush(); //==> ��������
		
		//Stream close()
		bw.close();
		br.close();
		
		System.out.println("==================================================");
		System.out.println("=================>>> readȽ�� readCount" + readCount);
		System.out.println("==================================================");
	

	}

}
