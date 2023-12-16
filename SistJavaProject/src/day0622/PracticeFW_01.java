package day0622;

import java.util.Scanner;

public class PracticeFW_01 {

	public static void quiz1()
	{
		//점수를 입력하면 합계를 구하시오 
		//1~100 이 아니면 제외(continue)
		//0을 입력하면 프로그램 종료
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int su;
		int sum=0;
		
		while(true)
		{
			//입력
			System.out.println("점수를 입력하세요");
			su=sc.nextInt();
			
			if(su==0) 
				break;
			
			if(su<1||su>100) 
				continue;
				sum+=su;
				
				
		}
		System.out.println("합계: "+sum);
		
	}
	
	
	public static void quiz2()
	{
		//점수를 반복해서 입력하면 합계,평균을 구하시오
		//끝이라고 입력시 프로그램 종료
		
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int sum=0,cnt=0;//합계,총갯수
		String score;//입력할수
		double avg;//평균
		
		while(true)
		{
			System.out.println("점수를 입력하세요");
			score=sc.nextLine();
			
			if(score.equals("끝")) 
					break;
			
			if(Integer.parseInt(score)<1||Integer.parseInt(score)>100) 
            continue;
			cnt++;
			sum+=Integer.parseInt(score);
			
		}
		
		//계산
		avg=(double)sum/cnt;
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.2f",avg);
		
		
		
	}
	
	
	public static void quiz3()
	{
		/*
		 총 5개의 점수를 입력받아 합계를 구하시오
		 만약 1~100점이 아닐경우 다시 입력받아라 (continue)
		 
		 1번점수:88
		 2번점수:99
		 3번점수:200 잘못입력햇어요
		 4번점수:
		 */
		
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int su; //입력할수
		int sum=0;//합계
		int cnt=1;//횟수
		
		for(;cnt<=5;cnt++)
		{
			System.out.println(cnt+"번 점수");
			su=sc.nextInt();
			
			if(su<1||su>100) {
			System.out.println("\t잘못입력하였습니다");
			cnt--;	
			continue;
			
			}	
				sum+=su;			
		}
		System.out.println("합계: "+sum);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// quiz1();
			//quiz2();
			quiz3();
	
	}
    
}
