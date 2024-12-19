package com.centralvista.CentralVista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centralvista.CentralVista.model.AdminLogin;
import com.centralvista.CentralVista.service.AdminLoginService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin/")
public class AdminLoginController {
@Autowired
AdminLoginService admserv;
@GetMapping("/login/{email}/{password}")
public List<AdminLogin> login(@PathVariable("email")String email,@PathVariable("password")String password)
{
	return admserv.login(email, password);
}
}
