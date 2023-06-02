package Hibernate.Jpql;

import java.util.List;

public interface EmployeeDAO {
	Entity fetchEmployeeId(Integer empno);
	List<Entity> fetchEmployees();
	List<Object[]> fetchNamesAndSalaries();

}
