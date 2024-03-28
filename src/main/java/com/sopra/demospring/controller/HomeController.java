package com.sopra.demospring.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public void home(HttpServletResponse res) throws IOException {
		
		res.sendRedirect("swagger-ui/index.html");
	}

}
