package com.centralvista.CentralVista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centralvista.CentralVista.model.Booking;
import com.centralvista.CentralVista.service.BookingService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/booking/")
public class BookingController {
@Autowired
private BookingService bkserv;

@GetMapping("/bookings")
public List<Booking> handleget()
{
	return bkserv.getall();
}
@PostMapping("/addbook")
public Booking add(@RequestBody  Booking r)
{
	return bkserv.save(r);
}
}
