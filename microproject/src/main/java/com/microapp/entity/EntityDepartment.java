package com.microapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EntityDepartment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;

}
