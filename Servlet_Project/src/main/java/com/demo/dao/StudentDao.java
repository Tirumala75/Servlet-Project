package com.demo.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.dto.Student;



public class StudentDao {
	public Student saveStudent(Student s) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if(s!=null);{
		et.begin();
		em.persist(s);
		et.commit();
		}
		return s;
		
		
	}

}
