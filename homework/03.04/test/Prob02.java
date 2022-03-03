package h0304.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.Vector;

import h0304.Score;

public class Prob02 {
	/*
	public Vector<Score> getScore(String fileNmae) throws Exception {
		BufferedReader br = null;
		String str = null;
		
		Vector<Score> vs = new Vector<Score>();
		byte[] serializedVs;
        String serializedVsStr = "";
        
		try{br = new BufferedReader(new FileReader(fileNmae));
			while((str=br.readLine()) != null){
				String name = str.split("/")[0];
				int kor = Integer.parseInt(str.split("/")[1]);
				int eng = Integer.parseInt(str.split("/")[2]);
				int math = Integer.parseInt(str.split("/")[3]);
				int sum = kor+eng+math;
				
				Score s = new Score(name, kor, eng, math, sum);				
				vs.add(s);
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(vs);
				serializedVs = baos.toByteArray();
				serializedVsStr = Base64.getEncoder().encodeToString(serializedVs);
			}
		} catch(Exception e) {
			System.out.println(e.getClass() + e.getMessage());
		} finally {
			if(br != null) {
				br.close();
			}
		}
		System.out.println(serializedVsStr);
		return vs;
	}
	*/
	public String getScore(String fileNmae) throws Exception {
		BufferedReader br = null;
		String str = null;
		
		Vector<Score> vs = new Vector<Score>();
		byte[] serializedVs;
        String serializedVsStr = "";
        
        FileOutputStream fos = null;
        
		try{br = new BufferedReader(new FileReader(fileNmae));
			while((str=br.readLine()) != null){
				String name = str.split("/")[0];
				int kor = Integer.parseInt(str.split("/")[1]);
				int eng = Integer.parseInt(str.split("/")[2]);
				int math = Integer.parseInt(str.split("/")[3]);
				int sum = kor+eng+math;
				
				Score s = new Score(name, kor, eng, math, sum);				
				vs.add(s);
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(vs);
				
				//fos = new FileOutputStream("t123.txt");
				//ObjectOutputStream oos = new ObjectOutputStream(fos);
				//oos.writeObject(vs);
								
				serializedVs = baos.toByteArray();
				serializedVsStr = Base64.getEncoder().encodeToString(serializedVs);
				
				fos = new FileOutputStream("t123.txt");
				ObjectOutputStream oos1 = new ObjectOutputStream(fos);
				oos1.writeObject(serializedVsStr);
			}
		} catch(Exception e) {
			System.out.println(e.getClass() + e.getMessage());
		} finally {
			if(br != null) {
				br.close();
			}
		}
		//System.out.println(serializedVsStr);
		return serializedVsStr;
	}
	
	public void deserialize(byte[] serializedVs) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedVs)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                Object o = ois.readObject();
                Vector<Score> vs = (Vector<Score>) o;
                for (Score score : vs) {
					System.out.println(score);
				}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) throws Exception {
		Prob02 p2 = new Prob02();
		//Vector<Score> scores = p2.getScore("src/data.txt");
		String str = p2.getScore("src/data.txt");
		
		//System.out.println(str);
		
		p2.deserialize(Base64.getDecoder().decode(str));
		
//		for (Score score : scores) {
//			System.out.println(score);
//		}
	}

}
