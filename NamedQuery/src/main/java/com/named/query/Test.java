package com.named.query;

import java.util.List;

public class Test {
	public static void main(String[] args) {
	
		
		INamedQuery dao = new EmpDAOImpl();
	//	List<Entity> lst  = dao.executeNamedQuery(20);
		//lst.forEach(System.out::println);
		List list = dao.executeNamedNativeQuery(2000);
		list.forEach(System.out::println);
		
		List<Entity> lst = dao.executeCriteriaQuery();
		lst.forEach(System.out::
			println);
		
	}

}
