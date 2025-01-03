package com.MainClass;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllRecord {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t =s.beginTransaction();
		
		CriteriaBuilder cb=s.getCriteriaBuilder();
		CriteriaQuery<Object> cq=cb.createQuery();
		Root<Student> root=cq.from(Student.class);
		cq.select(root);
		
		Query query=s.createQuery(cq);
		List<Student> list=query.getResultList();
		
		for(Student student :list)
		{
			System.out.println(student);
		}
		
	}

}
