package h0307.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Prob02 {
	
	//method
	public static int[] generateRandomNumber() {
		Random r = new Random();
		
		int[] ia = new int[10];
		for(int i=0; i<ia.length; i++) {
			ia[i] = r.nextInt(19)+1;	
		}		
		return ia;
	}
	
	public static void printStatisics(int[] array) throws Exception {
		BufferedWriter bw = null;
		try {
			int avg = array[0];
			int max = array[0];
			int min = array[0];
			bw = new BufferedWriter(new FileWriter("src/store.txt",true));
			for(int i=0; i<array.length; i++) {
				
				if(max<array[i]) {
					max = array[i];
				}
				if(min>array[i]) {
					min = array[i];
				}
				avg += array[i];
				bw.write(Integer.toString(array[i]));
				bw.newLine();
			}
			bw.write("최대값 : "+Integer.toString(max));
			bw.newLine();
			bw.write("최소값 : "+Integer.toString(min));
			bw.newLine();
			bw.write("평균값 : "+Integer.toString(avg/array.length));
			bw.newLine();			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}			
		}
		
		
	}
	
	//main
	public static void main(String[] args) throws Exception {
		int[] array = generateRandomNumber();
		printStatisics(array);
	}

}
