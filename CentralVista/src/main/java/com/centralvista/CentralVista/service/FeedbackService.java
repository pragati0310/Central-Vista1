package com.centralvista.CentralVista.service;

import java.util.List;

import com.centralvista.CentralVista.model.Feedback;



public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback>getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);
}