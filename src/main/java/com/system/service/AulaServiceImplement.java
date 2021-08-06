package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Aula;
import com.system.model.Curso;
import com.system.repository.AulaRepository;
@Service
public class AulaServiceImplement implements AulaService {
	@Autowired
	AulaRepository aulaRepository;
	
	@Override
	public List<Aula> listarAula() {
		return aulaRepository.findAll();
	}

	@Override
	public void guardar(Aula aula) {
		aulaRepository.saveAndFlush(aula);
	}

	@Override
	public Aula buscarAulaPorId(Long id) {
		return aulaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Aula aula) {
		aulaRepository.deleteById(aula.getId());

	}
	
	@Override
	public Aula buscarAulaPorCurso(Curso curso) {
		return aulaRepository.findByCurso(curso);
	}

	

}
