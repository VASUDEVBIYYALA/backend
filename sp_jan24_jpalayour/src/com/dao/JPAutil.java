package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JPAutil {
	
	private static EntityManagerFactory factoy;
	private static EntityManager entity;
	
	static {
		factoy =Persistence.createEntityManagerFactory("vasu");
	}
	public static EntityManager getEntityManager() {
		if(entity==null || !entity.isOpen())
		{
			entity = factoy.createEntityManager();
		}
		return entity;
		
	}

}
