package day0616;

public class ParseArgs_04 {

	public static void main(String[] args) {
		/*main에서 실행할때 args로 변수 넘기는 문제
		 *변수명: sangName,su,dan,total
		 *
		 *1.변수선언
		 *2.계산
		 *3.출력
		 * 
		 *[상품정보]
		 * 상품명: 갤럭시폴드
		 * 수량: 5개
		 * 단가: 800000 원
		 * 총금액: 4000000 원*/
         
		 //1.변수선언
		 String sangName=args[0];
		 int su=Integer.parseInt(args[1]);
		 int dan=Integer.parseInt(args[2]);
		 int total;
		 
		 //2.계산
		 total=su*dan;
		 
		 //3.출력
		 System.out.println("[상품정보]");
		 System.out.println("상품명: "+sangName);
		 System.out.println("수량: "+su+"개");
		 System.out.println("단가: "+dan+"원");
		 System.out.println("총금액: "+total+"원");
		 	
	}

}
