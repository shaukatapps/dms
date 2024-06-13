package com.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.model.Location;
import com.dms.model.Organization;

public interface LocationRepository extends JpaRepository<Location, Integer>{

	Location findByName(String name);
}
