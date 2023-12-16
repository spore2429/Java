package day0620;

import java.util.Scanner;

public class QuizIfOper_05 {

	public static void main(String[] args) {
		/*
		 상품명? 아이패드
		 수량? 3개
		 가격? 500000
         ======================
         아이패드 3개는 총 1500000 원 입니다
         3개이상은 10프로 DC가 됩니다
         DC된 총금액은 1350000 원 입니다
		 */
		
		//생성,변수
		Scanner sc=new Scanner(System.in);
		String name;
		int su,dan,tot,dc;
		System.out.println("상품명?");
		name=sc.nextLine();
		System.out.println("수량?");
		su=sc.nextInt();
		System.out.println("가격?");
		dan=sc.nextInt();
		
		//계산
		tot=su*dan;
		
		//if문
		if(su>=3)
			dc=tot*9/10; //dc=(int)(tot*0.9)
		else
			dc=tot;
		
		//삼항연산자
		dc=su>=3?tot*9/10:tot;
		
		//출력
		System.out.println("============");
		System.out.println(name+" "+su+"개는 총 "+tot+"원입니다");
		System.out.println("3개이상은 10프로 DC가됩니다");
		System.out.println("DC된 총금액은 "+dc+"원입니다");
			
		
		
		
		

		
		
		
		
		
		
	}

}
