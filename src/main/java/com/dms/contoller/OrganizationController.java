package com.dms.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.Organization;
import com.dms.service.OrganizationService;

import jakarta.validation.Valid;

@RestController
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;
	
	private Logger logger = LoggerFactory.getLogger(OrganizationController.class);
	
	@PostMapping("saveOrganization")
	public Organization saveOrganization(@Valid @RequestBody Organization orgRequest) {
		logger.info(" save organization ");
		Organization organization = organizationService.saveOrganization(orgRequest);
		return organization;
	}
}
