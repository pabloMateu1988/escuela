package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.system.model.Aula;
import com.system.model.Curso;
@Service
public interface AulaService {
	public List<Aula> listarAula();
	public void guardar(Aula aula);
	public Aula buscarAulaPorId(Long id);
	public void eliminar(Aula aula);
	public Aula buscarAulaPorCurso(Curso curso);
}
