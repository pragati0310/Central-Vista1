package com.centralvista.CentralVista.service;

import java.util.List;

import com.centralvista.CentralVista.model.AdminLogin;


public interface AdminLoginService {
List<AdminLogin>login(String email,String password);
}
