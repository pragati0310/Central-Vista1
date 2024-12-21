package com.centralvista.CentralVista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.centralvista.CentralVista.model.AdvancePayment;
import com.centralvista.CentralVista.repository.AdvancePaymentRepository;
import com.centralvista.CentralVista.repository.BookingRepository;

@Service
public class AdvancePaymentImpl implements AdvancePaymentService {
	@Autowired
	@Qualifier("adpayRepo")
	private AdvancePaymentRepository adpayRepo;
	@Override
	public AdvancePayment save(AdvancePayment ap) {
		// TODO Auto-generated method stub
		return adpayRepo.save(ap);
	}

	@Override
	public List<AdvancePayment> getall() {
		// TODO Auto-generated method stub
		return adpayRepo.findAll();
	}
}
