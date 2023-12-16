package day0627;

class ConstA{
	
	int num=0;
	
	
	//디폴트생성자...명시적인 생성자를 만들면 디폴트 생성자는 자동생성되지않는다
	//필요하면 만들어준다
	public ConstA() {
		num=10;
		System.out.println("디폴트 생성자");
	}
	
	//인자있는생성자
	public ConstA(int num) {
		this.num=num;
		System.out.println("생성자 호출");
	}	
		
	//메서드
	public int getNumber() {
		
		num=50;
		return num;
	}




}


///////////////////////////
public class ConstTest_05 {

	public static void main(String[] args) {
		
		//명시적생성자(인자값으로 num을 보낸 생성자)
		ConstA ca1=new ConstA(100030);//값수정가능
		System.out.println(ca1.num);
		
		//디폴트생성자 
		ConstA ca2=new ConstA();
		System.out.println(ca2.num);
		
		//메서드호출
		ConstA ca3=new ConstA();
		//ca3.num=10000;
		System.out.println(ca3.getNumber());
	}

}
