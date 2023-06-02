package com.dao;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositKey implements Serializable {
	/* 
	 * serializable interface is marker interface
	 * we have to write composition primary key columns in separate class i.e embeddable class
	 */
	
	
	@Column(name="ROLLNO")
	private Integer rollNumber;
	
	@Column(name="SECTION")
	private String section;

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNumber, section);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentCompositKey other = (StudentCompositKey) obj;
		return Objects.equals(rollNumber, other.rollNumber) && Objects.equals(section, other.section);
	}
	
	
	

}
