package day0621;

import java.util.Scanner;

public class Practice_21 {

	public static void main(String[] args) {
		/*
		 점수를 반복해서 입력하다가 q나 Q를 입력하면
		 while문을 빠져나온뒤 총갯수,총점,평균을 출력하시오\
		 평균은 소숫점1자리
		 */
		
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int cnt=0,sum=0;
		double avg;
		String score;
		
		//while
		while(true)
		{
	    //입력
		System.out.println("점수입력(q or Q 종료)");
		score=sc.nextLine();
			
	    if(score.charAt(0)=='q'||score.charAt(0)=='Q')
				break;
			
		cnt++;
		sum+=Integer.parseInt(score);
					
		}
         //계산
	     avg=(double)sum/cnt;
		 //출력
         System.out.println("총갯수: "+cnt);
         System.out.println("총점수: "+sum);
         System.out.printf("평균점수: %.1f",avg);
		
		
		
		
	}

}
