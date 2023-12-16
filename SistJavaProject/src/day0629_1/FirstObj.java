package day0629_1;

//이름,취미,취미에 지출
public class FirstObj {
	String name;
	String hobbit;
	//int hobpay;
	
	public FirstObj(String name,String hob) {
		this.name=name;
		this.hobbit=hob;
	}	
	public String getTxt()
	{
	return name+","+hobbit;
	}

}