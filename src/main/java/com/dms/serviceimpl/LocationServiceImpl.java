package com.dms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.model.Location;
import com.dms.repository.LocationRepository;
import com.dms.service.LocationService;
import com.dms.utils.DateTimeGenerator;

import jakarta.validation.Valid;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationDao;

	@Override
	public Location saveLocation(Location location) {
		location.setCreatedOn(DateTimeGenerator.getCurrentDate());
		return locationDao.save(location);
	}

	@Override
	public Location getLocationByName(@Valid Location locRequest) {
		// TODO Auto-generated method stub
		return locationDao.findByName(locRequest.getName());
	}

}
