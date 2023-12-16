package day0704;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]flowers={"장미","후리지아","다알리아","수국"};
		
		//객체 삽입,삭제할수잇는 컨테이너 클래스 생성(제네릭)
		ArrayList<String> list=new ArrayList<String>();
		
		//데이터 담기
		for(String f:flowers)//DB가 많아질수록
		{
			list.add(f);//삽입
		}
		
		System.out.println("size: "+list.size());
		
		System.out.println();
		
		//1
		System.out.println("#출력1_for");
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(flowers[i]+" ");
		}
		
		System.out.println();
		
		//2
		System.out.println("\n#출력1_for~each");
		
		
		for(String s:list)
			System.out.print(s+" ");
	
	}

}
