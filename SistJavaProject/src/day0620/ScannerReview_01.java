package day0620;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerReview_01 {

	public static void main(String[] args) {
		/* 
		 * 태어난연도:1997
		 * 이름:홍길동
		 * 핸드폰번호:010-1234-5678
		 * 주소:서울시 동작구
		 * =========================
		 *       [개인정보]
		 * 이름:홍길동
		 * 나이:26세
		 * 연락처:010-1234-5678
		 * 주소:서울시 동작구
		 */
		
		 //생성
		 Scanner sc=new Scanner(System.in);
		 //변수
		 int myYear,age;
		 String name,add,hp;
		 //입력
		 System.out.println("태어난연도를 입력하세요");
		 myYear=Integer.parseInt(sc.nextLine());
		 System.out.println("이름을 입력하세요");
		 name=sc.nextLine();
		 System.out.println("핸드폰번호를 입력하세요");
		 hp=sc.nextLine();
		 System.out.println("주소를 입력하세요");
		 add=sc.nextLine();
		 //생성
		 Calendar cal=Calendar.getInstance();
		 //계산
		 age=cal.get(cal.YEAR)-myYear;
		 //출력
		 System.out.println("\t[개인정보]");
		 System.out.println("이름: "+name);
		 System.out.println("나이: "+age+"세");
		 System.out.println("연락처: "+hp);
		 System.out.println("주소: "+add);
		 
		 
		 
		 
		 
		
		

		
		
		
		
		
		
		
	}

}
