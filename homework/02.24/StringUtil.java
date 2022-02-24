public class StringUtil {
	public static String replaceString(String[] arr){
		int[] rArr = new int[arr.length];
		int r = 0;
		int max = 0;
		int maxIndex = 0;

		for(int i=0; i<arr.length; i++){
			r=0;
			for(int j=0; j<arr[i].length(); j++){
				if(97 == arr[i].charAt(j)){					
					r++;
				}
				rArr[i] = r;
			}
			//System.out.println(rArr[i]);
			if(max < rArr[i]){
				max = rArr[i];
				maxIndex =i;
			}
		}		
		return arr[maxIndex].replace('a','A');
	}
	public static void main(String[] args) {
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
	}
}
