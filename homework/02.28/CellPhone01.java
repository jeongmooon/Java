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
					throw new IllegalArgumentException("잔여 배터리 없음");
				}
				battery -= time*0.5;		
				if(battery<0) {	
					battery =0;
				}
				System.out.println("통화 시간 : "+time);
			} else {
				throw new IllegalArgumentException("통화시간 입력 오류");
			}
		} catch(IllegalArgumentException e) {
			
			//e.printStackTrace();
			if(e.getMessage().equals("잔여 배터리 없음")) {
				System.out.println("잔여 배터리 없음 충전하세요");
				return;
			}
			if(e.getMessage().equals("통화시간 입력 오류")) {
				System.out.println("통화시간 입력 오류");
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
				throw new IllegalArgumentException("충전시간 입력 오류");			
			}
			
			System.out.println("충전 시간 : "+time);
			
		} catch(IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println("충전시간 입력 오류");
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
}
