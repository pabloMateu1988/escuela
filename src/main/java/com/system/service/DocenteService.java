package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Docente;
@Service
public interface DocenteService {
	public List<Docente> listarDocentes();
	public void guardar(Docente docente);
	public Docente buscarDocenteId(Long id);
	public void eliminar(Docente docente);
}
