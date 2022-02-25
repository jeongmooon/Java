package jp03.part06;
import java.io.*;

public class WriteObjectFile {

	public static void main(String[] args) throws Exception {
		
		// 1. instance 를 File에 저장할 SinkStream :: FileOutputStream 생성
		// 2. instance 를 전송하는 FilterStream : ObjectOutputStream 생성
		ObjectOutputStream oos
			= new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));
		
		oos.writeObject(new UserVO(1,"홍길동")); //==> API확인
		oos.writeObject(new UserVO(2,"홍길순")); //==> API확인
		
		//Stream close();
		oos.close();
	}

}
