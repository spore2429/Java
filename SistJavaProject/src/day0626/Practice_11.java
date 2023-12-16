package day0626;

import java.util.Scanner;

public class Practice_11 {

	public static void main(String[] args) {
		//생성
		Scanner sc=new Scanner(System.in);
		//변수
		int bingo=0;
		int[][]pz=new int[3][3];//3행 3열

		//while문
		while(true)
		{
			for(int i=0;i<pz.length;i++)
			{
				for(int j=0;j<pz[i].length;j++)
				{
					//1~3사이의 난수발생
					pz[i][j]=(int)(Math.random()*3)+1;
				}
			}

			for(int i=0;i<pz.length;i++)
			{
				for(int j=0;j<pz[i].length;j++)
				{
					System.out.printf("%4d",pz[i][j]);
				}

			}
			System.out.println();
		
			bingo=0;
			
			for(int i=0;i<pz.length;i++)
			{
			    //가로
				if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i])
				bingo++;
				
				//세로
				if(pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2])
					bingo++;
			}
	
				//대각선/
				if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0])
					bingo++;
				//대각선\
					if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2])
						bingo++;
		
					//빙고출력
					if(bingo==0)
						System.out.println("꽝");
					else
						System.out.println("빙고: "+bingo+"개");

					//게임종료
					System.out.println("엔터를 누르면 다음난수가 나옵니다(q:종료)");
					String ans=sc.nextLine();

					if(ans.equalsIgnoreCase("q"))
					{
						System.out.println("게임을 종료합니다");
						break;
					}
		}
     
		
		
		

	}
}


