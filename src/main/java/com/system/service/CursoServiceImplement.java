package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Curso;
import com.system.repository.CursoRepository;
@Service
public class CursoServiceImplement implements CursoService {
	@Autowired
	CursoRepository cursoRepository;
	
	@Override
	public List<Curso> listarCursos() {
		return cursoRepository.findAll();
	}

	@Override
	public void guardar(Curso curso) {
		cursoRepository.saveAndFlush(curso);

	}

	@Override
	public Curso buscarCursoPorId(Long id) {
		return cursoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Curso curso) {
		cursoRepository.deleteById(curso.getId());

	}

}
