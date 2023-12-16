package day0628;

class Student{
	
	private String sname;
	private String hp;
	private int grade;
	
	//명시적 생성자
	public Student(String sname,String hp,int grade) 
	{
		this.sname=sname;
		this.hp=hp;
		this.grade=grade;
	}
	
	//멤버값 출력데이타
	public void getData()
	{
		System.out.println("이름: "+sname);
		System.out.println("연락처: "+hp);
		System.out.println("학년: "+grade);
	}
}

//////////////////////////
public class ArrObject_09 {

	public static void main(String[] args) {
		
		//
		/*Student[]stu=new Student[3];
		
		stu[0]=new Student("이민규", "010-2222-5555", 3);
		stu[1]=new Student("최진평", "010-1111-5555", 1);
		stu[2]=new Student("진현규", "010-3333-5555", 4);
		
		//출력
		for(int i=0;i<stu.length;i++)
		{
			Student s=stu[i];
			s.getData();
			//stu[i].getData();
			System.out.println("--------------------");
			
		}*/
		//생성하면서 바로 초기화
		Student[]stu= 
				{
			new Student("이민규","010-2222-5555", 3),	
			new Student("최진평", "010-2222-4444", 1),
			new Student("진현규", "010-3333-4444", 4)
				};
		
		//출력2
		
		for(Student s:stu)
		{
			s.getData();
			System.out.println("--------------------");
			
		}
		
		
		
		
	}

}
