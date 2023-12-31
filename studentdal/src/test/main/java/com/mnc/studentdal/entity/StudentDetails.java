package com.mnc.studentdal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentDetails {
	
	@Id
	//@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private long studentId;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_fee")
	private long studentFee;
	
	
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(long studentFee) {
		this.studentFee = studentFee;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ "]";
	}
	public StudentDetails(String studentName, long studentFee) {
		super();
		this.studentName = studentName;
		this.studentFee = studentFee;
	}
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	

}
