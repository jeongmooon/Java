package h0307;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class FileUtil {
	public static void fileToPrint(String fileName) throws Exception{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String str = null;
			
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br.readLine() != null) {
					br.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}		
	}
	
	public static Vector<User>fileFindAddres(String fileName, String adress) throws Exception{
		BufferedReader br = null;
		Vector<User> vu = new Vector<User>();
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			String str = null;			
			
			while((str=br.readLine()) != null) {
				
				if(str.split("/")[1].contentEquals(adress)) {
					User u = new User(str.split("/")[0],str.split("/")[1],str.split("/")[2],str.split("/")[3]);
					vu.add(u);
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br.readLine() != null) {
					br.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		
		return vu;
	}
}
