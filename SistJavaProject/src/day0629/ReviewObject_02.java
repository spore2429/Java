package day0629;

class Starbucks{
	
	private String store; //지점
	private String menu; //메뉴
	private String goods; //굿즈
	
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	
}
////////////////////////////////////
class Mcdonalds {
	
	private String burger; //버거
	private int gagyuk; //가격
	private String happymeal; //해피밀
	
	public String getBurger() {
		return burger;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
	public int getGagyuk() {
		return gagyuk;
	}
	public void setGagyuk(int gagyuk) {
		this.gagyuk = gagyuk;
	}
	public String getHappymeal() {
		return happymeal;
	}
	public void setHappymeal(String happymeal) {
		this.happymeal = happymeal;
	}
	
	
}

/////////////////////////////////////
public class ReviewObject_02 {

	public static void main(String[] args) {
		
		//생성
		Starbucks s=new Starbucks();
		
		s.setStore("스타벅스 코엑스매장");
		String m=s.getStore();
		
		s.setMenu("아이스 아메리카노");
		String a=s.getMenu();
		
		s.setGoods("우산");
		String u=s.getGoods();
		
		Mcdonalds mc=new Mcdonalds();
		
		mc.setBurger("1955버거");
		String b=mc.getBurger();
		
		mc.setGagyuk(6000);
		int c=mc.getGagyuk();
		
		mc.setHappymeal("포켓몬완구");
		String d=mc.getHappymeal();
		
		//출력

		System.out.println("나는 "+m+"에 왔습니다");
		System.out.println(a+"를 주문합니다");
		System.out.println(u+"을 샀어요");
		System.out.println();
		System.out.println("나는 "+b+"를 먹습니다");
		System.out.println(c+"원을 결제합니다");
		System.out.println(d+"를 받았습니다");
	}

}
