package day0616;

public class OperTest_07 {

	public static void main(String[] args) {
		// 기본자료형_8개
		//1.논리형_true_fales
		boolean b=false;

		//2.문자형
		//반드시 하나의 문자 16비트 유니코드값 표현
		//자바에서 char 문자하나 2바이트 
		//기본적으로는 정수형,아스키코드
		char ch='A';
		
		//3.정수형
		byte a=127; //1바이트 -128~127 가능
		short s=32000; //16bit
		int c=6700000; //32bit
		long num=100L; //64bit,뒤에 L,l을 붙혀야 long
        
		//4.실수형
		double d=42356.14526; //64bit,소수점
		float f=1234567f; //32bit
		
		//int,float는 똑같이 32bit사용하지만 기본적으로 실수형이 정수형보다 큰타입으로 처리된다
        
		//출력
		System.out.println("bool="+b);
		System.out.println("not bool="+!b);
		System.out.println("ch="+ch); //65
		System.out.println("ch="+(ch+1)); //66
		System.out.println("ch="+(char)(ch+1)); //B
		System.out.println("d="+d); //정밀도 15자리
		System.out.println("f="+f); //정밀도 7자리
		//printf %f:실수
		//전체자리수 10자리 소수점2자리
		System.out.printf("d=%10.2f\n",d); 
		//소수점1자리
		System.out.println("d=%.2f");
		
	 
	}
}