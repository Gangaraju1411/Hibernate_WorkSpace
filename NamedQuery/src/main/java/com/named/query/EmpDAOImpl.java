package com.named.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class EmpDAOImpl implements INamedQuery {

	private EntityManagerFactory factory =Persistence.createEntityManagerFactory("first");
	@Override
	public List<Entity> executeNamedQuery(int deptno) {
		EntityManager em = factory.createEntityManager();

		TypedQuery<Entity> tq = em.createNamedQuery("query1",Entity.class);
		tq.setParameter(1, deptno);
		List<Entity> lst = tq.getResultList();
		em.close();
		return lst;
	}

	@Override
	public List executeNamedNativeQuery(int sal) {
		EntityManager em = factory.createEntityManager();
		Query q = em.createNamedQuery("query2");
		q.setParameter(1,sal);
		List lst = q.getResultList();
		em.close();
		return lst;
		
	
			
		}

	@Override
	public List<Entity> executeCriteriaQuery() {

		EntityManager entityManager = factory.createEntityManager();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		 CriteriaQuery<Entity> q = cb.createQuery(Entity.class);
		 Root<Entity> r = q.from(Entity.class);
		 q.select(r).where(cb.and(cb.gt(r.get("salary"),40000),  cb.lt(r.get("salary"),60000)));
		 TypedQuery<Entity> query = entityManager.createQuery(q);
		 List<Entity> lst = query.getResultList();
		
		return lst;
	}
		
		

}
