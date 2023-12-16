package day0628;

class Test2{
	
	int n=0;//인스턴스 변수는 공용을 하더라도 각각의 변수이기때문에 증가x
	static int cnt=0;//공용 증가o
	
    public Test2() {
		System.out.println("생성자호출");
		n++;
		cnt++;
    }
    
    public void wirte()
    {
    	System.out.println("cnt= "+cnt+"\tn="+n);
    }
}
//////////////////////////
public class VarTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t1=new Test2();
		t1.wirte();
		
		Test2 t2=new Test2();
		t2.wirte();
		
		Test2 t3=new Test2();
		t3.wirte();
	}

}
