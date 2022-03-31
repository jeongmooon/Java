package spring.service.dice.impl;

import java.util.Random;

public class DiceBImpl {
	private int value;
	
	public DiceBImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("::"+getClass().getName()+" »ý¼ºÀÚ....");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void selectedNumber() {
		value = new Random().nextInt(6)+1;
	}

}
