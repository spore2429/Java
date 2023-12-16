package day0623;

import java.util.Scanner;

public class QuizArrFind_13 {

	public static void main(String[] args) {
		// 이름을 입력해서 없으면 없다 있으면 몇번째 있는지 출력하기
		// 끝이라고쓰면종료

		//생성
		Scanner sc=new Scanner(System.in);
		//변수 입력할 이름
		String[]stuNames= {"이성신","이민규","박병주","최성현","김영준","강연주","최진평",
				"고은비","송주영"};
		String name;
		boolean flag;
		//while문
		while(true)
		{
			System.out.println("이름을 입력하세요");
			name=sc.nextLine();

			//break
			if(name.equals("끝"))
			{
				System.out.println("종료합니다");
				break;
			}

			//있다,없다 초기값
			flag=false;
			//값찾기
			for(int i=0;i<stuNames.length;i++)
			{
				if(name.equals(stuNames[i]))
				{
					flag=true;
					System.out.println((i+1)+"번째에서 검색");
				}
			}
				if(!flag)
					System.out.println("해당 이름이 존재하지않습니다");
			}


	
	
	}

}
