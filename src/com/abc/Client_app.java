package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_app 
{

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg=cfg.configure("com/abc/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEid(529);
		e1.setEname("Mahesh");
		e1.setEaddress("10000");
		
		ses.save(e1);
		tx.commit();
		
		System.out.println("Success");
		
		
		
		

	}

}
