package day0627;

public class MemoryCnt_04 {

static int count=0;//static 증가 
	 
	//생성자
	public MemoryCnt_04() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemoryCnt_04 mem1=new MemoryCnt_04();
		MemoryCnt_04 mem2=new MemoryCnt_04();
		
		
	}

}
