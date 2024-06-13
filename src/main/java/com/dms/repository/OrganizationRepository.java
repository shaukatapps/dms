package com.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

	Organization findByName(String name);
}
