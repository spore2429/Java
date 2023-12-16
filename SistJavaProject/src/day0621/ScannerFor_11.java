package day0621;

import java.util.Scanner;

public class ScannerFor_11 {

	public static void numSum()
	{
		//합계를 구할숫자는? 100
		//1부터 100까지의 합은 5050입니다
		
		Scanner sc=new Scanner(System.in);
		int n; //입력할수
		//변수
		int i=1;
	    int sum=0;
	    //입력
	    System.out.println("합계를 구할숫자는?");
	    n=sc.nextInt();
	    //for
	    for(;i<=n;i++)
	    	sum+=i;
	   
	    //출력
	    System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
	    
	}	    
	    public static void factorialTest()
	    {
	    	//1!=1
	    	//2!=2
	    	//3!=6
	    	//10! 출력
	    int result=1;
	    for(int i=1;i<=10;i++)
	    {
	    	result*=i;
	    	System.out.println(i+"!="+result);
	    }
	        
	    }
		
	    public static void quizFact()
	    {
	    	//팩토리얼을 구할 숫자를 입력
	    	//5!=120
	    	
	    	Scanner sc=new Scanner(System.in);
	    	int n;
	    	//변수
	    	int result=1;
	    	int i=1;
	    	//입력
	    	System.out.println("팩토리얼을 구할 숫자를 입력하세요");
	    	n=sc.nextInt();
	    	//for
	    	for(;i<=n;i++)
	    	{
	    		result*=i;
	    		
	    	}
	    	//출력
	    	System.out.println(i-1+"!="+result);
	    			
	    			
	    		
	    }
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numSum();
		//factorialTest();
		quizFact();

	}

}
