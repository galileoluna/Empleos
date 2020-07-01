package com.galileo.controllers;

import java.awt.List;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.galileo.model.Vacante;

@Controller
public class HomeController {
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setDescripcion("Se solicita ingeniero");
		vacante.setFecha(new Date());
		vacante.setId(1);
		vacante.setNombre("ingeniero");
		vacante.setSalario(9700.0);
		model.addAttribute("vacante", vacante);

		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		LinkedList<String> lista = new LinkedList<String>();

		lista.add("Developer");
		lista.add("Architect");
		lista.add("Designer");
		lista.add("Manager");

		model.addAttribute("empleos", lista);
		return "listado";
	}

	@GetMapping("/")
	public String mostrarHome(Model model) {

		String nombre = "Auxiliar";
		Date fechaPub = new Date();
		double salario = 100.0;
		boolean vigente = true;

		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		return "home";
	}

}
