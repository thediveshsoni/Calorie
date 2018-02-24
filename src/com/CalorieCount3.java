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
 * Servlet implementation class CalorieCount3
 */
public class CalorieCount3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int foodd1=Integer.parseInt(request.getParameter("dinner1"));
		int foodd2=Integer.parseInt(request.getParameter("dinner2"));
		int foodd3=Integer.parseInt(request.getParameter("dinner3"));
		int d1=Integer.parseInt(request.getParameter("d1"));
		int d2=Integer.parseInt(request.getParameter("d2"));
		int d3=Integer.parseInt(request.getParameter("d3"));
		
		UserBean ub=new UserBean();
		
		ub.setFoodd1(foodd1);
		ub.setFoodd2(foodd2);
		ub.setFoodd3(foodd3);
		
		ub.setD1(d1);
		ub.setD2(d2);
		ub.setD3(d3);
		
		UserDao mp=new UserDao();
		int consumed=mp.caloriecount3(ub);
		ub.setConsumed(consumed);
		//mp.entrycal(ub);
		int remaining=ub.getKcal()-consumed;
		ub.setRemaining(remaining);
		
		HttpSession session=request.getSession();
		session.setAttribute("con3", consumed);
		
		//request.setAttribute("q",consumed);
		//request.setAttribute("r",remaining );
		
		RequestDispatcher dis=request.getRequestDispatcher("NewFile2.jsp");
		dis.forward(request, response);
	}

}
