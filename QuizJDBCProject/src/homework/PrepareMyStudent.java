
package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class PrepareMyStudent {

	DBConnect db=new DBConnect();
	Scanner sc=new Scanner(System.in);

	//insert
	public void insertMyStudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;

		System.out.println("학생명을 입력하세요");
		String stu_name=sc.nextLine();
		System.out.println("학년을 입력하세요");
		String stu_grade=sc.nextLine();
		System.out.println("연락처를 입력하세요");
		String hp=sc.nextLine();
		System.out.println("주소를 입력하세요");
		String addr=sc.nextLine();
		System.out.println("나이를 입력하세요");
		String age=sc.nextLine();

		//sql
		String sql="insert into mystudent values(seq_stu.nextval,?,?,?,?,?,sysdate)";

		try {
			pstmt=conn.prepareStatement(sql);

			//?를 순서대로 바인딩
			pstmt.setString(1, stu_name);
			pstmt.setString(2, stu_grade);
			pstmt.setString(3, hp);
			pstmt.setString(4, addr);
			pstmt.setString(5, age);

			int a=pstmt.executeUpdate();

			if(a==1)
				System.out.println("***insert success!!!***");
			else
				System.out.println("***insert failed!!!***");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	//select
	public void selectMyStudent()
	{
		Connection conn=db.getConnection();

		System.out.println("학생번호\t학생명\t학년\t연락처\t주소\t나이\t입력날짜");
		System.out.println("=======================================================================");

		String sql="select * from mystudent";

		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();

			System.out.println("학생정보를 출력합니다");
			
			while(rs.next())
			{
				
				System.out.println(rs.getString("stu_num")+"\t"
						+rs.getString("stu_name")+"\t"
						+rs.getString("stu_grade")+"\t"
						+rs.getString("hp")+"\t"
						+rs.getString("addr")+"\t"
						+rs.getString("age")+"\t"
						+rs.getString("sdate"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	//delete
	public void deleteMyStudent()
	{
		Connection conn=db.getConnection();
		String stu_num;

		System.out.println("삭제할 학생번호를 입력하세요");
		stu_num=sc.nextLine();

		String sql="delete from mystudent where stu_num = ?";

		PreparedStatement pstmt=null;

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);

			int a=pstmt.executeUpdate();

			if(a==0)
				System.out.println("해당 학생번호가 존재하지 않습니다");
			else
				System.out.println("삭제완료되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
	//update
	public void updateMyStudent()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;

		System.out.println("변경할 학생번호를 입력하세요");
		String stu_num=sc.nextLine();

		if(!isData(stu_num))
		{

			System.out.println("해당 학생번호는 존재하지않습니다");
			return;
		}

		System.out.println("변경할 학생명을 입력하세요");
		String stu_name=sc.nextLine();
		System.out.println("변경할 학년을 입력하세요");
		String stu_grade=sc.nextLine();
		System.out.println("변경할 연락처를 입력하세요");
		String hp=sc.nextLine();
		System.out.println("변경할 주소를 입력하세요");
		String addr=sc.nextLine();
		System.out.println("변경할 나이를 입력하세요");
		String age=sc.nextLine();

		String sql="update mystudent set stu_name=?,stu_grade=?,hp=?,addr=?,age=? where stu_num=?";

		try {
			pstmt=conn.prepareStatement(sql);

			//바인딩
			//?를 순서대로 바인딩
			pstmt.setString(1, stu_name);
			pstmt.setString(2, stu_grade);
			pstmt.setString(3, hp);
			pstmt.setString(4, addr);
			pstmt.setString(5, age);
			pstmt.setString(6, stu_num);
			pstmt.executeUpdate(); //바인딩뒤에 업데이트
			
			System.out.println("학생정보가 수정완료되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	//update할떄 없는번호인지 있는번호인지 찾아주기
	public boolean isData(String stu_num)
	{
		//해당하는 데이터가 있으면 true,없으면 false
		boolean flag=false;

		String sql="select * from mystudent where stu_num=?";

		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, stu_num);//바인딩 
			rs=pstmt.executeQuery();

			if(rs.next())
				flag=true;
			else
				flag=false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return flag;
	}

	//search
	public void searchMyStudent()
	{

		System.out.println("검색할 학생명(일부)");
		String n=sc.nextLine();

		String sql="select * from mystudent where stu_name like ?";
		System.out.println(sql);

		System.out.println("학생번호\t학생명\t학년\t연락처\t주소\t나이\t입력날짜");
		System.out.println("=======================================================================");

		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;


		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+n+"%");
			rs=pstmt.executeQuery();

			while(rs.next())
			{
				System.out.println("학생정보가 검색되었습니다");
				System.out.println(rs.getString("stu_num")+"\t"+rs.getString("stu_name")+"\t"+rs.getString("stu_grade")+"\t"+rs.getString("hp")+"\t"+rs.getString("addr")+"\t"+rs.getString("age")+"\t"+rs.getDate("sdate"));

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrepareMyStudent stu=new PrepareMyStudent();
		Scanner sc=new Scanner(System.in);
		int n;

		while(true)
		{
			System.out.println("1.학생정보입력 2.학생정보출력 3.학생정보삭제 4.학생정보수정 5.학생정보검색 9.프로그램종료");
			System.out.println("=======================================================================");
			n=Integer.parseInt(sc.nextLine());

			if(n==1)
				stu.insertMyStudent();
			if(n==2)
				stu.selectMyStudent();
			if(n==3)
				stu.deleteMyStudent();
			if(n==4)
				stu.updateMyStudent();
			if(n==5)
				stu.searchMyStudent();
			if(n==9)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}


	}


}

