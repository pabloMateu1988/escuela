package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.system.model.Aula;
@Service
public interface AulaService {
	public List<Aula> listarAula();
	public void guardar(Aula aula);
	public Aula buscarAulaPorId(Long id);
	public void eliminar(Aula aula);
}
