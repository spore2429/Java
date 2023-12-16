package day0630;

interface InterAA{
	
	public void eat();
	public void go();
}
///////////////////////////////////////////
interface InterBB extends InterAA{
	
	public void ride();
}
///////////////////////////////////////////
class InterImpl2 implements InterBB{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("저녁을 먹어요");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("롯데월드를 가요");
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("자전거 타고 놀아요");
	}
	
	
}
////////////////////////////////////////////
public class InterExtends_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//일반적인 생성자
		InterImpl2 i2=new InterImpl2();
		i2.eat();
		i2.go();
		i2.ride();
		System.out.println();
		//다형성
		InterAA aa=new InterImpl2();
		aa.eat();
		aa.go();
		System.out.println();
		InterBB bb=new InterImpl2();
		bb.eat();
		bb.go();
		bb.ride();
		
	}

}
