package day0629;

class Work{
	
	public void process() 
	{
		System.out.println("작업중!!!!");
	}
	
}
////////////////////////////////////////////
class Food1 extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***음식을 합니다***");
	}
}
///////////////////////////////////////////
class Clean extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***청소를 합니다***");
	}
}
///////////////////////////////////////////
class Study extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***공부를 합니다***");
	}
}
////////////////////////////////////////////
public class Inheri_09 {

	public static void main(String[] args) {
		//일반적인 생성..메서드 호출
		System.out.println("==메서드 호출==\n");
		Food1 food1=new Food1();
		Clean clean=new Clean();
		Study study=new Study();
		
		food1.process();
		clean.process();
		study.process();
		
		//다형성..하나의 변수로 호출시 누가생성되었느냐에따라 그기능이 달라짐
		System.out.println("\n==다형성 출력중==\n");
		Work work=null;
		
		work=new Food1();
		work.process();
		
		work=new Clean();
		work.process();
		
		work=new Study();
		work.process();

	}

}
