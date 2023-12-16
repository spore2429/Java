package day0622;

import java.util.Scanner;

public class QuizForWhile_08 {

	public static void quiz1() 
	{
		/*
		 나이를 반복해서 입력받는다
		 0이되면 빠져나와서 출력한다 
		 나이가 50이상일경우 a변수 증가
		 나이가 30이상일경우 b변수 증가
		 그나머지는 c변수 증가
		 
		 ==================
		 50세이상: 3명
		 30세이상: 2명
		 그 이외: 1명
		 */
		 
		 //생성 
		 Scanner sc=new Scanner(System.in);
		 int age;//나이
		 int a=0,b=0,c=0;
		 
		 while(true)
		 {
			 System.out.println("나이를 입력하세요(0누르면종료)");
			 age=sc.nextInt();
			 //break
			 if(age==0) {
					break;		
			 }
			 //조건
			 if(age>=50) 
				 a++;
	
			 else if(age>=30&&age<=49)
				 b++;
			 else 
				 c++;
			 
		 }
		 System.out.println("===============");
		 System.out.println("50세이상 :"+a+"명");
		 System.out.println("30세이상~49세이하 :"+b+"명");
		 System.out.println("그 이외 :"+c+"명");
			 
			
		 
		 
	} 
	
	
	
	public static void quiz2() 
	{
	 //총 10개의 다양한 숫자(양수,음수)를 입력받아 양수,음수의 갯수를 각각 구하시오.
		/*1: 45
		  2:-23
		  3:0
		  
		  ========
		  양수개수: 6
		  음수갯수: 3
		  * */
		Scanner sc=new Scanner(System.in);
		
		int a=0,b=0;//양수갯수,음수갯수
		int su=0;//입력할수
		
		for(int i=1;i<=10;i++)//입력가능한 숫자의개수
		{
			System.out.println(i+": ");
			su=sc.nextInt();
			//양수
			if(su>0) 
				a++;
			//음수
			else if(su<0) 
				b++;
				
		}
		System.out.println("==============");
		System.out.println("양수개수: "+a);
		System.out.println("음수개수: "+b);
		
	}
	
	
	public static void main(String[] args) {
		//quiz1();
		quiz2();

		
	}

}
