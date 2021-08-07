package com.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Aula;
import com.system.model.Curso;


@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
	Aula findByCurso(Curso curso);
}
