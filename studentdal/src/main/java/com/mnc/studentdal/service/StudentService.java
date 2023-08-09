package com.mnc.studentdal.service;

import java.util.List;

import com.mnc.studentdal.entity.StudentDetails;

public interface StudentService {
	
	
	StudentDetails saveStudent (StudentDetails studentDetails);
	StudentDetails updateStudent (StudentDetails studentDetails);
	void deleteStudent (StudentDetails studentDetails);
	
	      List<StudentDetails> findAllStudents();
}
