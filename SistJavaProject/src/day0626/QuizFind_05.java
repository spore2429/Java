package day0626;

import java.util.Scanner;

public class QuizFind_05 {

	public static void main(String[] args) {
		/*숫자를 입력받아서 배열의 몇번째에 있는지 출력하고 없을경우 없습니다 라고 출력하세요
		 *(0이면 종료)
		 *입력값:11
		 *11은 2번째 에있어요!
		 *입력값:100
		 *100은 없습니다!
		 *입력값:0
		 *종료합니다(프로그램종료)*/
        
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int[]arrNums= {35,12,56,76,34,21,9,7};
		int su; //입력할수
		boolean find;
		
		while(true)
		{
			System.out.println("숫자를 입력하세요(0이면 종료)");
			System.out.print("입력값:");
			su=sc.nextInt();
			
			//break
			if(su==0)
			{
				System.out.println("종료합니다");
				break;
			}
			//find
			find=false;//반복문안에서 찾았을경우 true로 변경해줄것
			//배열개수만큼 입력한숫자 찾기
			
			for(int i=0;i<arrNums.length;i++)
			{
				if(su==arrNums[i])
				{
					find=true;
					System.out.println("입력값:"+su);
					System.out.println("\t"+su+"은(는) "+(i+1)+"번째에 있어요!");
				}
			}
			if(!find) //거짓조건 for문밖에 
				System.out.println("\t"+su+"은(는) 배열에 없습니다!");
		}
	
		
		
	}

}
