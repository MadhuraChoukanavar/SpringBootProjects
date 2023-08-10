package com.mnc.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mnc.location.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {

	 
}
