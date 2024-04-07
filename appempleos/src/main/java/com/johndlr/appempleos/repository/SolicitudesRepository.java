package com.johndlr.appempleos.repository;

import com.johndlr.appempleos.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
