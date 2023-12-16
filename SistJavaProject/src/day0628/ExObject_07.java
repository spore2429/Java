package day0628;

class Score{
	
	private String stuName;
	private int java;
	private int oracle;
	private int html;
	
	static final String TITLE="중간고사 시험결과";

	//자동 setter,getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	
	//합침 set
	public void setData(String stuName,int java,int oracle,int html)
	{
	this.stuName=stuName;
	this.java=java;
	this.oracle=oracle;
	this.html=html;
	}
	
	//합침 get
	public void getData()
	{
		System.out.println();
		System.out.println("<<<방법2>>>");
		System.out.println("***중간고사 시험결과***");
		System.out.println();
		System.out.println("학생명: "+stuName+"\n자바점수: "+java+"\n오라클점수: "+oracle+"\nHTMl점수: "+html);
	    System.out.println("===========");
	}
	
	//합계메서드
	public int getTot()
	{
		int t=java+oracle+html;
		return t;
	}
	
	
	//평균메서드
	public double getAvg()
	{
		double a=getTot()/3.0;
		return a;
		//return getTot()/3.0;
	}
}

////////////////////////////////////
public class ExObject_07 {

	public static void main(String[] args) {
		
		
		
		
		//생성1
		Score s1=new Score();
		Score s2=new Score();
		
		
		s1.setStuName("김지윤");
		s1.setJava(99);
		s1.setOracle(88);
		s1.setHtml(56);
		
		s2.setStuName("김동현");
		s2.setJava(79);
		s2.setOracle(68);
		s2.setHtml(76);
		
		System.out.println("***중간고사 시험결과***");
		System.out.println();
		System.out.println("학생명: "+s1.getStuName()+"\n자바점수: "+s1.getJava()
		+"\n오라클점수: "+s1.getOracle()+"\nHTML점수: "+s1.getHtml());
		System.out.printf("총점수: "+s1.getTot());
		System.out.printf("평균: "+s1.getAvg());
		System.out.println("============");
		System.out.println("학생명: "+s2.getStuName()+"\n자바점수: "+s2.getJava()
		+"\n오라클점수: "+s2.getOracle()+"\nHTML점수: "+s2.getHtml());
		System.out.printf("총점수: "+s2.getTot());
		System.out.printf("평균: "+s2.getAvg());
		//생성2
		Score sc1=new Score();
		sc1.setData("김영환", 85, 77, 66);
		sc1.getData();
	}

}
