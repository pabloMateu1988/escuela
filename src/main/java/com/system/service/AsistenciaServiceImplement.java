package com.system.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.model.Asistencia;
import com.system.repository.AsistenciaRepository;
@Service
public class AsistenciaServiceImplement implements AsistenciaService {
	@Autowired
	AsistenciaRepository asistenciaRepository;

	@Override
	public List<Asistencia> listarAsistencias() {
		return asistenciaRepository.findAll();
	}

	@Override
	public void guardar(Asistencia asistencia) {
		asistenciaRepository.saveAndFlush(asistencia);
		
	}

	@Override
	public Asistencia buscarAsistenciaPorFecha(Long id) {
		return asistenciaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Asistencia asistencia) {
		asistenciaRepository.delete(asistencia);
		
	}

}
