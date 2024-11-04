package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dto.Student;

public class StudentService {
	StudentDao dao=new StudentDao();
	public Student saveStudent(Student s) {
		return dao.saveStudent(s);
		
		
	}

}
