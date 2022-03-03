package h0304;


public class SubTest {
	//Field
	private String name;
	private String subject;
	private int score;
	private boolean pf;
	
	//Constructor	
	public SubTest() {
	}
	public SubTest(String name, String subject, int score, boolean pf) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
		this.pf = pf;
	}
	
	@Override
	public String toString() {
		return "["+name + ", " + subject + ", " + score + ", " + (pf ? "수료" : "미수료") + "]";
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public boolean isPf() {
		return pf;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPf(boolean pf) {
		this.pf = pf;
	}
	
	//method
	public void inputScoreList(String list) {
		name =list.split("/")[0];
		subject = list.split("/")[1];
		score = Integer.parseInt(list.split("/")[2]);
		
		if(list.split("/")[1].toUpperCase().equals("JAVA")) {
			if(Integer.parseInt(list.split("/")[2])>=80) {
				pf = true;
			}
		} else if(list.split("/")[1].toUpperCase().equals("SQL")) {
			if(Integer.parseInt(list.split("/")[2])>=90) {
				pf = true;
			}
		}		
	}
}
