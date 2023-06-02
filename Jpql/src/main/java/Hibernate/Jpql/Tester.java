package Hibernate.Jpql;

public class Tester {
	public static void main(String[] args) {
		
		
		EmployeeDAO dao = new Impl();
		Entity emp = dao.fetchEmployeeId(101);
		System.out.println(emp);
		
		
		
		
		
		
		
		
		
		
	}

}
