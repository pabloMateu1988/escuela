package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Alumno;
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
