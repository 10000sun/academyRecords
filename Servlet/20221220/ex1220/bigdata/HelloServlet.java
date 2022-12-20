package org.bigdata;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 요청");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 요청");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 요청");
	}

	@PostConstruct()
	public void initMethod() {
		System.out.println("initMethod 요청");
	}

	@PreDestroy()
	public void clean() {
		System.out.println("clean 요청");
	}
	
}
