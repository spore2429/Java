package day0620;

import java.util.Scanner;

public class SwitchTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n=4;
		
		switch(n)
		{
		case 1:
			System.out.println("n is 1");
			break; //break가 없을경우 끝까지 실행
		case 2:
			System.out.println("n is 2");
			break;
		case 3:
			System.out.println("n is 3");
			break;
		case 4:
			System.out.println("n is 4");
			break;
		default:
			System.out.println("n is > 4");
			break;
		}*/
		
		/*String msg="happy";
		//문자열은 jdk8부터 가능
		switch(msg)
		{
		case "hello":
			System.out.println("안녕");
			break;
		case "happy":
			System.out.println("행복하다");
			break;
		case "nice":	
			System.out.println("좋구만");
			break;*/
			
			//점수이용하여 학점구하기
			
	        Scanner sc=new Scanner(System.in);
		    int score;
	        
			char grade;
			System.out.println("점수를 입력하세요");
			score=sc.nextInt();
			
			switch(score/10)
			{
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
	
			
			}
			System.out.println("점수가 "+score+"점이므로 학점은 "+grade+"입니다");
	
	}
			}
