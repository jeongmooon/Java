public class StringUtil {
	public static String replaceString(String[] arr){
		String[] strArr = new String[arr.length];
		String str = "";
		int[] rArr = new int[arr.length];
		int r = 0;
		int max = rArr[0];
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++){
			r=0;
			for(int j=0; j<arr[i].length(); j++){
				char c = arr[i].charAt(j);
				if(97 == c){
					str += (char)(c-32);					
					r++;
				} else{
					str += c;
				}
				rArr[i] = r;
			}
			strArr[i] = str;
			str="";
			//System.out.println(rArr[i]);
			//System.out.println(strArr[i]);
			if(max < rArr[i]){
				max = rArr[i];
				maxIndex =i;
			}
		}		
		return strArr[maxIndex];
	}
	public static void main(String[] args) {
		String[] arr = {"java program","array","java program area","append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
	}
}
