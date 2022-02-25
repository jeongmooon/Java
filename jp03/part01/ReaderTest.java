package jp03.part01;

import java.io.*;
/*
	1. java.io packag : ���α׷� �ܺη� �ڿ��� �ްų�, ���� ��쿡 ���
	2. keyboard�� ���� data�� �о� ���̸�.........
	==========================================================
	InputStream�� �ѱ�ó��(2byte)�� ���� �ʴ´�.
	���ڸ� ó���ϴ� Reader �迭�� �ٲٸ�
*/
public class ReaderTest {
	//main
	public static void main(String[] args) throws IOException {		


			//InputStream :: ǥ���Է���ġ �߻�ȭ�� class
			//InputStream inputStream = System.in;
			//InputStream�� Reader�� ����(byteó�� ==> ����ó�� ����)
			Reader reader = new InputStreamReader(System.in);

			System.out.println("�Է��� ��ٸ��ϴ�...........");

			// ���� �о���̴� ���� loop����
			while(true){
				//1. java.io�� ����(block)�� �� �ִ�.
				int i;
				i = reader.read();
				char c = (char)i;

				//2. java.io�� FIFO�� ����
				System.out.println("�Է��Ͻ� �� : "+c);

				//==> char 'x'�� �ԷµǸ� while ����
				if(c == 'x'){
					reader.close();
					break;
				}
				//�ѱ� �Է½� ���� �ѱ� 1EA�� 2�� ����� ���� Ȯ��
			}
		
	}
}

