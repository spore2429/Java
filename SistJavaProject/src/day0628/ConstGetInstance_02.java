package day0628;

class Test{
	
	public Test() {
		System.out.println("디폴트 생성자");
	}

	//생성자 대신 인스턴스를 반환해주는 메서드
	public static Test getInstance()
	{
		return new Test();//생성자명 반환
	}

	//일반메서드
	public void writeMessage()
	{
		System.out.println("안녕??");
	}

}
////////////////////////////////////////////
public class ConstGetInstance_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
		t1.writeMessage();
		////////////////////////////////////
		Test t2=Test.getInstance();
		t2.writeMessage();
		
	}

}
