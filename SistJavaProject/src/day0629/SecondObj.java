package day0629;

import day0629_1.FirstObj;

public class SecondObj extends FirstObj {

	int hobpay;//지출돈
	public SecondObj(String name, String hob,int hobpay) {
		super(name, hob);
		this.hobpay=hobpay;
	}

	@Override
	public String getTxt() {
		return super.getTxt()+","+hobpay;
	}
	
		
	


}

