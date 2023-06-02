package com.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LoanDAOImpl implements LoanDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("first");
	
	
	@Override
	public void saveLoan(LoanEntity loan) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(loan);
			tx.commit();
			System.out.println("persisted successfully");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		
		
		
		
	}

	@Override
	public LoanEntity fetchLoanDetailsById(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		LoanEntity loan = em.find(LoanEntity.class,loanId);
		em.clear();
		return loan;
		
		
		
		
	}

	@Override
	public void removeLoan(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			LoanEntity loanEntity = em.find(LoanEntity.class,loanId);
			/*
			 * whenever we want to remove an object using JPA/Hibernate , 
			 * first we need to fetch that object and do remove operation
			 */
			em.remove(loanEntity);
			tx.commit();
			System.out.println("loan object is deleted!!!");
			
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		
		
	}

	
	
	
	
	
}
