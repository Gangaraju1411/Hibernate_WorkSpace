package com.procedure.query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

public class EmpDAOImpl implements  EmpDAO {

	 private EntityManagerFactory factory = Persistence.createEntityManagerFactory("first");
	 
	 
	@Override
	public void executeProcedure(int empno) {
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery query = em.createStoredProcedureQuery("pro1");
	    query.setParameter("eno", empno);
	    EntityTransaction tx = em.getTransaction();
	    tx.begin();
	    query.execute();
	   String s1 = (String) query.getOutputParameterValue("name");
	    double d1 = (Double)query.getOutputParameterValue("experience");
	    System.out.println("Name:"+s1);;
	    System.out.println("Experience:"+d1);
	    tx.commit();

	    em.close();
	    factory.close();
	
	
	}

}
