package com.dms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dms.model.Location;

public interface LocationDao extends JpaRepository<Location, Integer>{

}
