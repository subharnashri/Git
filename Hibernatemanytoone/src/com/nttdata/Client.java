package com.nttdata;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args){
		
		Configuration cfg=new Configuration();
		cfg.configure("HibernateConfig.xml");
		
		SessionFactory fc=cfg.buildSessionFactory();
		Session session=fc.openSession();
		
		Product product=new Product();
		product.setProductId(001);
		product.setProductName("TV");
	
		
		Category c1=new Category();
		c1.setCategoryId(1);
		c1.setCategoryName("LG");
		
		Category c2=new Category();
		c2.setCategoryId(2);
		c2.setCategoryName("Sony");
		
		Category c3=new Category();
		c3.setCategoryId(3);
		c3.setCategoryName("Samsung");
		
		Category c4=new Category();
		c4.setCategoryId(4);
		c4.setCategoryName("Panasonic");
		
		
		
		Transaction tx=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		tx.commit();
		System.out.println("many to one");
		session.close();
		fc.close();
		
	}

}

