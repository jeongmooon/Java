public class OuterClass02 {
	//Field
	private String outer = "OuterClass �� Filed";

	//Constructor
	public OuterClass02(){}

	//Method
	public void outerMethod(){

		System.out.println(":: " +this.getClass().getName()+" start ..");

		final String localVariable = "OuterClass ���� outerMethod �� localVariable";

		//inner local Class
		class InnerLocalClass{
			//Field
			private String inner = "innerClass�� Field";

			//Constructor
			public InnerLocalClass(){}

			//Method
			public void innerMethod(){
				System.out.println(":: " +this.getClass().getName()+" start ..");
				//innerClass���� OuterClass�� �����ϱ�
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
