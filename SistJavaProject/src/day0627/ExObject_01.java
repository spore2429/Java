package day0627;

public class ExObject_01 {

    String name; //인스턴스변수..일반인스턴스 멤버변수는 객체생성후 각각 다른값을 가질수있다
    static final String MESSAGE="Happy Day!!!"; 
	//static 멤버변수는 주로 상수로 선언할때 사용하며 인스턴스변수없이 클래스명으로 접근가능하다
	//여러객체가 같은값을 가져야 할경우 주로 static으로 선언한다
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("static변수는 new로 생성없이 호출가능");
		System.out.println(ExObject_01.MESSAGE);
		System.out.println(MESSAGE);
		//MESSAGE="Nice Day!!!"; final이라서 값변경 안됨
		
		//클래스명 참조변수명=new 클래스명();
		ExObject_01 ex1=new ExObject_01();
		System.out.println(ex1.name);
		
		ex1.name="김철수";
		System.out.println(ex1.name);
		
		ExObject_01 ex2=new ExObject_01();
		ex2.name="홍길동";
		System.out.println(ex2.name);
		
		ExObject_01 ex3=new ExObject_01();
		ex3.name="ㅇㅇ";
		System.out.println(ex3.name);
		
		System.out.println("다같이 사용하는 메세지: "+MESSAGE);
		
		

	}

}
