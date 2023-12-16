package day0704;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/* 
1.상품입고 2.상품재고 9.종료
1 입력시
상품명? 바나나
수량? 10개
가격? 1000원

2 입력시
번호 상품명 수량  가격  총가격
1   바나나 10개 1000 10000
 */

public class ShopMain_03 {

	List<Shop> list=new Vector<Shop>();

	//입력
	public void inputShop() {

		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		String sangName;
		int su,dan;

		System.out.println("상품명?");
		sangName=sc.nextLine();
		System.out.println("수량?");
		su=Integer.parseInt(sc.nextLine());
		System.out.println("가격?");
		dan=Integer.parseInt(sc.nextLine());

		Shop data=new Shop(sangName, su, dan);

		list.add(data);
		System.out.println("현재데이터 갯수: "+list.size());
	}

	//출력

	public void outputShop() {
		System.out.println("\t\t\t\t***주문서***");
		System.out.println("==================================================================================");

		for(int i=0;i<list.size();i++)
		{
			Shop s=list.get(i);
			
			System.out.println("번호: "+(i+1)+"번 "+"\t상품명: "+s.getSangName()+"\t수량: "+s.getSu()+"개 "+"\t가격: "+s.getDan()+"원 "+"\t총가격: "+(s.getSu()*s.getDan())+"원");
		}
	}

	//메인
	public static void main(String[] args) {

		ShopMain_03 sm=new ShopMain_03();
		//생성
		Scanner sc=new Scanner(System.in);
		int n; //입력할숫자
		
		//sm.inputShop();//입력
		//sm.outputShop();//출력

		while(true)
		{
			System.out.println("==================================================================================");
			System.out.println("1:상품입고 2:상품재고 9:종료");
			n=Integer.parseInt(sc.nextLine());

			if(n==1)
				sm.inputShop();
			else if(n==2)
				sm.outputShop();
			else if(n==9)
			{
				break;
			}

			else 
			{
				System.out.println("잘못입력했어요");
				continue;
			}

		}

	}

}
