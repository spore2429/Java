package day0628;

class Member{
	
	private String stuName;//학생명
	private String gender;//성별
	private String addr;//주소
	
	static String ban="쌍용7자바";//학교
	static int cnt=0;//학생수
	
	
	//수정용 메서드
	public void setMembers(String name,String gd,String addr)
	{
		this.stuName=name;
		this.gender=gd;
		this.addr=addr;
	}
	
	//출력용 메서드
	public void getMembers()
	{
		cnt++;
		
		System.out.println("***학생"+cnt+"정보***");
		System.out.println("학생명: "+this.stuName);
		System.out.println("소속학급: "+ban);//같은클래스라 멤버생략가능
		System.out.println("성별: "+this.gender);
		System.out.println("주소: "+this.addr);
		System.out.println("==============");
		
		
	}
	
}

////////////////////////////////////////////
public class ExObject_06 {

	public static void main(String[] args) {
	
    //Member.ban="쌍용7자바";
    Member m1=new Member();
    Member m2=new Member();
    
    m1.setMembers("최성현", "남자", "서울시 강동구");
    m2.setMembers("장신영", "여자", "인천시");
    
    m1.getMembers();
    m2.getMembers();
	
	}

}
