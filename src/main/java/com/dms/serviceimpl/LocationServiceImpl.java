package com.dms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.dao.LocationDao;
import com.dms.model.Location;
import com.dms.service.LocationService;
import com.dms.utils.DateTimeGenerator;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationDao locationDao;

	@Override
	public Location saveLocation(Location location) {
		location.setCreatedOn(DateTimeGenerator.getCurrentDate());
		return locationDao.save(location);
	}

}
