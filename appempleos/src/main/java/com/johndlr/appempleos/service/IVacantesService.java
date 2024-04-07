package com.johndlr.appempleos.service;

import java.util.List;

import com.johndlr.appempleos.model.Vacante;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IVacantesService {
	void guardar(Vacante vacante);
	void eliminar(Integer idVacante);
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	List<Vacante> buscarDestacadas();
	Page<Vacante> buscarTodas(Pageable page);
	List<Vacante> buscarByExample(Example<Vacante> example);
}
