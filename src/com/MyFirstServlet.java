package com;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.UserBean;
import dao.UserDao;

public class MyFirstServlet extends HttpServlet {
	int sno;
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sno++;
		String email=request.getParameter("email");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		int feet=Integer.parseInt(request.getParameter("hfeet"));
		int inches=Integer.parseInt(request.getParameter("hinch"));
		int activity=Integer.parseInt(request.getParameter("activity"));
		int weight=Integer.parseInt(request.getParameter("weight"));
		int eweight=Integer.parseInt(request.getParameter("eweight"));
		int time=Integer.parseInt(request.getParameter("time"));
		String future=request.getParameter("gain");
		
		UserBean ub=new UserBean();
		ub.setFeet(feet);
		ub.setInches(inches);
		int height=(int) ((ub.getFeet()*30.48)+(ub.getInches()*2.54));
		ub.setSno(sno);
		ub.setEmail(email);
		ub.setAge(age);
		ub.setHeight(height);
		ub.setGender(gender);
		ub.setActivity(activity);
		ub.setWeight(weight);
		ub.setEweight(eweight);
		ub.setTime(time);
		ub.setFuture(future);
		
		UserDao ud=new UserDao();
		
		//For entering data into database
		ud.entry(ub);
		
		//for calculating bmr and kcal
		int kcal=ud.nutrition(ub);
		ub.setKcal(kcal);
		System.out.println(kcal);
		
		HttpSession session=request.getSession();
		session.setAttribute("a", kcal);
		
		RequestDispatcher dis=request.getRequestDispatcher("Calorie.jsp");
		dis.forward(request, response);
		
		
		
		
		
		
	}

}
