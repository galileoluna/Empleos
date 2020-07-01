package com.galileo.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) {
	
		
		String nombre ="Auxiliar";
		Date fechaPub= new Date();
		double salario=100.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha",fechaPub );
		model.addAttribute("salario", salario);
		model.addAttribute("vigente",vigente );
		return "home";
	}

}
