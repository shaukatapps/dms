package com.dms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.model.Organization;

public interface OrganizationDao extends JpaRepository<Organization, Integer>{

}
