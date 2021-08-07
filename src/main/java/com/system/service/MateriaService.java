package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Materia;
@Service
public interface MateriaService {
	public List<Materia> listarMaterias();
	public void guardar(Materia materia);
	public Materia buscarMateriaPorId(Long id);
	public void eliminar(Materia materia);
}
