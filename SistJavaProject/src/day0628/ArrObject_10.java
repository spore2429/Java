package day0628;

class MyPersonInfo{
	
	private String name;
	private String blood;
	private int age;
	
	public MyPersonInfo(String name,String blood,int age) {
		this.name=name;
		this.blood=blood;
		this.age=age;	
	}
	
	//제목
	public static void title()
	{
		System.out.println("이름\t혈액형\t나이");
		System.out.println("-----------------------");
	}
     
	//출력문
	public void getInfo()
	{
		System.out.println(name+"\t"+blood+"형\t"+age+"세");
	}









}


//////////////////////////////////
public class ArrObject_10 {

	public static void main(String[] args) {
		 //생성 초기화
	    MyPersonInfo[]my=
		{
			new MyPersonInfo("김모씨", "A", 25),
			new MyPersonInfo("이모씨", "B", 24),
			new MyPersonInfo("전모씨", "O", 27)
	    };
	    
	    System.out.println("총 "+my.length+"명의 정보 출력");
	    MyPersonInfo.title();

		    //출력
	  		for(MyPersonInfo info:my)
	  		
	  			info.getInfo();
	  			System.out.println("--------------------");
	  		
	  			MyPersonInfo.title();
	    
	     //출력2
		for(int i=0;i<my.length;i++)
		{
			/*MyPersonInfo m=my[i];
			m.getInfo();*/
			
			my[i].getInfo();
		}
		
		
	
	}

}
