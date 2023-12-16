package day0629;

class MyTv{

	private String che; //채널
	private String vol; //볼륨

	public String getChe() {
		return che;
	}
	public void setChe(String che) {
		this.che = che;
	}
	public String getVol() {
		return vol;
	}
	public void setVol(String vol) {
		this.vol = vol;
	}	    
	      
}
/////////////////////////////////////////////
class MyRadio{
	
	private String che2;
	private String vol2;
	
	public String getChe2() {
		return che2;
	}
	public void setChe2(String che2) {
		this.che2 = che2;
	}
	public String getVol2() {
		return vol2;
	}
	public void setVol2(String vol2) {
		this.vol2 = vol2;
	}
}





//////////////////////////////////////////////
public class ReviewObject_01 {

	public static void main(String[] args) {

		//객체생성
		MyTv tv1=new MyTv();
		MyTv tv2=new MyTv();
		tv1.setChe("ebs");
		String c1=tv1.getChe();
		
		tv1.setVol("15");
		String v1=tv1.getVol();
	
		tv2.setChe("tbn");
		String c2=tv2.getChe();
		
		tv2.setVol("18");
		String v2=tv2.getVol();
		
		MyRadio rd1=new MyRadio();
		MyRadio rd2=new MyRadio();
		
		rd1.setChe2("mbc");
		rd1.getChe2();
		
		rd2.setChe2("sbs");
		rd2.getChe2();
		
		//출력
		System.out.println(c1+" 채널을 시청합니다");
		System.out.println("볼륨은 "+v1+"데시벨 입니다");
		System.out.println("-----------------");
		System.out.println(c2+" 채널을 시청합니다");
		System.out.println("볼륨은 "+v2+"데시벨 입니다");
		
		System.out.println();

		System.out.println(rd1.getChe2()+"채널을 시청합니다");
		System.out.println("볼륨은 "+rd1.getVol2()+"입니다");
		System.out.println("-----------------");
		System.out.println(rd2.getChe2()+"채널을 시청합니다");
		System.out.println("볼륨은 "+rd2.getVol2()+"데시벨 입니다");
	}

}
