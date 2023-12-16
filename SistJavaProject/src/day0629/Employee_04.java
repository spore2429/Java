package day0629;

public class Employee_04 {
	String sawonName;
	int salary;
	
	//명시적생성자
	public Employee_04(String name,int sal) 
	{
	this.sawonName=name;
	this.salary=sal;
	}

	//리턴 메서드
	public String getEmp()
	{
		return sawonName+","+salary;
	}
}
