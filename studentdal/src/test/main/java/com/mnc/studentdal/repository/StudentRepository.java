package com.mnc.studentdal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.mnc.studentdal.entity.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long> {

}
