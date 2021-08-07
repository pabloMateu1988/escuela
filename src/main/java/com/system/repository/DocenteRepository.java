package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long>{

}
