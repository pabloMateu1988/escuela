package com.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Alumno;
import com.system.repository.AlumnoRepository;
@Service
public class AlumnoServiceImplement implements AlumnoService {
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> listarAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	public void guardar(Alumno alumno) {
		alumnoRepository.saveAndFlush(alumno);
	}

	@Override
	public Alumno buscarAlumnoPorId(Long id) {
		return alumnoRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Alumno alumno) {
		alumnoRepository.deleteById(alumno.getId());
	}

}
