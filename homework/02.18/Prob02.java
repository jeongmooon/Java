public class Prob02 {
	//method
	public void printSeason(int month){
		String s="";
		
		switch(month){
			case 3 :
			case 4 :
			case 5 :
				s = "봄";
				break;
			case 6 :
			case 7 :
			case 8 :
				s = "여름";
				break;
			case 9 :
			case 10 :
			case 11 :
				s = "가을";
				break;
			case 12 :
			case 1:
			case 2 :
				s = "겨울";
				break;
		}
		System.out.println(s+"에 태어나셨네요.");
	}

	//main
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		
		//필터링
		if (month<1 || 12<month) {
			System.out.println("1~12 사이의 숫자를 입력하셔야 합니다.");
			return;
		}
		
		//호출
		new Prob02().printSeason(month);
	}// main
}//class
