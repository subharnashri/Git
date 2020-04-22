package com.ntt.mavenHibernate188997;

public class Client {

	public static void main(String[] args) {
	/*	SessionFactory fc=cfg.buildSessionFactory();
		Session session=fc.openSession();
		*/
		Product product=new Product();
		product.setProductId(001);
		product.setProductName("TV");
	
		
		Category c1=new Category();
		c1.setCategoryId(1);
		c1.setCategoryName("LG");

	}

}
