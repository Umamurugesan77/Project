package Employee_servlet;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Emp.java.Employee_entry;

@WebServlet(name="emp_age",urlPatterns="/age")
public class Emp_serv02 extends HttpServlet{
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String age=req.getParameter("age");
		System.out.println(age);
		ArrayList<String> namelist=new ArrayList<String>();
		Employee_entry emp=new Employee_entry();
		emp.getAge(age,namelist);
		
		for(String s:namelist)
			out.println(s);
		//RequestDispatcher dispatcher=req.getRequestDispatcher("/conform.jsp");
		//dispatcher.forward(req, resp);
		
	}
	
	
}