package com.centralvista.CentralVista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookingno;
private int flatid;
private String flattype;
private int bookingamount;
private String leaseduration,termsaccepted,emailid;
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}

public Booking(int flatid, String flattype, int bookingamount, String leaseduration, String termsaccepted,
		String emailid) {
	super();
	this.flatid = flatid;
	this.flattype = flattype;
	this.bookingamount = bookingamount;
	this.leaseduration = leaseduration;
	this.termsaccepted = termsaccepted;
	this.emailid = emailid;
}


public int getBookingno() {
	return bookingno;
}
public void setBookingno(int bookingno) {
	this.bookingno = bookingno;
}
public int getFlatid() {
	return flatid;
}
public void setFlatid(int flatid) {
	this.flatid = flatid;
}
public String getFlattype() {
	return flattype;
}
public void setFlattype(String flattype) {
	this.flattype = flattype;
}
public int getBookingamount() {
	return bookingamount;
}
public void setBookingamount(int bookingamount) {
	this.bookingamount = bookingamount;
}
public String getLeaseduration() {
	return leaseduration;
}
public void setLeaseduration(String leaseduration) {
	this.leaseduration = leaseduration;
}
public String getTermsaccepted() {
	return termsaccepted;
}
public void setTermsaccepted(String termsaccepted) {
	this.termsaccepted = termsaccepted;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
