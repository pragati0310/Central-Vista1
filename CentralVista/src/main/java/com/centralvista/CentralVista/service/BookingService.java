package com.centralvista.CentralVista.service;

import java.util.List;

import com.centralvista.CentralVista.model.Booking;

public interface BookingService {
Booking save(Booking bk);
List<Booking> getall();
}
