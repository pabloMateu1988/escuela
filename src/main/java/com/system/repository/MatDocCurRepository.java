package com.system.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Docente;
import com.system.model.MateriaDocenteCurso;
@Repository
public interface MatDocCurRepository extends JpaRepository<MateriaDocenteCurso, Long> {
	Set<MateriaDocenteCurso> findByDocente(Docente docente);
}
