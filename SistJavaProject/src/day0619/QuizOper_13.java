package day0619;

import java.util.Scanner;

public class QuizOper_13 {

	public static void main(String[] args) {
		/*
		 * 이름입력
		 * 강호동
		 * 키 177.5
		 * 몸무게 
		 * 88
		 * 
		 * **학생 키 정보**
		 * 이름: 강호동
		 * 키: 177.5cm
		 * 몸무게: 88kg
		 * 
		 * 표준몸무게: (키-100)*0.9kg
		 * 권장 표준 몸무게는 69.75kg입니다 */
		
		 Scanner sc=new Scanner(System.in);
		 //변수
		 String name;
		 double weight,height,st_weight;
		 
		 //입력
		 System.out.println("이름");
		 name=sc.nextLine();
		 System.out.println("키");
		 height=sc.nextDouble();
		 System.out.println("몸무게");
		 weight=sc.nextDouble();
		 
		 //계산
		 st_weight=(height-100)*0.9;
		 
		 //출력
		 System.out.println("**학생신체정보**");
		 System.out.println("이름: "+name);
		 System.out.println("키: "+height+"cm");
		 System.out.println("몸무게: "+weight+"kg");
		 //System.out.println("권장 표준 몸무게는"+st_weight+"kg입니다");
		 System.out.printf("권장 표준 몸무게는 %.3f kg입니다",st_weight);
		 
		 
		 
		 
		

	}

}
