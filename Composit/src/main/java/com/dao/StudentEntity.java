package com.dao;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class StudentEntity {
	

	public StudentCompositKey getCompositkey() {
		return compositkey;
	}


	public void setCompositkey(StudentCompositKey compositkey) {
		this.compositkey = compositkey;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	
	@EmbeddedId
	private StudentCompositKey compositkey;
	
	@Column(name="sname")
	private String StudentName;
	

	private Integer marks;

	
	
	
}
