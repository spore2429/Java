package day0627;

public class ExMain_02 {

	public static void main(String[] args) {
		
		System.out.println(ExObject_02.width);
		System.out.println(ExObject_02.height);
		
		//클래스변수
		ExObject_02.width=10;
		ExObject_02.height=20;
		
		System.out.println(ExObject_02.width);
		System.out.println(ExObject_02.height);
		
		//인스턴스 생성후 변수 호출가능
		ExObject_02 card1=new ExObject_02();
		
		System.out.println(card1.kind);//null
		System.out.println(card1.number);//0
		
		card1.kind="Heart";
		card1.number=4;
		
		System.out.println(card1.kind);
		System.out.println(card1.number);
		
		
		//인스턴스 변수 생성후 변경후 출력
		ExObject_02 card2=new ExObject_02();
		
		card2.kind="Clover";
		card2.number=7;
		
		System.out.println(card2.kind);
		System.out.println(card2.number);

	}

}
