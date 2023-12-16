package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//score.txt를 읽고 몇개인지 총점,평균까지 구해서 출력
public class FileExcep_06 {
	
	public static void ScoreRead() 
	{
		String fileName="C:\\sist0615\\file\\score.txt";
		BufferedReader br=null;
		FileReader fr=null;
		int cnt=0;
		int total=0;
		double avg=0;
		
		try {
			fr=new FileReader(fileName);
			System.out.println("***파일을 열었어요***");
			br=new BufferedReader(fr);
			
			while(true)
			{
				String s=br.readLine();
				
				//더이상 값이 없으면 종료
				if(s==null)
					break;
				System.out.print(s+" ");
				
				cnt++;//읽은갯수
				total+=Integer.parseInt(s);//합계
			}
				
			//평균구하기
			avg=(double)total/cnt;
			System.out.println("\n총갯수: "+cnt+"개");
			System.out.println("총점: "+total+"점");
			System.out.printf("평균: %.2f점\n",avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("***파일이 없어요***"+e.getMessage());
		} catch (IOException e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
	
	public static void main(String[] args) {
		
		ScoreRead();
		System.out.println("***메모를 종료해요***");
		

	}
}