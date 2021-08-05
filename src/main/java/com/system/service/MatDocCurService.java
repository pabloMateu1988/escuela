package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.system.model.MateriaDocenteCurso;
@Service
public interface MatDocCurService {
	public List<MateriaDocenteCurso> listarMatDocCur();
	public void guardar(MateriaDocenteCurso matDocCur);
	public MateriaDocenteCurso buscarMatDocCurPorId(Long id);
	public void eliminar(MateriaDocenteCurso materiaDocenteCurso);

}
