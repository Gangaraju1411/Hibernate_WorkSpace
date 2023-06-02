package com.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CategoryImpl implements CategoryDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("first");

	public void saveCategory(CategoryEntity entity) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("persisted success");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	public CategoryEntity fetchCategory(Integer categoryId) {

		EntityManager em = factory.createEntityManager();
		CategoryEntity entity = em.find(CategoryEntity.class, categoryId);
		em.close();

		return entity;
	}

	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		CategoryEntity entity = em.find(CategoryEntity.class, categoryId);
		
		tx.begin();
		try {
			em.remove(entity);
			tx.commit();
			System.out.println("removed");
			
		}catch(Exception e ) {
			tx.rollback();
			e.printStackTrace();
			
		}finally {
			em.close();
		}

		
		
		
		
		
		
		
		
		
		
	}

}
