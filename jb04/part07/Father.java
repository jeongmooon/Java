public class Father {
	//Field
	public String name = "ȫ�浿";
	protected String bank = "�Ѿ�����";
	String branch = "���ﵿ����";
	private int password = 1234;

	//Constructor
	public Father(){
	}

	//Method

	public String getBank(int pwd){
		if(pwd != 7777){
			return "key���� ��Ȯ�� �Է��ϼ���";
		} else {
			return this.bank;
		}
	}

	public int getPassword(int key){
		return 0;
	} else {
		return this.password;
	}

	public String getName(){
		return name;
	}

	public String getBranch(){
		return branch;
	}

}// class
