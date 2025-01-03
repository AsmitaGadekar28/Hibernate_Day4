package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class GetSingleRecord {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
	
		int Stud_id=2;
		
		Student s1=s.get(Student.class, Stud_id);
		 
		s.close();
		System.out.println(s1);
		System.out.println("Data is Get Successfully");

	}

}
