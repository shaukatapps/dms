package com.dms.serviceimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.dao.OrganizationDao;
import com.dms.model.Organization;
import com.dms.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	public OrganizationDao organizationDao;
	
	public Serializable saveOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return (Serializable) organizationDao.save(organization);
	}

	
}
