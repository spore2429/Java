package day0621;

import java.util.Scanner;

public class Pratice_20 {

	public static void main(String[] args) {
		  
		
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		String hello;
		int sum=0,cnt=0;
		double avg;
		
		//while
		while(true)
		{
		System.out.println("점수입력(h종료)");
		hello=sc.nextLine();
		
		//종료
		//if(score.equals("q") || score.equals("Q"))
		//if(score.equalsIgnoreCase("q"))	
		if(hello.charAt(0)=='h')
			break;
		
		cnt++;
		sum+=Integer.parseInt(hello);//점수로 변환후 합계변수에 누적
		
		}
		//계산	
		avg=(double)sum/cnt;
		//출력
		System.out.println("총갯수: "+cnt);
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.1f ",avg);
			
		
		
	}

}
