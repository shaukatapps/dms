package com.dms.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dms.Exception.ApplicationException;
import com.dms.model.Location;
import com.dms.model.Organization;
import com.dms.service.LocationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/dms")
public class LocationController {
	
	private Logger logger = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private LocationService locationService;
	
	@PostMapping("saveLocation")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Location saveLocation(@Valid @RequestBody Location locRequest) {
		logger.info(" save location ");
		Location location = null;
		location = locationService.getLocationByName(locRequest);
		if (location == null) {
			location = locationService.saveLocation(locRequest);
		} else {
			logger.info("Location exists!");
			throw new ApplicationException("Location-already-exists", "Location Already Exists!!", HttpStatus.FOUND);
		}
		return location;
	}
}
