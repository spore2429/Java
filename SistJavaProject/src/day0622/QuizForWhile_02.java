package day0622;

import java.util.Scanner;

public class QuizForWhile_02 {

	public static void quiz1()
	{
		//점수를 입력하면 합계를 구하시오 //갯수와 평균구하는게 아니므로 갯수,증감x
		//1~100 이 아니면 제외(continue)
		//0을 입력하면 프로그램 종료
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int score; //입력할점수
		int sum=0;//합계
		
		
		while(true)
		{
			System.out.println("점수를 입력하세요");
			score=sc.nextInt();
			
			if(score==0) {
				System.out.println("종료합니다");
				break;
			}
				
				
			
				//점수 잘못쓰면 끝나는게 아니고 다시 반복 쓸수있게	
			if(score<1 || score>100)
				continue;
			
			sum+=score;
				
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
		String score;//점수
		int sum=0,cnt=0;//합계,갯수
		double avg;//평균


		while(true)
		{
			//입력
			System.out.println("점수를 입력하세요");
			score=sc.nextLine();

			//if(score.charAt(0)=='끝')
			if(score.equals("끝"))
				break;

			//continue
			if(Integer.parseInt(score)<1 || Integer.parseInt(score)>100)
				continue;

			sum+=Integer.parseInt(score);
			cnt++;

		}
		
		
		//계산
		avg=(double)sum/cnt;

		//출력
		System.out.println("합계: "+sum);
		System.out.printf("평균:%.2f ",avg);
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
		int sum=0; //합계
		int su;//입력값

		for(int cnt=1;cnt<=5;cnt++)
		{	System.out.print(cnt+"번 점수:" );
		    su=sc.nextInt();


		if(su<1 || su>100)
		{
			System.out.println("\t잘못입력했어요");
			cnt--;
			continue;
		}
		sum+=su;
		}

		System.out.println("==================");
		System.out.println("총점: "+sum);
	}
		
	   
		
		
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		quiz1();
		//quiz2();
		//quiz3();

	}

}
