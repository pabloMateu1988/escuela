package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	

}
