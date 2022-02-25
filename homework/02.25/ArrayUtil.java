package h0225;

public class ArrayUtil {
	public char[] reverseString(char[] s, int start, int end){
		int a = 0;

		char[] cs = new char[s.length];
		char[] cs1 = new char[s.length];
		
		System.arraycopy(s, 0, cs, 0, s.length);
		System.arraycopy(s, 0, cs1, 0, s.length);
		
		for(int i=start; i<=end; i++){
				cs[i] = cs1[end-a];
				a++;
				//System.out.println(a);
				//System.out.println("end-i"+(end-i));
				//System.out.print(s[i]);
			}
		return cs;
	}

	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		System.out.println(au.reverseString(s,0,3));
		System.out.println(au.reverseString(s,4,7));
		System.out.println(au.reverseString(s,8,10));
		System.out.println(au.reverseString(s,0,10));
	}
}
