package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/EmpSelectPoolAnno")
public class EmpSelectPoolAnno extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpDTO> list=dao.select();
		
		for(EmpDTO dto : list) {
			int empno=dto.getEmpno();
			String ename=dto.getEname();
			String job=dto.getJob();
			int mgr=dto.getMgr();
			String hiredate=dto.getHiredate();
			int sal=dto.getSal();
			int comm=dto.getComm();
			int deptno=dto.getDeptno();
			out.print(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno+"<br/>");
		}
		out.print("</body></html>");
	}
	
	@Resource(name="jdbc/Mysql8") 
	
	DataSource dataFactory;
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
