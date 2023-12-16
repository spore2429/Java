package day0622;

public class ForStar_07 {

	public static void main(String[] args) {
		//중첩(다중)for문으로 별모양 찍기
	System.out.println("중첩(다중)for문으로 별모양 찍기");
		
		for(int i=1;i<=5;i++) //열 갯수
		{
			for(int j=1;j<=5;j++) //행 갯수
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//중첩(다중)for문으로 별모양 찍기2 삼각형
		System.out.println("삼각형");
		for(int i=1;i<=5;i++)//열갯수 (i값만큼만 반복)
		{
		    
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3번
		
		System.out.println("역삼각형");
		
		for(int i=1;i<=5;i++)//열갯수 (i값만큼만 반복)
		{
		    
			for(int j=5;j>=i;j--)//열갯수(i가 1일떄 5번..5일때 1번)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
			
		
	}

}
