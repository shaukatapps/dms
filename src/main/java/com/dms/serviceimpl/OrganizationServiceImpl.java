package com.dms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.model.Organization;
import com.dms.repository.OrganizationRepository;
import com.dms.service.OrganizationService;
import com.dms.utils.DateTimeGenerator;

import jakarta.validation.Valid;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	public OrganizationRepository organizationDao;

	public Organization saveOrganization(Organization organization) {
		organization.setCreatedOn(DateTimeGenerator.getCurrentDate());
		return organizationDao.save(organization);
	}

	@Override
	public Organization getOrganizationByName(@Valid Organization orgRequest) {
		// TODO Auto-generated method stub
		return organizationDao.findByName(orgRequest.getName());
	}

}
