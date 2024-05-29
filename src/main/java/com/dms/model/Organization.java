package com.dms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organization {

	@Id
	private int id;
	private String name;
	private Date createdOn;
	private String createdBy;
	private boolean active;

}
