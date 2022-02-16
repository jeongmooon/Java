public class Prob02 {
	public static void main(String[] args) {
		int[] array = {3, 24, 1, 55, 17, 43, 5};
		int[] copyArray = new int[array.length];
		String special = "";
		//int c =0;
		System.arraycopy(array, 0, copyArray, 0, array.length);

		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				
				if(array[i] > array[j]){
					//c++;
					// °ª ´ëÀÔ
					array[i] = copyArray[j];
					array[j] = copyArray[i];
										
					copyArray[i] = array[i];
					copyArray[j] = array[j];					
				}
			}
			if(i<array.length-1){
				special = ", ";
			} else {
				special = " ";
			}
			System.out.print(array[i]+special);
		}

	}// main
}// class
