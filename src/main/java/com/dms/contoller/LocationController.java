package com.dms.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.Location;
import com.dms.service.LocationService;

import jakarta.validation.Valid;

@RestController
public class LocationController {
	
	private Logger logger = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private LocationService locationService;
	
	@PostMapping("saveLocation")
	public Location saveLocation(@Valid @RequestBody Location location) {
		logger.info(" save location ");
		return locationService.saveLocation(location);
	}
}
