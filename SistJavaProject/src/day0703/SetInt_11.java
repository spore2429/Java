package day0703;

import java.util.HashSet;

public class SetInt_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(11);
		set1.add(5);
		set1.add(11);
		set1.add(78);
		set1.add(143);
		set1.add(43);
		
		System.out.println("개수: "+set1.size()+"개");
		
		System.out.println("출력3_for");
		
		Object[]ob=set1.toArray();
		
		for(int i=0;i<ob.length;i++)
		{
			System.out.printf("%5d",ob[i]);
		}

	}

}
