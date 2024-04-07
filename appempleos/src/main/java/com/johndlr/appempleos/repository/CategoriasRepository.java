package com.johndlr.appempleos.repository;

import com.johndlr.appempleos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}
