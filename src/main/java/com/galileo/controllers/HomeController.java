package com.galileo.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.galileo.model.Vacante;

@Controller
public class HomeController {
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		LinkedList<Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	
	
	
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
	
	private LinkedList<Vacante> getVacantes(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		LinkedList<Vacante> lista = new LinkedList<Vacante>();
		try {
			Vacante vacante = new Vacante();
			vacante.setId(1);
			vacante.setNombre("Ingeniero en sistemas");
			vacante.setDescripcion("Se solicita ingeniero");
			vacante.setFecha(sdf.parse(("10-01-2020")));
			vacante.setSalario(9700.0);
			vacante.setDestacado(0);
			vacante.setImagen("ing.png");
			
			
			Vacante vacante1 = new Vacante();
			vacante1.setId(2);
			vacante1.setNombre("Contador");
			vacante1.setDescripcion("Se solicita Contador");
			vacante1.setFecha(sdf.parse(("10-11-2020")));
			vacante1.setSalario(8700.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("director.png");
			
			Vacante vacante2 = new Vacante();
			vacante2.setId(3);
			vacante2.setNombre("ARQUITECTO");
			vacante2.setDescripcion("Se solicita ARQUITECTO");
			vacante2.setFecha(sdf.parse(("10-01-2020")));
			vacante2.setSalario(9700.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("director.png");
			
			Vacante vacante3 = new Vacante();
			vacante3.setId(4);
			vacante3.setNombre("DEV OPS");
			vacante3.setDescripcion("Se solicita DEV OPS");
			vacante3.setFecha(sdf.parse(("10-01-2020")));
			vacante3.setSalario(9700.0);
			vacante3.setDestacado(0);
			vacante1.setImagen("ing.png");
			
			lista.add(vacante);
			lista.add(vacante1);

			lista.add(vacante2);
			lista.add(vacante3);
			
		}catch(ParseException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		return lista;
	}
	
	
	
}
