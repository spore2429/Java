package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizTokenFile_09 {
	
	public static void fruitRead() {
		
		String fileName="C:\\sist0615\\file\\fruit.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("***과일목록***");
			System.out.println("상품\t수량\t단가\t총금액");
			
			while(true)
			{
				String s=br.readLine();
				
				if(s==null)
				
					break;
				
				/* 분리1
				StringTokenizer st=new StringTokenizer(s, ",");
				
				//배열개수만큼 반복출력
				String sang=st.nextToken();
				int su=Integer.parseInt(st.nextToken());
				int dan=Integer.parseInt(st.nextToken());
				int tot=su*dan; */
				
				//분리2
				String[]data=s.split(",");
				
				String sang=data[0];
				int su=Integer.parseInt(data[1]);
				int dan=Integer.parseInt(data[2]);
				int tot=su*dan;
				
				System.out.println(sang+"\t"+su+"개\t"+dan+"원\t"+tot+"원");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		
		fruitRead();

	}

}
