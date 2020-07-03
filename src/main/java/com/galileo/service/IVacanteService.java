package com.galileo.service;

import java.util.LinkedList;

import com.galileo.model.Vacante;

public interface IVacanteService {
	
	LinkedList<Vacante> buscarTodas();
	Vacante buscarVacantePorId(Integer idVacante);

}
