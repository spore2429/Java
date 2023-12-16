package day0619;

import java.util.Calendar;
import java.util.Scanner;

public class MyAge_05 {

	public static void main(String[] args) {
		/* 당신의 이름은? 김민희
		 * 당신의 출생년도는? 1997년
		 * =========================
		 * 이름:김민희
		 * 현재년도: 2023년
		 * 나이:26세 */
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		String name;
		int mybirth;
		//int age;
		//출력
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
		System.out.println("당신의 출생년도는?");
		mybirth=sc.nextInt();
		//생성
		Calendar cal=Calendar.getInstance();
		//변수
		int curyear=cal.get(cal.YEAR);
		int myage=curyear-mybirth;
		//출력
		System.out.println("===================");
		System.out.println("이름: "+name);
		System.out.println("현재년도: "+curyear+"년");
		System.out.println("나이: "+myage+"세");
		
		

	}

}
