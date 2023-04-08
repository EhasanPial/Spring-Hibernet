package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	public static void main(String[] args) {
		/*
		 * Alien alien = new Alien(); AlienName an = new AlienName();
		 * an.setFname("Ehashan"); an.setLname("Pial"); an.setMname("Ahmed");
		 * 
		 * alien.setAid(2);
		 * 
		 * alien.setColor("white"); alien.setAname(an);
		 */
		
		/*
		 * Laptop laptop = new Laptop() ; laptop.setLid(1) ; laptop.setLname("Dell") ;
		 * Student student = new Student() ; student.setName("Pial");
		 * student.setMarks(60); student.setRollno(40); student.getLaptop().add(laptop);
		 * 
		 * laptop.getStd().add(student) ;
		 */
		
		Alien a= new Alien() ;
		a.setAid(1);
		a.setAname("Pial") ; 
		a.setColor("White") ; 
		
		Alien a1 = new Alien() ;
		a1.setAid(2);
		a1.setAname("TTT") ; 
		a1.setColor("BLack") ; 
		
		Laptop l1 = new Laptop() ; 
		l1.setAlien(a);
		l1.setLid(1) ;
		l1.setLname("Dell") ;
		
		Laptop l2 = new Laptop() ; 
		l2.setAlien(a1);
		l2.setLid(2) ;
		l2.setLname("Asus") ;

		Configuration con = new Configuration().configure()
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Alien.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(a);
		session.save(a1);
		session.save(l1) ; 
		session.save(l2) ;

		// alien= (Alien) session.get(Alien.class, 2);
		//System.out.println(alien);
		
		//session.save(laptop); 
		//session.save(student) ;
		
		tx.commit();

	}
}
