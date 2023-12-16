package day0626;

import java.util.Arrays;

public class LottoSort_03 {

	public static void main(String[] args) {
		

int[]lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++)
		{
			//1~45까지의 랜덤수 발생
			lotto[i]=(int)(Math.random()*45)+1;
			
			//중복처리
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j])
				{
					i--; //같은번지에 다시값을 구하기위해서
					break; //i++로 이동
				}
			}
			
		}
        //오름차순 정렬
		//Arrays.sort(lotto);
		for(int i=0;i<lotto.length;i++)
		{
			for(int j=i+1;j<lotto.length;j++) 
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//출력
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		System.out.println();

		
	}

}
