package com.mnc.location.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class LocationEntity {
	
	@Id
	private int id;
	 
	 
	 private long code;
	 
	 
	 private String name;
	 
	 private String type;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LocationEntity [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}
	 
	 
	 
	
	
	

}
