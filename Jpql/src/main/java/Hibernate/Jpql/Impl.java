package Hibernate.Jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;

public class Impl implements EmployeeDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("query");

	@Override
	public Entity fetchEmployeeId(Integer empno) {

		EntityManager em = factory.createEntityManager();
		TypedQuery<Entity> tq = em.createQuery(Constants.QUERY1, Entity.class);
		tq.setParameter(1, empno);
		Entity e = tq.getSingleResult();
		em.close();
		return e;

	}

	@Override
	public List<Entity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Entity> tq = em.createQuery(Constants.QUERY2, Entity.class);
		List<Entity> resultList = tq.getResultList();
		em.close();
		return resultList;
		
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(Constants.QUERY3, Object[].class);
		List<Object[]> lst = tq.getResultList();
		em.close();
		return lst;
	}

}
