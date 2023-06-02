package first.hibernate.client;

import first.hibernate.dao.impl.ProductDAOImpl;
import first.hibernate.entity.ProductEntity;

public class Tester {
	public static void main(String[] args) {
		ProductDAOImpl impl = new ProductDAOImpl();
		
		ProductEntity pentity = new ProductEntity();
		
		pentity.setProductId(101);
		pentity.setProductName("headset");
		pentity.setUnitPrice(250.0);
		pentity.setQuantity(10);	
		ProductEntity saveProduct = impl.saveProduct(pentity);
		System.out.println(saveProduct);
		
		
		/*
		ProductEntity pentity = new ProductEntity();
		ProductEntity loading = impl.loadProductById(101);
		System.out.println(loading);
		*/
		
		//impl.deleteProductById(101);
		
		
		
		
		
		
	}

}
