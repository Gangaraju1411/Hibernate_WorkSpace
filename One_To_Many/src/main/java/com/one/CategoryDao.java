package com.one;

public interface CategoryDao {

	
	void saveCategory(CategoryEntity entity);
	CategoryEntity fetchCategory (Integer categoryId);
	void removeCategory(Integer categoryId);
	
	
}
