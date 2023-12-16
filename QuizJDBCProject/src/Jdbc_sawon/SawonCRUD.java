package Jdbc_sawon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SawonCRUD {

	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in);

	//insert
	public void insertSawon()//이름앞에
	{
		System.out.println("***사원추가하기***");

		System.out.println("사원명?");
		String name=sc.nextLine();
		System.out.println("성별(여자 or 남자)?");
		String gender=sc.nextLine();
		System.out.println("부서명?");
		String buseo=sc.nextLine();
		System.out.println("급여?");
		int pay=Integer.parseInt(sc.nextLine());

		String sql="insert into sawon values(seq_sawon.nextval,'"+name+"','"+gender+"','"+buseo+"',"+pay+")"; //pay는 홑따옴표 x 
		System.out.println(sql); //오류 찾기위함

		//오라클에 연결
		Connection conn=db.getConnection();
		Statement stmt=null;//바로 conn 호출불가

		try {
			stmt=conn.createStatement();
			stmt.execute(sql); //sql문실행 무조건써야함 excute,excuteupdate

			System.out.println("DB에 추가되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}
	//select
	public void selectSawon()
	{
		String sql="select num,name,gender,buseo,to_char(pay,'L999,999,999') pay from sawon"; //from앞 pay는 컬럼명
		System.out.println(sql);

		System.out.println("\t\t[전체사원명단]");
		System.out.println();

		System.out.println("시퀀스\t사원명\t성별\t부서명\t월급여");
		System.out.println("----------------------------------------------------");

		//db연결
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getString("buseo")+"\t"
						+rs.getString("pay"));


			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);

		}

	}
	//delete
	public void deleteSawon()
	{
		System.out.println("***사원삭제하기***");
		System.out.println("삭제할 사원의 이름을 입력하세요");
		String name=sc.nextLine();

		String sql="delete from sawon where name ='"+name+"'";
		System.out.println(sql);

		//db연결
		Connection conn=db.getConnection();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			stmt.execute(sql);

			System.out.println("삭제완료되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	//수정...시퀀스 입력후 부서,급여만 수정
	//update
	public void updateSawon()
	{

		System.out.println("***사원수정***");
		System.out.println("수정할 사원번호는?");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("사원의 부서는?");
		String buseo=sc.nextLine();
		System.out.println("사원의 급여는?");
		int pay=Integer.parseInt(sc.nextLine());

		String sql="update sawon set buseo ='"+buseo+"',pay ="+pay+" where num="+num;
		System.out.println(sql);

		//db연결
		Connection conn=db.getConnection();
		Statement stmt=null;

		try {
			stmt=conn.createStatement();
			stmt.execute(sql); //필수
			System.out.println("수정완료");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	//search
	public void searchSawon()
	{
		System.out.println("검색할 사원명을 입력해주세요(일부검색도 됨)");
		String name=sc.nextLine();


		String sql="select num,name,gender,buseo,to_char(pay,'L999,999,999') pay from sawon "
				+ "where name like '%"+name+"%'"; 
		System.out.println(sql);

		System.out.println("\t\t[전체사원명단]");
		System.out.println();

		System.out.println("시퀀스\t사원명\t성별\t부서명\t월급여");
		System.out.println("----------------------------------------------------");

		//db연결
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;

		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);

			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getString("buseo")+"\t"
						+rs.getString("pay"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SawonCRUD sawon=new SawonCRUD();//클래스생성

		Scanner sc=new Scanner(System.in);//메인,전역 따로 생성
		int n;

		while(true)
		{
			System.out.println();
			System.out.println("Oracle Db_Sawon문제");
			System.out.println("1.insert 2.select 3.delete 4.update 5.search 9.exit");

			n=Integer.parseInt(sc.nextLine());

			if(n==1)
				sawon.insertSawon();
			else if(n==9)
			{
				System.out.println("종료합니다");
				break;
			}
			else if(n==2)
				sawon.selectSawon();
			else if(n==3)
				sawon.deleteSawon();
			else if(n==4)
				sawon.updateSawon();
			else if(n==5)
				sawon.searchSawon();

		}


	}

}
