package com.named.query;

import java.util.List;


public interface INamedQuery {
	
	List<Entity>  executeNamedQuery(int deptno);
	List executeNamedNativeQuery(int sal);
	List<Entity> executeCriteriaQuery();
	
	
	
}
