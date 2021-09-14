package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Curso;
import com.system.model.Docente;
import com.system.model.Materia;
import com.system.model.MateriaDocenteCurso;
@Service
public interface MatDocCurService {
	public List<MateriaDocenteCurso> listarMatDocCur();
	public void guardar(MateriaDocenteCurso matDocCur);
	public MateriaDocenteCurso buscarMatDocCurPorId(Long id);
	public void eliminar(MateriaDocenteCurso materiaDocenteCurso);
	List<MateriaDocenteCurso> buscarDocentePorCurso(Docente docente);
	List<MateriaDocenteCurso> buscarMateriaPorDocente(Materia materia, Docente docente, Curso curso);
	List<MateriaDocenteCurso> buscarDocentePorMateriaCurso(Materia materia, Curso curso);

}
