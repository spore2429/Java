package day0626;

public class AurDaCha_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]arr;
		arr=new int[2][3];/////////////2행 3열로 할당(row.column)

		//초기값
		arr[0][0]=10;
		arr[0][1]=12;
		arr[0][2]=30;

		arr[1][0]=5;
		arr[1][1]=10;
		arr[1][2]=20;

		System.out.println("형의갯수: "+arr.length);

		//열의갯수
		System.out.println("0행의 열갯수: "+arr[0].length);
		System.out.println("1행의 열갯수: "+arr[1].length);

		System.out.println("***데이터 출력***");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
			}

	      System.out.println();
		}
		
		System.out.println("2차원 배열에 값변경후 다시출력");
           
        arr[0][1]=1000;
        arr[1][0]=2000;
	    arr[1][2]=3000;
	    
	    
	
	
	    
	}   
}
