package Hibernate.Jpql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="employee")
public class Entity {
	@Id
	@Column(name="empid")
	private Integer empNumber;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="empsalary")
	private Integer salary;
	
	@Column
	private Integer deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "Entity [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary + ", deptNumber="
				+ deptNumber + "]";
	}
	
	
	

}
