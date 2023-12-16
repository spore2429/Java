package day0710;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizConnectNewBoard {

	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectSnsBoard()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from snsboard";
	
		try {
			conn=DriverManager.getConnection(URL, "hwan", "a1234");
			System.out.println("클라우드 오라클 서버 연결성공!!");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("번호\t글쓴이\t제목\t\t내용\t\t날짜");
			
			while(rs.next())
			{
				int b_num=rs.getInt("b_num");
				String nick=rs.getString("nick");
				String subject=rs.getString("subject");
				String content=rs.getString("content");
				String wday=rs.getString("wday");
				
				System.out.println(b_num+"\t"+nick+"\t"+subject+"\t\t"+content+"\t\t"+wday);
				
			}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuizConnectNewBoard oc=new QuizConnectNewBoard();
		oc.connectSnsBoard();
		
		
	}
	
}
