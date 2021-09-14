package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Curso;
import com.system.model.Docente;
import com.system.model.Materia;
import com.system.model.MateriaDocenteCurso;
import com.system.repository.MatDocCurRepository;
@Service
public class MatDocCurServiceImplement implements MatDocCurService {
	@Autowired
	MatDocCurRepository matDocCurRepository;
	
	@Override
	public List<MateriaDocenteCurso> listarMatDocCur() {
		return matDocCurRepository.findAll();
	}

	@Override
	public void guardar(MateriaDocenteCurso matDocCur) {
		matDocCurRepository.saveAndFlush(matDocCur);
	}

	@Override
	public MateriaDocenteCurso buscarMatDocCurPorId(Long id) {
		return matDocCurRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(MateriaDocenteCurso materiaDocenteCurso) {
		matDocCurRepository.deleteById(materiaDocenteCurso.getId());
	}

	@Override
	public List<MateriaDocenteCurso> buscarDocentePorCurso(Docente docente) {
		return matDocCurRepository.findByDocente(docente);
	}
	@Override
	public List<MateriaDocenteCurso> buscarMateriaPorDocente(Materia materia, Docente docente, Curso curso) {
		return matDocCurRepository.findByMateriaAndDocenteAndCurso(materia,docente,curso);
	}

	@Override
	public List<MateriaDocenteCurso> buscarDocentePorMateriaCurso(Materia materia, Curso curso) {
		return matDocCurRepository.findByMateriaAndCurso(materia, curso);
	}

	

}
