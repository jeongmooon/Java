package h0228.test;
import h0228.CellPhone;
import h0228.SmartPhone;

public class Prob {

	public static void main(String[] args) {

		//��ȭ��ȣ feePerCallTime�� �ʱ�ȭ�ϴ� ������ ȣ�� �ν��Ͻ� ����
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		//�����ȭ��ȣ�� ��ȭ�ð��� ���ڷ� �����ϴ� call MEthod ȣ��
		cellPhone.call("010-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.callculateTotalfee();
		System.out.println(cellPhone.getPhoneNumber()+"�� ��ȭ �ð��� "+
							cellPhone.getTotalCallTime()+" �̸� \n"+
							"�ܰ� "+cellPhone.getFeePerCallTime()+
							" �� ����� "+cellPhone.getTotalFee()+"�� �Դϴ�");
		
		System.out.println("===========================================");
		
		//��ȭ��ȣ feePerCallTime�� �ʱ�ȭ�ϴ� ������ ȣ�� �ν��Ͻ� ����
		SmartPhone smartPhone = new SmartPhone("010-010-010",200);
		//�����ȭ��ȣ�� ��ȭ�ð��� ���ڷ� �����ϴ� call MEthod ȣ��
		smartPhone.call("010-017-017",10);
		smartPhone.callculateTotalfee();
		System.out.println(smartPhone.getPhoneNumber()+"�� ��ȭ �ð��� "+
							smartPhone.getTotalCallTime()+" �̸� \n"+
							"�ܰ� "+smartPhone.getFeePerCallTime()+
							" �� ����� "+smartPhone.getTotalFee()+"�� �Դϴ�");
		
		System.out.println("===========================================");

		//��ȭ��ȣ feePerCallTime�� �ʱ�ȭ�ϴ� ������ ȣ�� �ν��Ͻ� ����
		SmartPhone smartPhone01 = new SmartPhone("111-111-111",0, true, 3000);
		//�����ȭ��ȣ�� ��ȭ�ð��� ���ڷ� �����ϴ� call MEthod ȣ��
		smartPhone01.call("010-017-017",10);
		smartPhone01.call("016-016-016",10);
		smartPhone01.callculateTotalfee();
		System.out.println(smartPhone01.getPhoneNumber()+"�� ��ȭ �ð��� "+
							smartPhone01.getTotalCallTime()+" �̸� \n"+
							"�ܰ� "+smartPhone01.getFeePerCallTime()+
							" �� ����� "+smartPhone01.getTotalFee()+"�� �Դϴ�");
		
		System.out.println("===========================================");
	}

}
