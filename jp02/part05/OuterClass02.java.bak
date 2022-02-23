public class OuterClass02 {
	//Field
	private String outer = "OuterClass 의 Filed";

	//Constructor
	public OuterClass02(){}

	//Method
	public void outerMethod(){

		System.out.println(":: " +this.getClass().getName()+" start ..");

		final String localVariable = "OuterClass 내의 outerMethod 의 localVariable";

		//inner local Class
		class InnerLocalClass{
			//Field
			private String inner = "innerClass의 Field";

			//Constructor
			public InnerLocalClass(){}

			//Method
			public void innerMethod(){
				System.out.println(":: " +this.getClass().getName()+" start ..");
				//innerClass에서 OuterClass로 접근하기
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==> "+this.getClass().getName()+" end.. ");
			}
		}

		System.out.println(":: " +this.getClass().getName()+" start ..");
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();
	}	

	//main method
	public static void main(String[] args) {
		new OuterClass02().outerMethod();
	}
}
