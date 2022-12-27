package org.bigdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartSave")
public class CartSaveServlet extends HttpServlet {

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
		
		String product=req.getParameter("product");
		HttpSession session=req.getSession();
		ArrayList<String> list=(ArrayList<String>)session.getAttribute("product");
		if(list==null) {
			list=new ArrayList<String>();
			list.add(product);
			session.setAttribute("product", list);
		}else {
			list.add(product);
		}
		
		out.print("<html><body>");
		out.print("Product 추가");
		out.print("<a href='CartBasket'>장바구니 보기</a>");
		out.print("</body></html>");
	}

	
}
