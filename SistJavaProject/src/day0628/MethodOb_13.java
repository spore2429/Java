package day0628;

public class MethodOb_13 {
	
	public static void hello(int age,double height) {
		
		System.out.println("안녕");
		System.out.println("제 나이는 "+age+"세 입니다");
		System.out.println("저의키는 "+height+"cm 입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메서드 연습시작!!!");
		hello(33, 173.8);

		goodbye();
		hello(22, 165.3);
	}

	public static void goodbye() {
		System.out.println("담에 뵈요~~~~~");
	}
}
