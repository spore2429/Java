package day0616;

public class DataType_08 {

	public static void main(String[] args) {
    
		byte a=127; //-128~127
		byte b=(byte)128; //더작은 자료형으로의 변환(디모션_값손실)
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int x=7;
		int y=4;
		//정수형끼리의 계산결과는 무조건 int타입
	    
		
		System.out.println(x/y);
		System.out.println((double)x/y);
		System.out.println(x/(double)y); //계산시 x를 double로 변환해서 계산:결과는 double
	    
		
		// 
		
		
		double d=100.0;
		int i=100;
		
        int result=(int)d+i; 
        double result2=(double)d+i;
        
        System.out.println("d="+d);
        System.out.println("i="+i);
        System.out.println("result="+result);
        System.out.println("result2="+result2);
	
	}

}
