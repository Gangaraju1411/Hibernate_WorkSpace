package com.procedure.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQuery(
		// this name can be anything
		name = "pro1", procedureName = "emp_experience", parameters = {

				@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "eno"),
				@StoredProcedureParameter(mode = ParameterMode.OUT, type = String.class, name = "name"),
				@StoredProcedureParameter(mode = ParameterMode.OUT, type = Double.class, name = "experience"),

		}

)


public class EmpEntity {

	@Id
	@Column(name="empno")
	private Integer empnumber;
	
	public Integer getEmpnumber() {
		return empnumber;
	}

	public void setEmpnumber(Integer empnumber) {
		this.empnumber = empnumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Column(name="ename")
	private String empName;
	
	@Column(name="Sal")
	private Double salary;
	
	@Column(name="deptno")
	private Integer deptNumber;

	@Override
	public String toString() {
		return "EmpEntity [empnumber=" + empnumber + ", empName=" + empName + ", salary=" + salary + ", deptNumber="
				+ deptNumber + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
