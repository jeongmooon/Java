package jp03.part02;

import java.io.*;
/*
	1. byteó���� ���� Stream�� input/output Stream�� �̿��Ͽ�
		keyboard�� �Է�, monitor�� ����ϴ� ��.....
	2. �ѱ�ó��(����ó��)�� ���Ͽ� Reader/Writer�迭�� �ٲپ� �Է�,���
*/
public class WriterTest {
	//main
	public static void main(String[] args) {		

		try{

			//InputStream :: ǥ���Է���ġ �߻�ȭ�� class
			InputStream inputStream = System.in;
			//InputStream�� Reader�� ����(byteó�� ==> ����ó�� ����)
			Reader reader = new InputStreamReader(inputStream);

			//OutputStream :: ǥ�������ġ �߻�ȭ�� class
			OutputStream outputStream = System.out;
			//���� ó���� ���� Writer�� ����
			Writer writer = new OutputStreamWriter(outputStream);

			System.out.println("�Է��� ��ٸ��ϴ�...........");

			// ���� �о���̴� ���� loop����
			while(true){

				int i = reader.read();
				writer.write(i);
				writer.flush();

				if((char)i == 'x'){
					break;
				}
			}
			//==> while�� ������ flush()�� ���� flush�� �ǹ̴�?
			//w.flush();

			//Stream close()
			reader.close();
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
