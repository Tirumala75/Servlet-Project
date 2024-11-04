package com.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dto.Student;
import com.demo.service.StudentService;



@WebServlet("/SaveStudent")
public class SaveController extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		Student s=new Student();
		s.setName(req.getParameter("name"));
		s.setAge(Integer.parseInt(req.getParameter("age")));
		s.setGender(req.getParameter("gender"));
		
		StudentService ss=new StudentService();
		Student s1=ss.saveStudent(s);
		
		if(s1!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("SaveStudent.jsp");
			rd.include(req, res);
		}

		
		
		}
		
		
		
	}
	


