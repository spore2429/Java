package dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareMyShop {

	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in);
	
	//insert
	public void insertMyshop()
	{
		//Connection
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		System.out.println("상품명은?");
		String sangpum=sc.nextLine();
		System.out.println("수량?");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("가격?");
		int price=Integer.parseInt(sc.nextLine());
		
		//sql..PreparedStatement는 미안의 sql문을 작성
		String sql="insert into myshop values(seq1.nextval,?,?,?,sysdate)";

		try {
			pstmt=conn.prepareStatement(sql);
			
			//?를 순서대로 바인딩
			pstmt.setString(1, sangpum);
			pstmt.setInt(2, su);
			pstmt.setInt(3, price);
			
			//업데이트
			int a=pstmt.executeUpdate();
			
			if(a==1)
				System.out.println("인서트성공");
			else
				System.out.println("인서트실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//delete
	public void deleteMyshop()
	{
		//시퀀스 입력후 삭제
		Scanner sc=new Scanner(System.in);
		String shopnum;
		
		System.out.println("삭제할 상품번호는?");//시퀀스
		shopnum=sc.nextLine();
		
		String sql="delete from MyShop where shopnum="+shopnum;
		
		//db연결
		Connection conn=db.getConnection();
		//statement
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			
			//sql문 실행
			int a=stmt.executeUpdate(sql);
			
			if(a==0)
				System.out.println("없는상품번호입니다");
			else
				System.out.println("삭제완료되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}
	
	
	//update
	public void updateMyshop()
	{
		//수정할 시퀀스 상품번호,상품명,수량,가격 입력
		Scanner sc=new Scanner(System.in);
		String shopnum;
		System.out.println("수정할 상품번호는?");
		shopnum=sc.nextLine();
		
		//여기서 시퀀스가 없다면 종료
		if(!isData(shopnum))
		{
			System.out.println("해당번호는 존재하지 않습니다");
			return;
		}
		

		System.out.println("수정할 상품명은?");
		String sangpum=sc.nextLine();
		System.out.println("수정할 수량은?");
		String su=sc.nextLine();
		System.out.println("수정할 가격은?");
		String price=sc.nextLine();
		
		String sql="update myshop set sangpum='"+sangpum+"',su='"+su+"',price='"+price+"' where shopnum="+shopnum;
		
		//db연결
		Connection conn=db.getConnection();
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}
		
		//update할떄 없는번호인지 있는번호인지 찾아주기
		public boolean isData(String shopnum)
		{
			//num에 해당하는 데이터가 있으면 true,없으면 false
			boolean flag=false;
			
			String sql="select * from myshop where shopnum="+shopnum;
			
			Connection conn=db.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			
			try {
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				if(rs.next())
					flag=true;
				else
					flag=false;
			
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(rs, stmt, conn);
			}
			
			return flag;
		}

	//select
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void selectMyshop()
	{
		System.out.println("상품번호\t상품명\t수량\t가격\t입고날짜");
		System.out.println("==================================================");
		
		String sql="select * from myshop";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=db.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int shopnum=rs.getInt("shopnum");
				String sangpum=rs.getString("sangpum");
				int su=rs.getInt("su");
				int price=rs.getInt("price");
				String ipgo=rs.getString("ipgo");
				System.out.println(shopnum+"\t"+sangpum+"\t"+su+"\t"+price+"\t"+ipgo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	
	//상품검색
	public void searchSangpum()
	{
		System.out.println("검색할 상품명(일부)");
		String sang=sc.nextLine();
		
		String sql="select *from myshop where sangpum like ?";
		System.out.println(sql);
		
		System.out.println("상품번호\t상품명\t수량\t가격\t입고날짜");
		System.out.println("===========================================");
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+sang+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("shopnum")+"\t"
				+rs.getString("sangpum")+"\t"
						+rs.getInt("su")+"\t"
						+rs.getInt("price")+"\t"
						+rs.getString("ipgo"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrepareMyShop shop=new PrepareMyShop();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("***상품입고***");
			System.out.println("1.상품추가  2.상품삭제  3.상품수정 4.상품전체출력 5.상품검색 9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				shop.insertMyshop();
			else if(n==9)
				{
				System.out.println("종료합니다");
				break;
				}
			else if(n==2)
				shop.deleteMyshop();
			else if(n==3)
				shop.updateMyshop();
			else if(n==4)
				shop.selectMyshop();
			else if(n==5)
				shop.searchSangpum();
		}
	}

}
