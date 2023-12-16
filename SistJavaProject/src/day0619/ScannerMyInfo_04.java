package day0619;

import java.util.Scanner;

public class ScannerMyInfo_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름을 입력하세요: 홍길동
		 * 핸드폰번호: 010-1234-5678
		 * 주소: 서울시 강남구
		 * ======================
		 * [개인정보]
		 * 이름: 홍길동
		 * 핸드폰번호: 010-1234-5678
		 * 주소: 서울시 강남구*/
		
		 Scanner sc=new Scanner(System.in);
		 
		 //변수
		 String name;
		 int ph;
		 String add;
		 
		 //출력
		 System.out.print("이름을 입력하세요:");
		 name=sc.nextLine();
		 
		 System.out.print("핸드폰 번호를 입력하세요:");
		 ph=Integer.parseInt(sc.nextLine()); //숫자입력시 버퍼
		 
		 System.out.print("주소를 입력하세요:");
		 add=sc.nextLine();
		 
		 //최종출력
		 System.out.println("==================");
		 System.out.println("[개인정보]");
		 System.out.println("이름: "+name);
		 System.out.println("핸드폰번호: "+ph);
		 System.out.println("주소: "+add);
		 System.out.println("==================");
		 
		 

	}

}
