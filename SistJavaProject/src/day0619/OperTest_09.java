package day0619;

public class OperTest_09 {

	public static void main(String[] args) {
		// 비교(관계)연산자: >,>=,<,<=,==,!=
		//논리연산자: &&(and),||(or),!(not)
		
		//결과값을 true,false출력
		int a=5,b=3,c=5;
		
		System.out.println(a>b); //t
		System.out.println(a==b); //f
		System.out.println(!(a==b)); //t
		System.out.println(a!=b); //t    !<-a는b와같지않다
		
		System.out.println(a>b&&b>c); //f 모두(and)
		System.out.println(a>b||b<c); //t 하나만(or)
		System.out.println(!(a>b)); //f
		
	}

}
