package com.centralvista.CentralVista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.centralvista.CentralVista.model.AdminLogin;
import com.centralvista.CentralVista.repository.AdminLoginRepository;


@Service
public class AdminLoginImpl implements AdminLoginService{
	@Autowired
	@Qualifier("admRepo")
	private AdminLoginRepository admRepo;
	@Override
	public List<AdminLogin> login (String email, String password) {
		// TODO Auto-generated method stub
		return admRepo.findAllByEmailAndPassword(email,password);
	}

}
	