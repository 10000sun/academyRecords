package org.bigdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextFile")
public class ContextFileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String readFile="/WEB-INF/testFile.txt";
		InputStream is=getServletContext().getResourceAsStream(readFile);
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		String str=reader.readLine();
		while(str!=null) {
			out.print(str+"<br/>");
			str=reader.readLine();
		}
		out.print("</body></html>");
	}
	
}
