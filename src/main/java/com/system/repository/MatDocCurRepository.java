package com.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Curso;
import com.system.model.Docente;
import com.system.model.Materia;
import com.system.model.MateriaDocenteCurso;
@Repository
public interface MatDocCurRepository extends JpaRepository<MateriaDocenteCurso, Long> {
	List<MateriaDocenteCurso> findByDocente(Docente docente);
	List<MateriaDocenteCurso> findByMateriaAndDocenteAndCurso(Materia materia, Docente docente, Curso curso);
	List<MateriaDocenteCurso> findByMateriaAndCurso(Materia materia, Curso curso);
}
