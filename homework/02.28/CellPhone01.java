package h0228;

public class CellPhone01 {
	//Field
	private String model;
	private double battery;
	
	//Constructor
	public CellPhone01() {
	}
	public CellPhone01(String model) {
		this.model = model;
	}
	
	//exception
	//getter
	public String getModel() {
		return model;
	}
	public double getBattery() {
		return battery;
	}
	
	//setter
	public void setModel(String model) {
		this.model = model;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	
	//method
	public boolean equals(CellPhone01 phoneModel) {
		
		if(phoneModel instanceof CellPhone01) {
			
			if(model == phoneModel.getModel()) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
		
		
	}
	
	public void call(int time) throws IllegalArgumentException {
		try {
			if(time>0) {
				if(battery<1) {
					throw new IllegalArgumentException("�ܿ� ���͸� ����");
				}
				battery -= time*0.5;		
				if(battery<0) {	
					battery =0;
				}
				System.out.println("��ȭ �ð� : "+time);
			} else {
				throw new IllegalArgumentException("��ȭ�ð� �Է� ����");
			}
		} catch(IllegalArgumentException e) {
			
			//e.printStackTrace();
			if(e.getMessage().equals("�ܿ� ���͸� ����")) {
				System.out.println("�ܿ� ���͸� ���� �����ϼ���");
				return;
			}
			if(e.getMessage().equals("��ȭ�ð� �Է� ����")) {
				System.out.println("��ȭ�ð� �Է� ����");
				return;
			}
		}
	}
	
	public void charge(int time) throws IllegalArgumentException {
		try {
			if(time > 0) {
				battery += time*3;				
				if(battery>100) {
					battery = 100;
				}
			} else {
				throw new IllegalArgumentException("�����ð� �Է� ����");			
			}
			
			System.out.println("���� �ð� : "+time);
			
		} catch(IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println("�����ð� �Է� ����");
		}
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
}
