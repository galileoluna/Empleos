package com.galileo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.galileo.model.Vacante;
@Service
public class VacanteServiceImpl implements IVacanteService {

	private LinkedList<Vacante> lista = null;

	public VacanteServiceImpl() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		lista = new LinkedList<Vacante>();
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

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	@Override
	public LinkedList<Vacante> buscarTodas() {

		return lista;
	}

	@Override
	public Vacante buscarVacantePorId(Integer idVacante) {
	
		
		for(Vacante v: lista) {
			if(v.getId()==idVacante) {
				return v;
			}
		}
		return null;
	}

}
