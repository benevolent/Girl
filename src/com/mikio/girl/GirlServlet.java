package com.mikio.girl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class GirlServlet extends HttpServlet {
	
	private String name;
	private int height;
	private String jaw;
	private String ages[];
	private String attributes[];
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
			
		//name = req.getParameter("name");
		//height = req.getParameter("height");
		jaw = req.getParameter("jaw");
		ages = req.getParameterValues("age");
		attributes = req.getParameterValues("attributes"); 
		
		name = checkStringParameter(req, name,"name");
		height = checkIntegerParameter(req, height,"height");
		
		req.setAttribute("name", name);
		req.setAttribute("height", height);
		req.setAttribute("jaw", jaw);
		req.setAttribute("age", ages);
		req.setAttribute("attributes", attributes);
		
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = 
				context.getRequestDispatcher("/check.jsp");
		dispatcher.forward(req, resp);
	}
	private String checkStringParameter(HttpServletRequest req, String check,String arg){
		String tmp;
		tmp = req.getParameter(""+arg+"");
		if (tmp == null || tmp.length() == 0){
			tmp = "値が入力されていません。";
			check = tmp;
			return check;
		} else {
			check = tmp;
			return check;
		}
	}
	private int checkIntegerParameter(HttpServletRequest req,int check,String arg){
		String tmp;
		check = 0;
		tmp = req.getParameter(""+arg+"");
		try {
			check = Integer.parseInt(tmp);
			return check;
		} catch (NumberFormatException e) {
			return check;
		}
	}
}
