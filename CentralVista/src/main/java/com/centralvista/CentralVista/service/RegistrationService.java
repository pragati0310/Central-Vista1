package com.centralvista.CentralVista.service;

import java.util.List;

import com.centralvista.CentralVista.model.Registration;



public interface RegistrationService {
Registration insertrecord(Registration r);
List<Registration>getAll();
void del(int ri);
Registration updaterecord(int i,Registration r);
List<Registration> Login (String emailid, String password);
}