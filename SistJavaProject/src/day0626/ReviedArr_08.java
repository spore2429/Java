package day0626;

public class ReviedArr_08 {

	public static void main(String[] args) {
		// 해당 배열을 for문을 이용하여 출력하시오
		
		//1.ex>0번지: 영환이
		
		String[] names= {"영환이","수환이","동환이","성환이"};
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println((i+1)+"번째: "+names[i]+"");
		}
		
		//2.해당배열을 가로로 출력하시오
		System.out.println();
		
		int[]nums= {2,4,5,7,8};
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print((i+1)+"번째: "+nums[i]+", ");
		}

		//flowers
		System.out.println();
		System.out.println();
		
		String[]flowers= {"장미꽃","제비꽃","할미꽃","라일락","아카시아"};
		
		for(int i=0;i<flowers.length;i++)
		{
			System.out.print(flowers[i]+" ");
		}
		
		//colors
		System.out.println();
		System.out.println();
		
		String[]colors= {"빨강","파랑","노랑","초록","분홍"};
		for(int i=0;i<colors.length;i++)
		{
			System.out.print(colors[i]+" ");
		}
		
		//foods
		System.out.println();
		System.out.println();
		
		String[]foods= {"제육","김밥","라면"};
		for(String f:foods)
		{
			System.out.print(f+" ");
		}
	
	
	}

}
