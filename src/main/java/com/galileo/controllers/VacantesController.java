package com.galileo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.galileo.model.Vacante;
import com.galileo.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	

	@Autowired
	private IVacanteService serviceVacantes;
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		model.addAttribute("id", idVacante);	
		return "mensaje";
	}

	
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
		Vacante  vacante =serviceVacantes.buscarVacantePorId(idVacante);
		System.out.println("v"+vacante);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}

}
