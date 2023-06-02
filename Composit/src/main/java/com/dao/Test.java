package com.dao;

public class Test {
public static void main(String[] args) {
	
	
	StudentDAO dao = new StudentDAOImpl();
	
		StudentCompositKey compositKey = new StudentCompositKey();
		compositKey.setRollNumber(101);
		compositKey.setSection("A");
		
		StudentEntity entity = new StudentEntity();
		entity.setCompositkey(compositKey);
		entity.setStudentName("raju");
		entity.setMarks(500);
		
		dao.saveStudent(entity);
	
	
	
	
	
	
}
}
