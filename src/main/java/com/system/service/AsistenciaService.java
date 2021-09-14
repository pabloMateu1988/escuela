package com.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.system.model.Asistencia;
@Service
public interface AsistenciaService {
	public List<Asistencia> listarAsistencias();
	public void guardar(Asistencia asistencia);
	public Asistencia buscarAsistenciaPorFecha(Long id);
	public void eliminar(Asistencia asistencia);
}
