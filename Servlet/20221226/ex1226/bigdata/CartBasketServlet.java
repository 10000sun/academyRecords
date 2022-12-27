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

@WebServlet("/CartBasket")
public class CartBasketServlet extends HttpServlet {

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
		out.print("장바구니 리스트");
		HttpSession session=req.getSession(false);
		if(session!=null) {
			ArrayList<String> list=(ArrayList<String>)session.getAttribute("product");
			out.print("상품 : " + list + "<br/>");
		}else {
			out.print("세션 없음" + "<br/>");
		}
		out.print("<a href='product.html'>상품 선택 페이지</a>");
		out.print("<a href='CartDelete'>장바구니 비우기</a>");
		out.print("</body></html>");
	}

}
