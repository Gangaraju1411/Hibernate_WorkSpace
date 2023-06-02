package first.hibernate.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import first.hibernate.dao.ProductInterface;
import first.hibernate.entity.ProductEntity;

public class ProductDAOImpl implements ProductInterface {

  private EntityManagerFactory factory =  Persistence.createEntityManagerFactory("first");
	
	
	@Override
	public ProductEntity saveProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try {
			entityManager.persist(product);
			tx.commit();
			System.out.println("Product is inserted");
		}catch(Exception e) {
			tx.rollback();
			System.out.println(" Error in inserting");
		}
		finally {
			entityManager.close();
		}
		
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager  entityManager = factory.createEntityManager();
		ProductEntity p = entityManager.find(ProductEntity.class, productId);
		entityManager.close();
		
		return p;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_Unit_price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductById(Integer productId) {

		EntityManager entityManager = factory.createEntityManager();
		ProductEntity find = entityManager.find(ProductEntity.class, productId);
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.remove(find);
		tx.commit();
		entityManager.close();
		
		
		
		
	}

}
