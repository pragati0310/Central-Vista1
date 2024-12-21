package com.centralvista.CentralVista.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class AdvancePayment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentid;
	private int paymentamount,paymentdate,paymentmode,emailid;
	public AdvancePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
		public AdvancePayment(int paymentamount, int paymentdate, int paymentmode, int emailid) {
		super();
		this.paymentamount = paymentamount;
		this.paymentdate = paymentdate;
		this.paymentmode = paymentmode;
		this.emailid = emailid;
	}
		public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(int paymentamount) {
		this.paymentamount = paymentamount;
	}
	public int getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(int paymentdate) {
		this.paymentdate = paymentdate;
	}
	public int getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(int paymentmode) {
		this.paymentmode = paymentmode;
	}
	public int getEmailid() {
		return emailid;
	}
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	
	
}
