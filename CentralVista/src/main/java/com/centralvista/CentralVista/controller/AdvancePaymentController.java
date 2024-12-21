package com.centralvista.CentralVista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centralvista.CentralVista.model.AdvancePayment;
import com.centralvista.CentralVista.model.Booking;
import com.centralvista.CentralVista.service.AdvancePaymentService;
import com.centralvista.CentralVista.service.BookingService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/advancepayment/")
public class AdvancePaymentController {
@Autowired
private AdvancePaymentService apserv;

@GetMapping("/advancepayments")
public List<AdvancePayment> handleget()
{
	return apserv.getall();
}
@PostMapping("/addadvancepayment")
public AdvancePayment add(@RequestBody  AdvancePayment r)
{
	return apserv.save(r);
}
}

