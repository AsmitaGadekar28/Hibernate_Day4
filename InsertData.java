package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");//class
		cfg.addAnnotatedClass(Student.class);//class
		
		SessionFactory sf=cfg.buildSessionFactory();//interface
		Session s= sf.openSession();//interface
		Transaction t =s.beginTransaction();//interface
		
		Student std= new Student();//constructor
		
		std.setName("Aniket");
		std.setAge(27);
		std.setCity("goa");
		
		s.save(std);//persist()store the object
		System.out.println(std);// print the console output
		t.commit();//or close() close the transation
		
		System.out.println("Data is inserted Successfully");
		
	}

}
