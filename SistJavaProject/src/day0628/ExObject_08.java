package day0628;

class Apple{
	private String writer;
	private String subject;
	private static String msg="HappyDay!!";
	
	//각각의 setter,getter
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMsg() {
		return msg;
	}
	public static void setMsg(String msg) {
		Apple.msg = msg;
	}
	
}
////////////////////////////////////////////
public class ExObject_08 {

	public static void writeApple(Apple apl)
	{
		System.out.println("***Apple클래스 출력***");
		
		System.out.println("작성자: "+apl.getWriter());
		System.out.println("제목: "+apl.getSubject());
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Apple클래스의 메세지 출력");
		System.out.println(Apple.getMsg());
		
		Apple a1=new Apple();
		a1.setWriter("김은희");
		a1.setSubject("악귀 재밌더라구요");
		
		Apple a2=new Apple();
		a2.setWriter("김동수");
		a2.setSubject("초보 개발자의 하루");
		
		//writeApple 호출
		writeApple(a1); //ExObject_08에서 출력
		writeApple(a2);
		
	}

}
