package com.xworkz.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.springmvc.dto.CalamitieDTO;

public class CalamitieDAOImpl implements CalamitieDAO{

	
	private SessionFactory factory;

	public CalamitieDAOImpl() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@Override
	public void create(CalamitieDTO dto) {
		System.out.println("invoked create method in CalamitieDAOImpl" + dto);
		Session session = null;
		try {
			System.out.println("creating session object");
			session = factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			System.out.println("End:create in CalamitieDAOImpl" + dto);
		} catch (Exception e) {
			System.err.println("Exception in create method in CalamitieDAOImpl " + e.getMessage());
			session.getTransaction().rollback();
		} finally {
			session.close();
			System.out.println("session closed");
		}

		
	}

}
