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
import com.dms.model.Organization;
import com.dms.service.OrganizationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/dms")
public class OrganizationController {

	private Logger logger = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	private OrganizationService organizationService;

	@PostMapping("saveOrganization")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Organization saveOrganization(@Valid @RequestBody Organization orgRequest) throws Exception {
		logger.info(" save organization ");
		Organization organization = null;
		organization = organizationService.getOrganizationByName(orgRequest);
		if (organization == null) {
			organization = organizationService.saveOrganization(orgRequest);
		} else {
			logger.info("organization exists!");
			throw new ApplicationException("Hospital-already-exists", "Hospital Already Exists!!", HttpStatus.FOUND);
		}
		return organization;
	}
}
