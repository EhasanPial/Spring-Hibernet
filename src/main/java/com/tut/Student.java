package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.ArrayList; 
import java.util.List;


@Entity
public class Student {
	@Id
	private int rollno; 
	private String name;
	private int marks;
	
	@ManyToMany(mappedBy = "std") // student tension not mapped will be done by laptop means laptop will create mapping table
	private List<Laptop> laptop = new ArrayList<Laptop>(); 
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
