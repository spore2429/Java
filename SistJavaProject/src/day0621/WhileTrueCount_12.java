package day0621;

import java.util.Scanner;

public class WhileTrueCount_12 {

	public static void main(String[] args) {
		/*
		 임의의 수를 입력해서 합계,평균,갯수
		 단 0을 입력하면 while문을 빠져나가게 하자
		 */
		Scanner sc=new Scanner(System.in);
		int su=0; //입력할수
		int sum=0; //합계
		int cnt=0; //갯수
		double avg=0; //평균
		//while
		while(true)
		{
			System.out.println("숫자입력(종료:0)");
			su=sc.nextInt();
			
			if(su==0)
				break;
			
			sum+=su; //합계까지만 가능
			cnt++;
			
		}
        //계산(while문 밖에서)
		avg=(double)sum/cnt; 
		//출력
		System.out.println("합계 : "+sum);
		System.out.printf("평균: %.2f",avg);
		System.out.println("\n합계: "+cnt); //0이 포함되면 cnt-1
	
		
				
	}

}
