package com.dms.service;

import com.dms.model.Organization;

import jakarta.validation.Valid;

public interface OrganizationService {

	public Organization saveOrganization(Organization organization);

	public Organization getOrganizationByName(@Valid Organization orgRequest);
}
