package day0621;

public class ExFor_05 {

	public static void main(String[] args) {
		
		//for문
		//1~10까지 가로로 출력
	
		
		for(int i=1;i<=10;++i)
		{
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		//10~1까지 가로로 출력
		
		for(int i=10;i>=1;i--)
		{
			System.out.printf("%4d",i);
		}
		System.out.println();
		
		//1~50까지를 출력하는데 3씩 증가하게...
		//1 4 7....
		
		for(int i=1;i<=50;i+=3)
		
			System.out.print(i+" ");
			System.out.println();
		
		//continue
			//1~20까지 출력하는데 1 2 3 4 6 7 8 9 11 12...
			for(int i=1;i<=20;i++)
			{
				//5의 배수를빼고 출력
				if(i%5==0)
					continue; //i++로 이동
				//break; //반복문 빠져나감
				System.out.print(i+" ");
			}
		
		
	}

}
