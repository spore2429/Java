package day0623;

public class ArrInt_06 {

	public static void main(String[] args) {
		// 선언하면서 초기값들을 동시에 저장할수있다
		
		int[]arr= {5,7,8,9,12,23,56,47};
		
		System.out.println("개수: "+arr.length);
		
		System.out.println("출력_1:   1==> 5");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+"==>"+arr[i]);
		}
		
		System.out.println("출력_2");
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

}
