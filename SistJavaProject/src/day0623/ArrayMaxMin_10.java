package day0623;

public class ArrayMaxMin_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []data= {5,120,44,66,23,77,88,45,12};
		
		System.out.println("date의 길이: "+data.length);
		
		int max=data[0];//첫데이터를 무조건 최대값에 저장
		int min=data[0];//첫데이터를 무조건 최소값에 저장
		//두번째값부터 끝까지 max와 비교
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
			max=data[i];
			
			if(min>data[i])
        		min=data[i];
	
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);

	}

}
