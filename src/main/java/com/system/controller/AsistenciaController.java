package com.system.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.model.Alumno;
import com.system.model.Asistencia;
import com.system.model.Aula;
import com.system.model.Curso;
import com.system.model.Materia;
import com.system.service.AlumnoService;
import com.system.service.AsistenciaService;
import com.system.service.AulaService;
import com.system.service.CursoService;
import com.system.service.MateriaService;

import dtos.AlumnoAsistenciaDto;
import dtos.CursoDto;
import dtos.MateriaDto;
import dtos.PasarLista;

@Controller
@RequestMapping("/asistencia")
public class AsistenciaController {
	@Autowired
	CursoService cursoService;
	@Autowired
	MateriaService materiaService;
	@Autowired
	AulaService aulaService;
	@Autowired
	AlumnoService alumnosService;
	@Autowired
	AsistenciaService asistenciaService;
	
	@GetMapping("/pasarLista/{curso_id}/{materia_id}")
	public String asistencia(@PathVariable(value= "curso_id") Long cursoId,@PathVariable(value= "materia_id") Long materiaId, Model model ) {
		model.addAttribute("tituloPrincipal", "Asistencia");
		Aula aula = aulaService.buscarAulaPorCurso(cursoService.buscarCursoPorId(cursoId));
		List<Alumno> alumnos = aula.getAlumnos();
		Curso curso = cursoService.buscarCursoPorId(cursoId);
		Materia materia = materiaService.buscarMateriaPorId(materiaId);
		
		CursoDto cursoDto = new CursoDto(curso.getId(), curso.getNombre());
		MateriaDto materiaDto = new MateriaDto(materia.getId(), materia.getNombre());
		
		List<AlumnoAsistenciaDto> listaAlumnosDto = alumnos.stream().map(a -> new AlumnoAsistenciaDto(a.getId(), a.getNombre())).collect(Collectors.toList());
		String observaciones="";
		PasarLista pasarLista = new PasarLista(new Date(), cursoDto, materiaDto, listaAlumnosDto, observaciones);
		
		model.addAttribute("pasarLista", pasarLista);
		
		return "asistencia";
		
	}
	
	@PostMapping("/guardar")
	public String guardarAsistencia(@ModelAttribute PasarLista pasarLista){
		
		Curso curso = cursoService.buscarCursoPorId(pasarLista.getCurso().getId());
		Materia materia = materiaService.buscarMateriaPorId(pasarLista.getMateria().getId());
		for (AlumnoAsistenciaDto a : pasarLista.getAlumnos()) {
			Asistencia asistencia = new Asistencia();
			
			Alumno alumno = alumnosService.buscarAlumnoPorId(a.getAlumnoId());
			asistencia.setAlumno(alumno);
			asistencia.setCurso(curso);
			asistencia.setFecha(pasarLista.getFecha());
			asistencia.setMateria(materia);
			asistencia.setObservaciones(pasarLista.getObservaciones());
			asistencia.setAsistio(a.getAsistio());
			
			asistenciaService.guardar(asistencia);
		}
		
		
		return "redirect:/docente/materia/";
	}
}
