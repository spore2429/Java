package day0621;

public class ExForWhile_10 {

	public static void test1() {
		
	//for 1-5의 합
		int i=1;
		int sum=0;
		for(;i<=5;i++)
		{
			sum+=i;
			
		}
		System.out.println("1~5까지의 합은: "+sum);
	}
	
	public static void test2()
	{
		//1~10 홀수합 for
		int i=1;
		int sum=0;
		
		for(;i<=10;i+=2)
		{
			if(i%2==1)
				sum+=i;
			
		}
		System.out.println("총합계는: "+sum);
		
		
		
}
	
	public static void test3() {
		//1~100까지의 합은 5050 100은변수로 처리해서 for
		int i=1;
        int sum=0;
        for(;i<=100;i++)
        {
        	sum+=i;
        	
        }
        System.out.println("1부터"+(i-1)+"까지의 합은: "+sum);	
        
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//test1();
		//test2();
		//test3();
		

		
	}

}
