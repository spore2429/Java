package day0629;

public class EmpName_04 {

	public static void main(String[] args) {
		// 최지우,2500000,기획경영부

		Manager_04 man=new Manager_04("최지우", 2500000, "기획경영부");

		System.out.println(man.getEmp());//재정의 된 메서드 호출

	}

}
