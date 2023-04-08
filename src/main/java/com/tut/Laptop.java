package com.tut;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lname;

	// @ManyToMany
	// private List<Student> std = new ArrayList<Student>();

	@ManyToOne
	private Alien alien;

	public Alien getAlien() {
		return alien;
	}

	public void setAlien(Alien alien) {
		this.alien = alien;
	}

	// public List<Student> getStd() {
//		return std;
//	}
//	public void setStd(List<Student> std) {
//		this.std = std;
//	}
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
