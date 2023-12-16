package day0626;

import java.util.Scanner;

public class ArrSeachCnt_01 {

	public static void main(String[] args) {
		// 반복문안에서 실행...성을 입력시 그성씨를 가진사람과 총 인원수 출력...종료라고 하면 프로그램 종료

		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int cnt;//입력한 성의 갯수
		String search;//입력할성
		String[]names= {"김선호","나나","이효리","엄정화","김완선","보아","유재석",
				"하하","김연진","이진"};
		
		while(true)
		{
			System.out.println("성을 입력하세요");
			search=sc.nextLine();
			//break
			if(search.equals("종료"))
			{	
				System.out.println("프로그램 종료");
			    break;
			}   
			//참,거짓
			boolean find=false;
			
			cnt=0;
			//조건
			
			for(int i=0;i<names.length;i++)
			{
				if(names[i].startsWith(search))
				{
					cnt ++;
					find=true;
					System.out.println((i+1)+"번째"+":"+names[i]);
				}
			}
			System.out.println("\t총"+cnt+"명 검색");
			/*if(find)//find=true
			System.out.println("\t총"+cnt+"명 검색");
		    else //!find
			System.out.println(search+"씨 성을 가진사람은 없습니다");*/
			}

			
	}
}