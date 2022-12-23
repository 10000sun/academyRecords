package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpInsert")
public class EmpInsertServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		int empno = Integer.parseInt(req.getParameter("empno"));
		String ename = req.getParameter("ename");
		String job = req.getParameter("job");
		int mgr = Integer.parseInt(req.getParameter("mgr"));
		String hiredate = req.getParameter("hiredate");
		int sal = Integer.parseInt(req.getParameter("sal"));
		int comm = Integer.parseInt(req.getParameter("comm"));
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/shop?characterEncoding=UTF-8&serverTimezone=UTC";
			String userid="root";
			String passwd="12345";
			
			Connection conn=null;
			Statement stmt=null;
			
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, userid, passwd);
				stmt=conn.createStatement();
				String query="INSERT INTO emp VALUES "+"('"+empno+"','"+ename+"','"+job+"','"+mgr+"','"+hiredate+"','"+sal+"','"+comm+"','"+deptno+"')";
				int n=stmt.executeUpdate(query);
				
				if(n==1) {
					out.print("저장 성공!!");
				} else {
					out.print("저장 실패!!");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		out.print("</body></html>");
		
	}

}
