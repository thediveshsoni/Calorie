package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDao;

/**
 * Servlet implementation class CalorieCount
 */
public class CalorieCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int sn;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sn++;
		int foodb1=Integer.parseInt(request.getParameter("breakfast1"));
		int foodb2=Integer.parseInt(request.getParameter("breakfast2"));
		int foodb3=Integer.parseInt(request.getParameter("breakfast3"));
		
		
		int b1=Integer.parseInt(request.getParameter("b1"));
		int b2=Integer.parseInt(request.getParameter("b2"));
		int b3=Integer.parseInt(request.getParameter("b3"));
		
		
		
		UserBean ub=new UserBean();
		
		ub.setSn(sn);
		ub.setFoodb1(foodb1);
		ub.setFoodb2(foodb2);
		ub.setFoodb3(foodb3);
		
		ub.setB1(b1);
		ub.setB2(b2);
		ub.setB3(b3);
		
		
		
		UserDao mp=new UserDao();
		
		//for consumed calories
				int consumed=mp.caloriecount(ub);
				ub.setConsumed(consumed);
				//mp.entrycal(ub);
				int remaining=ub.getKcal()-consumed;
				ub.setRemaining(remaining);
				
				HttpSession session=request.getSession();
				session.setAttribute("con", consumed);
				
				//request.setAttribute("q",consumed);
				//request.setAttribute("r",remaining );
				
				RequestDispatcher dis=request.getRequestDispatcher("NewFile.jsp");
				dis.forward(request, response);
	}

}
