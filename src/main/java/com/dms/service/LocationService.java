package com.dms.service;

import com.dms.model.Location;
import com.dms.model.Organization;

import jakarta.validation.Valid;

public interface LocationService {

	public Location saveLocation(Location location);
	
	public Location getLocationByName(@Valid Location locRequest);
}
