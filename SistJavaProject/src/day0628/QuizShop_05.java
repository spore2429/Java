package day0628;

class MyShop{
	
	private String sangpumName;
	private String ipgoday;
	private String chulgoday;
	
	//3개의 데이타를 한번에 수정할수있는 메서드
	public void setData(String name,String ipgo,String chulgo)
	{
		sangpumName=name;
		ipgoday=ipgo;
		chulgoday=chulgo;
		}
	
	//3개의 데이타를 한번에 출력할수있게 메서드
	public String getData() 
	{
		String s="상품명: "+sangpumName+"\n입고날짜: "+ipgoday+"\n출고일자: "+chulgoday;
		
		return s;
	}
	
}

////////////////////////////////////////////
public class QuizShop_05 {

	public static void main(String[] args) {
		
		
		MyShop shop1=new MyShop();
		MyShop shop2=new MyShop();
		
		shop1.setData("키보드","2023-06-01","2023-06-20");
	    System.out.println(shop1.getData());
		
	    System.out.println("=========================");
	    
	    shop2.setData("모니터","2023-06-04","2023-06-23");
		System.out.println(shop2.getData());
	    
		
		
		
		
		
	}

}
