package day0703;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set : 데이터의 중복허용 안됨,순서를 유지하지 않는 집합
 * List : 데이터의 중복허용 됨,순서유지
 * Map : Key값을 알면 Value값을 구하기 가능
 *  */

public class ExHashSet_10 {

	public static void main(String[] args) {
		// 컬렉션-자료구조(set,vector,allaylist)
		//컬렉션이 복수의 자료형 저장_안정성이 떨어질수 있으므로 나온것이 제네릭<>
		//(인터페이스 or 클래스)<데이터형> 객체이름=new 클래스명<데이터형>;

		Set<String> set1=new HashSet<String>();
		//Set에 String데이터를 담겠다-Set은 인터페이스 이므로 객체생성이 안된다
		
		//추가.. 배열에 비해 가변적
		set1.add("사과");
		set1.add("포도");
		set1.add("사과"); //중복되었으므로 갯수 포함 안됨
		set1.add("바나나");
		set1.add("키위");
		set1.add("오렌지");
		
		System.out.println("데이터 갯수: "+set1.size()+"개"); //5개
		
		System.out.println("출력#1_for~each");
		
		for(String s:set1)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		System.out.println("출력2#_Iterator");
		
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
			
		}
		
		System.out.println();
		System.out.println("출력#3_for");
		
		Object[]ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.print(ob[i]+" ");
		}
		
		//모든데이터 삭제
		set1.clear();
		
		if(set1.isEmpty())
			System.out.println("\nSet타입안에 데이터가 없다");
		else
			System.out.println("\nSet타입안에 데이터가 있다");
	}

}
