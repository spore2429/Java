package day0630;

import java.util.Scanner;

abstract class Command{
	
	public abstract void write();
}
///////////////////////////////////////////
class Add extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 추가합니다");
	}
	
}
///////////////////////////////////////////
class List extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 게시물을 조회합니다");
	}
	
}
///////////////////////////////////////////
class Modify extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 게시물을 수정합니다");
	}
	
}
//////////////////////////////////////////
class Remove extends Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 게시물을 삭제합니다");
	}
	
}
///////////////////////////////////////////
public class OracleCRUD_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Command com=null;
		int n;
		
	exit:while(true)
		{
			System.out.println("1.추가 2.조회 3.수정 4.삭제 9를 누르면 종료");
			System.out.println("====================================");
			n=Integer.parseInt(sc.nextLine());
			
			switch(n)
			{
			case 1:
				com=new Add();
				break;
				
			case 2:
				com=new List();
				break;
				
			case 3:
				com=new Modify();
				break;
				
			case 4:
				com=new Remove();
				break;
			
			case 9:
				System.out.println("종료합니다");
				System.exit(0);
				
			default:
				System.out.println("잘못입력했어요");
				break;
			}
		
			if(n>0 && n<=4)
				com.write();
			
		}
	
	
	
	
	}

}
