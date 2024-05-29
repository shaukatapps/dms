package com.dms.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.model.Organization;
import com.dms.service.OrganizationService;

@RestController
public class OrganizationController {
	
	@Autowired
	public OrganizationService organizationService;
	
	@PostMapping("saveOrganization")
	public void saveOrganization(@RequestBody Organization organization) {
		System.out.println("save org  "+organization.getName());
		
		organizationService.saveOrganization(organization);
	}

}
