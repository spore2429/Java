package day0621;

public class ExWhile_03 {

	public static void main(String[] args) {
		// while for 비교
		//10부터1or0까지
		
		int i=10;
		
		while(i>=0)
		{
			System.out.print(i--+" ");
			
		}
        System.out.println();
        
        
        //for
        i=10;
        for(;i>=0;i--) //i를 밖으로 넘겨도 ;은 살아있음
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        
        
	}

}
