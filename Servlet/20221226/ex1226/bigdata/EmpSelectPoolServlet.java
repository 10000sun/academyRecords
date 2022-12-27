package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpSelectPool")
public class EmpSelectPoolServlet extends HttpServlet {

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

	
}
