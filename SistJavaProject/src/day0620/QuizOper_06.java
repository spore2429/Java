package day0620;

import java.util.Scanner;

public class QuizOper_06 {

	public static void main(String[] args) {
		/*
		 이름을 입력하세요
		 강민호
		 3과목의 점수를 입력하세요
		 39
		 88
		 99
		 ========================
		 3과목점수:39,88,99
		 평균:75.3333333
		 --------------------------------
		**** 합격조건:평균이 70점 이상이고, 각과목이 40점이상이면 합격****
		 --------------------------------
		 강민호님은 불합격입니다
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String name,result;
		int A,B,C,tot;
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("3과목의 점수를 입력하세요");
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		
		//계산
		tot=A+B+C;
		double avg=tot/3.0;
		
		//
		if(avg>=70 && A>=40 && B>=40 && C>=40)
			result="합격";
		else
			result="불합격";
		
		System.out.println("====================================================");
		System.out.println("총점수: "+tot);
		System.out.printf("평균: %.3f ",avg);
		System.out.println("\n----------------------------------------------------");
		System.out.println("**** 합격조건:평균이 70점 이상이고, 각과목이 40점이상이면 합격****");
		System.out.println("----------------------------------------------------");
		System.out.println(name+"님은"+result+"입니다");
		
			
		
		
		
		
		
		

	}

}
