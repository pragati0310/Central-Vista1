package com.centralvista.CentralVista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.centralvista.CentralVista.model.Booking;
import com.centralvista.CentralVista.repository.BookingRepository;

@Service
public class BookingImpl implements BookingService {
@Autowired
@Qualifier("bookRepo")
private BookingRepository bookRepo;
	@Override
	public Booking save(Booking bk) {
		// TODO Auto-generated method stub
	
		return bookRepo.save(bk);
	}

	@Override
	public List<Booking> getall() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
