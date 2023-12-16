package day0627;

public class QuizMain_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**상품입고**");
		System.out.println("===========================");
		System.out.println("입고된 상점: "+Quiz_10.SHOPNAME);
		System.out.println("===========================");
		//1.객체생성
		Quiz_10 q1=new Quiz_10();//상품명
		Quiz_10 q2=new Quiz_10();
		Quiz_10 q3=new Quiz_10();

		//딸기
		q1.dan=10000;
		q1.su=5;
		//초코파이
		q2.dan=5000;
		q2.su=10;
		//요거트
		q3.dan=2500;
		q3.su=100;
		
		//3.set
		q1.setSangPum("딸기");
		q2.setSangPum("초코파이");
		q3.setSangPum("요거트");
		
		//4.get
		String sangpum=q1.getSangPum();
		
		//5.출력
		System.out.println("상품명: "+q1.getSangPum()+"\n가격: "+q1.dan+"원"+"\n수량: "+q1.su+"팩");
		System.out.println("===========================");
		System.out.println("상품명: "+q2.getSangPum()+"\n가격: "+q2.dan+"원"+"\n수량: "+q2.su+"상자");
		System.out.println("===========================");
		System.out.println("상품명: "+q3.getSangPum()+"\n가격: "+q3.dan+"원"+"\n수량: "+q3.su+"팩");
	}

}
