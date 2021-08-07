package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Materia;
import com.system.repository.MateriaRepository;
@Service
public class MateriaServiceImplement implements MateriaService {
	@Autowired
	MateriaRepository materiaRepository;
	
	@Override
	public List<Materia> listarMaterias() {
		return materiaRepository.findAll();
	}

	@Override
	public void guardar(Materia materia) {
		materiaRepository.saveAndFlush(materia);
	}

	@Override
	public Materia buscarMateriaPorId(Long id) {
		return materiaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Materia materia) {
		materiaRepository.deleteById(materia.getId());
	}

}
