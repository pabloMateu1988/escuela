package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Curso;
@Service
public interface CursoService {
	public List<Curso> listarCursos();
	public void guardar(Curso curso);
	public Curso buscarCursoPorId(Long id);
	public void eliminar(Curso curso);
}
