package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Docente;
import com.system.repository.DocenteRepository;
@Service
public class DocenteServiceImplements implements DocenteService {
	@Autowired
	DocenteRepository docenteRepository;

	@Override
	public List<Docente> listarDocentes() {
		
		return docenteRepository.findAll();
	}

	@Override
	public void guardar(Docente docente) {
		docenteRepository.saveAndFlush(docente);

	}

	@Override
	public Docente buscarDocenteId(Long id) {
		return docenteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Docente docente) {
		docenteRepository.deleteById(docente.getId());

	}

}
