package com.dms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.dao.OrganizationDao;
import com.dms.model.Organization;
import com.dms.service.OrganizationService;
import com.dms.utils.DateTimeGenerator;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	public OrganizationDao organizationDao;
	
	public Organization saveOrganization(Organization organization) {
		organization.setCreatedOn(DateTimeGenerator.getCurrentDate());
		return organizationDao.save(organization);
	}

}
