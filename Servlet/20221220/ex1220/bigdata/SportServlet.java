package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sport")
public class SportServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String sports[]=req.getParameterValues("sports");
		String gender=req.getParameter("gender");
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		for(String sport : sports) {
			out.print("좋아하는 운동 : " + sport +"<br/>");
		}
		out.print("성별 : "+gender +"<br/>");
		out.print("</body></html>");
	}

	
}
