package day0627;

public class QuizMain_09 {

	public static void main(String[] args) {
		
		
		System.out.println("\t[쇼핑목록]\n");
		System.out.println("쇼핑장소: "+Emart.addr+"\n");
		//객체생성
		Emart e1=new Emart();
		Emart e2=new Emart();
		Emart e3=new Emart();
		
		//set메서드
		e1.setList("손선풍기");
		e1.setPrice(25000);
		
		e2.setList("핸드폰충전기");
		e2.setPrice(30000);
		
		e3.setList("이어폰");
		e3.setPrice(70000);
		
		//get메서드
		String list=e1.getList();
		int price=e1.getPrice();
		
		//출력
		System.out.println("상품명: "+e1.getList()+"\n상품가격: "+e1.getPrice()+"원");
		System.out.println("==============");
		System.out.println("상품명: "+e2.getList()+"\n상품가격: "+e2.getPrice()+"원");
		System.out.println("==============");
		System.out.println("상품명: "+e3.getList()+"\n상품가격: "+e3.getPrice()+"원");

	}

}
