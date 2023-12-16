package day0621;

public class QuizFor_09 {

	public static void main(String[] args) {
		//Q.1 2 4 5 7 8 10 _ continue이용해서 출력해보세요
		
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}
			System.out.println();
			
			/*Q2
			 홀수값:1~9까지 세로로 continue 이용*/
			
			/*for(int i=1;i<=9;i++)
			{
				if(i%2==0) //짝수
					continue;
				System.out.println("홀수값: "+i);
			}*/
			
		    //1~100까지중에서 홀수의 합을 구하시오
			int osum=0; //홀수합계구할변수
			int esum=0;
			
			for(int i=1;i<=100;i++)
			{
				if(i%2==1)
					osum+=i;

				else
					esum+=i;
				
			}
			System.out.println("홀수의 합: "+osum);
			System.out.println("짝수의 합: "+esum);
			
			//while(true)문을 이용해서 1~100 짝수의합
			
			int sum=0;
			int a=0;
		
			
			while(true)
			{
				a++;
				/*if(a%2==1)
					continue;*/
				
				if(a%2==0)
				sum+=a;
				
				if(a==100) //if(a>100)
					break;
				}
			System.out.println("1~100까지의 짝수의합은:"+sum);
			
			//1-100까지 홀수의 합
			
			int h=0;
			int tot=0;
			
			while(true)
			{
				    h++;
				if(h%2==1)
					tot+=h;
					
				if(h==100)
					break;
							
			}
			System.out.println("1~100까지의 홀수의합: "+tot);
			
			
			int e=0;
			int ztot=0;
			
			
			for(e=1;e<=100;e++)
			{
				ztot+=e;
				
			}
			System.out.print("1~100까지의 합: "+ztot);
				
	}

}
