package com.mnc.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnc.location.entity.LocationEntity;
import com.mnc.location.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locRepo;

	@Override
	public LocationEntity saveLocationDetails(LocationEntity location) {
		return locRepo.save(location);
		
	}

	@Override
	public LocationEntity updateLocationDetails(LocationEntity location) {
		return locRepo.save(location);
	}

	@Override
	public void deleteLocation(LocationEntity location) {

			locRepo.delete(location);
		
	}

//	@Override
//	public LocationEntity getLocationById(int id) {
//		 return locRepo.findB
//	}

	@Override
	public List<LocationEntity> getAllLocation() {
		
		return locRepo.findAll();
		
	}

	@Override
	public LocationEntity getLocationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
