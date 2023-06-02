package first.hibernate.dao;

import first.hibernate.entity.ProductEntity;

public interface ProductInterface   {

	ProductEntity saveProduct (ProductEntity product);
	
	ProductEntity loadProductById (Integer productId);
	
	
			ProductEntity updateProductById(Integer productId, Double new_Unit_price);
				
			
			
	void deleteProductById (Integer productId);
	
	
	
	
	
	
	
	
	
	
}
