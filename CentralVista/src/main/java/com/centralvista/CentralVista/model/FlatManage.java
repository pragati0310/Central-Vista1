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
public class FlatManage {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String budget,flattype,amt;

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

public FlatManage() {
	super();
	// TODO Auto-generated constructor stub
}
public FlatManage(String budget, String flattype, String amt, Set<ImageModel> flatmngImages) {
	super();
	this.budget = budget;
	this.flattype = flattype;
	this.amt = amt;
	this.flatmngImages = flatmngImages;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getAmt() {
	return amt;
}
public void setAmt(String amt) {
	this.amt = amt;
}

}