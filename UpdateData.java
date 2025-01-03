package com.MainClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t =s.beginTransaction();
		
		int Stud_id=4;
		Student s1=s.get(Student.class, Stud_id);
		s1.setName("Shresha");
		s1.setAge(24);
		s1.setCity("Mumbai");
		
		//s.merge("Navi-Mumbai");//combining something
		s.update(s1);//Update the particular fields 
		t.commit();
		s.close();
		System.out.println("Data is Updated Successfully");
	}

}
