public class Prob03 {
	public static void main(String[] args) {
		int year = 2010;
		int month = 2;
		int maxDay = 0;
		
		if(year%4 ==0){
			if(year%100 ==0){
				if(year%400 ==0){
					maxDay=29;
				}
				maxDay = 28;				 
			}
			maxDay = 29;
		} else {
			maxDay = 28;
		}

		System.out.println(year+"년 "+month+"월의 말일은 "+maxDay+"일 입니다");
	}
}
