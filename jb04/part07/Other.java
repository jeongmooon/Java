public class Other {
	//Field
	String name = "홍길동";
	String job = new String("개발자");

	Father owner = new Father();

	public Other(){
		System.out.println(this.owner.name);
		System.out.println(owner.bank);
		System.out.println(owner.branch);

		System.out.println("은행 비밀번호 : "+this.owner.getPasswrod);
	}
} //class
