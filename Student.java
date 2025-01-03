package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //class level annotation//create the 
@Table(name="studentsRecord")//rename feature  and change the old to new name 
public class Student 
{
	@Id//field level annotation ,unique identification using @Id annotation present in jakarta.persistence.Entity;
	@GeneratedValue(strategy =GenerationType.IDENTITY)//Auto increment features e.g id=1...
	private int Stud_id;//autoincrement 
	private String Name;
	private int Age;
	@Column(name="Address")//field level 
	private String City;
	
	public Student()
	{	
	}
	public Student(int stud_id, String name, int age, String city) {
		super();
		Stud_id = stud_id;
		Name = name;
		Age = age;
		City = city;
	}
	public int getStud_id() {//using getter setter data is hiding
		return Stud_id;
	}
	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [Stud_id=" + Stud_id + ", Name=" + Name + ", Age=" + Age + ", City=" + City + "]";
	}

}
