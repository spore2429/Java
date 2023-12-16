package day0622;

import java.util.Scanner;

public class GaroGugu_06 {

	public static void main(String[] args) {
		// 가로방향으로 구구단 출력 
		//[2단]....[9단]
		System.out.println("\t\t\t**가로방향 구구단**");
		
		//제목[]
		for(int dan=2;dan<=9;dan++)
		{
			System.out.print("["+dan+"단]\t");
		}
		System.out.println();
		System.out.println();//칸 띄우기
		
		
		for(int j=1;j<=9;j++)
		{
			for(int dan=2;dan<=9;dan++)//단
			{
				
				System.out.print(dan+"X"+j+"="+dan*j+"\t");
				
			}
		System.out.println();
		}
			
			

	}

}
