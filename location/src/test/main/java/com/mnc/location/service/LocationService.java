package com.mnc.location.service;

import java.util.List;


import com.mnc.location.entity.LocationEntity;

public interface LocationService {
	
	
	LocationEntity saveLocationDetails(LocationEntity locatin);
	LocationEntity updateLocationDetails(LocationEntity location);
	void deleteLocation(LocationEntity location);
        
        List<LocationEntity> getAllLocation();
		LocationEntity getLocationById(int id);
        
}
