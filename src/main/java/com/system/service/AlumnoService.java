package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Alumno;

@Service
public interface AlumnoService {

	public List<Alumno> listarAlumnos();
	public void guardar(Alumno alumno);
	public Alumno buscarAlumnoPorId(Long id);
	public void eliminar(Alumno alumno);

}
