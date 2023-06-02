package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAOImpl implements StudentDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("first");

	@Override

	public void saveStudent(StudentEntity entity) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(entity);
			tx.commit();
			System.out.println("persisted to the database");
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}

		finally {
			entityManager.close();
		}

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositKey compositKey) {

		EntityManager cem = factory.createEntityManager();
		StudentEntity find = cem.find(StudentEntity.class, compositKey);
		cem.close();
		
		
		
		return find;
	}

}
