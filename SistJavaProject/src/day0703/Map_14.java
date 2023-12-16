package day0703;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Map_14 {

	public static void main(String[] args) {
		// 키는 중복을 허용하지 않고 ,값은 중복을 허용한다
		//Key 와 Value 을 쌍으로 저장
		Map<String, String> map=new HashMap<String, String>();//String,int석여있으면 Object
		map.put("name", "손석구");
		map.put("age", 23+" ");
		map.put("addr", "제주시 애월읍");
		
		//같은 키값으로 넣으면 먼저데이터는 없어짐
		map.put("name", "제니");//먼저 입력한 손석구 사라짐
		
		System.out.println("size: "+map.size());
		System.out.println("**키값을 정확하게 알면 value값 얻을수있다**");
		
		System.out.println("이름: "+map.get("name")); //제니
		System.out.println("나이: "+map.get("age"));
		System.out.println("주소: "+map.get("addr")); 
		
		System.out.println("**키값을 먼저 한꺼번에 얻은후 값을 얻는방법**");
		
		Set<String> keySet=map.keySet();
		
		System.out.println("**방법1**");
		Iterator<String> KeyIter=keySet.iterator();
		while(KeyIter.hasNext())
		{
			String key=KeyIter.next();
			System.out.println(key+"==>"+map.get(key));
		}
		 
		System.out.println("방법2");
		for(String key:keySet)
		{
			System.out.println(key+"==>"+map.get(key));
		}
	}

}
