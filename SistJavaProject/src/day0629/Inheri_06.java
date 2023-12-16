package day0629;

class Shop{
	
	String sangpum;
	int su;
	
	public Shop(String sang,int su) {
		this.sangpum=sang;
		this.su=su;
	}
	
	public void writeShop()
	{
		System.out.println("상품명: "+sangpum);
		System.out.println("개수: "+su);
	}
}
////////////////////////
class MyCart extends Shop{
	
	int price;
	public MyCart(String sang, int su,int price) {
		super(sang, su);
		this.price=price;
	}

	//오버라이딩
	@Override
	public void writeShop() {
		System.out.println("단가: "+price);
		super.writeShop();
	}
}
////////////////////////////////////
public class Inheri_06 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		MyCart mc=new MyCart("아이폰14", 2, 1200000);
		mc.writeShop();
	}

}
