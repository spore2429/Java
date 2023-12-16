package day0619;

public class OperTest_10 {

	public static void main(String[] args) {
		// 대입연산자 +=,-=,*=,/=,%=
		
		int a,b,c,d,e;
		a=b=c=d=e=10;
		
		a+=2; //a=a+2 <-a에 2를 더한값이 다시 a가된다.
		b-=3; //b에 3을 뺀값
		c*=3; //c에 3을 더한값
		d/=3; //d를 3으로 나눈값
		e%=3; //e를 3으로 나눈값의 나머지
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);

	}

}
