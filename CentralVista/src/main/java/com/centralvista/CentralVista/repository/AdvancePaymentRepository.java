package com.centralvista.CentralVista.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.centralvista.CentralVista.model.AdvancePayment;
import com.centralvista.CentralVista.model.Booking;

@Repository

@Qualifier("adpayRepo")
public interface AdvancePaymentRepository extends JpaRepository<AdvancePayment, Integer> {

}
