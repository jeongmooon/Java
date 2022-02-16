public class SortUtil {
	public int[] ascending(int[] inputNumbers){
		int[] array = inputNumbers;
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
		return array;
	}

	public static void main(String[] args) {
		SortUtil util = new SortUtil();
		int[] numbers = new int[]{7,5,2,19,34,51,32,11,67,21};

		numbers = util.ascending(numbers);

		//for(int i=9; i<numbers.length; i++)
		
	}
}
