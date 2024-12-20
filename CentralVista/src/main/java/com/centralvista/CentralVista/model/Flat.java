package com.centralvista.CentralVista.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Flat {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String flatid,budget,flattype,furnishedStatus,amenities,floorpreference,petfriendly,otherrequirement;

@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(name="flatmng_images",joinColumns= {
		@JoinColumn(name="flatmng_id")
},
inverseJoinColumns= {
		@JoinColumn(name="image_id")
}
)
private Set<ImageModel> flatmngImages;

public Set<ImageModel> getFlatManageImages() {
	return flatmngImages;
}
public void setFlatManageImages(Set<ImageModel> flatmngImages) {
	this.flatmngImages = flatmngImages;
}

public Flat() {
	super();
	// TODO Auto-generated constructor stub
}


public Flat(String flatid, String budget, String flattype, String furnishedStatus, String amenities,
		String floorpreference, String petfriendly, String otherrequirement, Set<ImageModel> flatmngImages) {
	super();
	this.flatid = flatid;
	this.budget = budget;
	this.flattype = flattype;
	this.furnishedStatus = furnishedStatus;
	this.amenities = amenities;
	this.floorpreference = floorpreference;
	this.petfriendly = petfriendly;
	this.otherrequirement = otherrequirement;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFlatid() {
	return flatid;
}
public void setFlatid(String flatid) {
	this.flatid = flatid;
}
public String getBudget() {
	return budget;
}
public void setBudget(String budget) {
	this.budget = budget;
}
public String getFlattype() {
	return flattype;
}
public void setFlattype(String flattype) {
	this.flattype = flattype;
}
public String getFurnishedStatus() {
	return furnishedStatus;
}
public void setFurnishedStatus(String furnishedStatus) {
	this.furnishedStatus = furnishedStatus;
}
public String getAmenities() {
	return amenities;
}
public void setAmenities(String amenities) {
	this.amenities = amenities;
}
public String getFloorpreference() {
	return floorpreference;
}
public void setFloorpreference(String floorpreference) {
	this.floorpreference = floorpreference;
}
public String getPetfriendly() {
	return petfriendly;
}
public void setPetfriendly(String petfriendly) {
	this.petfriendly = petfriendly;
}
public String getOtherrequirement() {
	return otherrequirement;
}
public void setOtherrequirement(String otherrequirement) {
	this.otherrequirement = otherrequirement;
}


}
