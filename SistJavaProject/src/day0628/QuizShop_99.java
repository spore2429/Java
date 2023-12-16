package day0628;

class MyShop2{
	
	private String sangname;
	private String ipgo;
	private String chulgo;

	public String getSangname() {
		return sangname;
	}
	public void setSangname(String sangname) {
		this.sangname = sangname;
	}
	public String getIpgo() {
		return ipgo;
	}
	public void setIpgo(String ipgo) {
		this.ipgo = ipgo;
	}
	public String getChulgo() {
		return chulgo;
	}
	public void setChulgo(String chulgo) {
		this.chulgo = chulgo;
	}

}
//////////////////////////////////////////////
public class QuizShop_99 {

	public static void main(String[] args) {
		
		//객체생성
		MyShop2 m1=new MyShop2();
		MyShop2 m2=new MyShop2();

		//set
		m1.setSangname("키보드");
		m1.setIpgo("2023-06-01");
		m1.setChulgo("2020-06-20");
		
		m2.setSangname("모니터");
		m2.setIpgo("2023-06-04");
		m2.setChulgo("2023-06-23");
		
		//get
		m1.getSangname();
		m1.getIpgo();
		m1.getChulgo();
		
		m2.getSangname();
		m2.getIpgo();
		m2.getChulgo();
		
		//출력
		System.out.println("상품명: "+m1.getSangname()+"\n입고일:"+m1.getIpgo()+"\n출고일: "+m1.getChulgo());
		System.out.println("==============================================");
		System.out.println("상품명: "+m2.getSangname()+"\n입고일:"+m2.getIpgo()+"\n출고일: "+m2.getChulgo());
	}

}
