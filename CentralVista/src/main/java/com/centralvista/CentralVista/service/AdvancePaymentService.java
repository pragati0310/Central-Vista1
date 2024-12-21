package com.centralvista.CentralVista.service;

import java.util.List;

import com.centralvista.CentralVista.model.AdvancePayment;



public interface AdvancePaymentService {
	AdvancePayment save(AdvancePayment ap);
	List<AdvancePayment> getall();
	}

