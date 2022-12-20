package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="InitParamAnnoServlet", urlPatterns= {"/initParam"}, initParams= {@WebInitParam(name="dirPath", value="d:\\test"), @WebInitParam(name="userId", value="admin")})
public class InitParamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dirPath=getInitParameter("dirPath");
		String userId=getInitParameter("userId");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("디렉터리경로 :" + dirPath + "<br/>");	
		out.print("사용자아이디 :" + userId + "<br/>");
		out.print("</body></html>");
	}

	
}
