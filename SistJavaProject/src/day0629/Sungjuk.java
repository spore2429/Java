package day0629;

/*
학생명 Java Oracle [총점 평균 평가]
 * */

public class Sungjuk {

	static String schoolName="쌍용교육원";
	private String name; //학생명
	private int Java,Oracle; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return Java;
	}
	public void setJava(int java) {
		Java = java;
	}
	public int getOracle() {
		return Oracle;
	}
	public void setOracle(int oracle) {
		Oracle = oracle;
	}
	
	//합계
	
	public int getTot()
	{
		return Java+Oracle;
	}
	
	//평균
	
	public double getAvg()
	{
		return getTot()/2.0;
	}
	
	//평가
	
	public String getPyungga()
	{
		if(getAvg()>=60)
			return "합격";
		else
			return "불합격";
	}
	
	
}

