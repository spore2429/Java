package day0630;

class Market{
	private String sangpum;
	private int su;

	public Market() {
		sangpum="딸기";
		su=5;

	}

	public Market(String sangpum,int su) {
		this.sangpum=sangpum;
		this.su=su;
	}

	public void getMarket() {
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su);
	}
}

//////////////////////////////////////////////
class MyMarket extends Market{

	private int price;
	public MyMarket() {
		//super() //디폴트슈퍼
		price=5000;
	}

	public MyMarket(String sangpum,int su,int price) {
		super(sangpum,su);
		this.price=price;
	}

	@Override
	public void getMarket() {
		
		super.getMarket();
		System.out.println("단가: "+price);//위치상관x
	}

}
public class ReviewInheri_01 {

	public static void main(String[] args) {
		
		//디폴트생성자
		MyMarket m1=new MyMarket();
		m1.getMarket();
		System.out.println();
		
		//명시적생성자
		MyMarket m2=new MyMarket("오렌지", 5, 900);
		m2.getMarket();
		
		//다형성생성자
		System.out.println();
		MyMarket mk=null;
        mk=new MyMarket();
		mk.getMarket();
		
		
	
	}

}
