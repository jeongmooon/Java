package shop.service.user;

public class Client {
	//Field
	private String name;
	String hp;
	protected String jb;
	public boolean gender;
	public static final String nationality = "¥Î«—πŒ±π";

	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String name, String hp, String jb, boolean gender) {
		super();
		this.name = name;
		this.hp = hp;
		this.jb = jb;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getJb() {
		return jb;
	}

	public void setJb(String jb) {
		this.jb = jb;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", hp=" + hp + ", jb=" + jb + ", gender=" + gender + "]";
	}
	
}
