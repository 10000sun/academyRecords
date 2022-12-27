package org.bigdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EmpDAO {
//	String driver="com.mysql.cj.jdbc.Driver";
//	String url="jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
//	String userid="root";
//	String passwd="12345";
	
//	public EmpDAO() {
//		try {
//			Class.forName(driver);
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public ArrayList<EmpDTO> select() {
//		
//		ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
//		Connection conn=null;
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
//		
//		try {
//			conn=DriverManager.getConnection(url, userid, passwd);
//			String query="SELECT * FROM emp";
//			pstmt=conn.prepareStatement(query);
//			rs=pstmt.executeQuery();
//			
//			while(rs.next()) {
//				int empno=rs.getInt("empno");
//				String ename=rs.getString("ename");
//				String job=rs.getString("job");
//				int mgr=rs.getInt("mgr");
//				String hiredate=rs.getString("hiredate");
//				int sal=rs.getInt("sal");
//				int comm=rs.getInt("comm");
//				int deptno=rs.getInt("deptno");
//				
//				EmpDTO dto=new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
//				//EmpDTO dto=new EmpDTO();
//				//dto.setEmpno(empno);
//				list.add(dto);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(rs!=null) rs.close();
//				if(pstmt!=null) pstmt.close();
//				if(conn!=null) conn.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return list;
//	}
	
	DataSource dataFactory;
	
	public EmpDAO() {
		try {
			Context ctx=new InitialContext();
			dataFactory=(DataSource)ctx.lookup("java:comp/env/jdbc/Mysql8");
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<EmpDTO> select() {
		
		ArrayList<EmpDTO> list=new ArrayList<EmpDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=dataFactory.getConnection();
			String query="SELECT * FROM emp";
			pstmt=conn.prepareStatement(query);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				int mgr=rs.getInt("mgr");
				String hiredate=rs.getString("hiredate");
				int sal=rs.getInt("sal");
				int comm=rs.getInt("comm");
				int deptno=rs.getInt("deptno");
				
				EmpDTO dto=new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				//EmpDTO dto=new EmpDTO();
				//dto.setEmpno(empno);
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}












