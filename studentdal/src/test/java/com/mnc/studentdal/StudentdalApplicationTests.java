package com.mnc.studentdal;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mnc.studentdal.entity.StudentDetails;
import com.mnc.studentdal.repository.StudentRepository;

@SpringBootTest
 class StudentdalApplicationTests {
	@Autowired
	private StudentRepository repo;
	@Test
	void TestcreateStudent() {
		StudentDetails s1=new StudentDetails("kittur",3000);
		StudentDetails s2=new StudentDetails("chetana",5000);
		repo.save(s1);
		repo.save(s2);
		 }
	@Test
	void findStudentById()
	{
		StudentDetails studentDetails = repo.findById(1l).get();
		System.out.println(studentDetails);
	}
	@Test
	void updateStudentById()
	{
		StudentDetails studentDetails = repo.findById(1l).get();
		studentDetails.setStudentFee(400000);
		repo.save(studentDetails);
	}
	@Test
	void deleteStudents()
	{
		repo.deleteAll();
	}
}

