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
 * Servlet implementation class CalorieCount2
 */
public class CalorieCount2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int foodl1=Integer.parseInt(request.getParameter("lunch1"));
		int foodl2=Integer.parseInt(request.getParameter("lunch2"));
		int foodl3=Integer.parseInt(request.getParameter("lunch3"));
		int l1=Integer.parseInt(request.getParameter("l1"));
		int l2=Integer.parseInt(request.getParameter("l2"));
		int l3=Integer.parseInt(request.getParameter("l3"));
		
		UserBean ub=new UserBean();
		
		ub.setFoodl1(foodl1);
		ub.setFoodl2(foodl2);
		ub.setFoodl3(foodl3);
		
		ub.setL1(l1);
		ub.setL2(l2);
		//ub.setL2(l2);
		ub.setL3(l3);
		
		UserDao mp=new UserDao();
		int consumed=mp.caloriecount2(ub);
		ub.setConsumed(consumed);
		//mp.entrycal(ub);
		int remaining=ub.getKcal()-consumed;
		ub.setRemaining(remaining);
		
		HttpSession session=request.getSession();
		session.setAttribute("con2", consumed);
		
	//	request.setAttribute("q",consumed);
		//request.setAttribute("r",remaining );
		
		RequestDispatcher dis=request.getRequestDispatcher("NewFile1.jsp");
		dis.forward(request, response);
	}

}
