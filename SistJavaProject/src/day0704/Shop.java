package day0704;

public class Shop {

	private String sangName; //상품명
	private int su; //수량
	private int dan; //단가
	
	//생성자
	public Shop(String sang,int su,int dan) {
		
		this.sangName=sang;
		this.su=su;
		this.dan=dan;
	}
	
	//setter,getter
	public String getSangName() {
		return sangName;
	}
	public void setSangName(String sangName) {
		this.sangName = sangName;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
}
