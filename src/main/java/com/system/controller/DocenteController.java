package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.model.Aula;
import com.system.service.AulaService;
import com.system.service.CursoService;
import com.system.service.DocenteService;
import com.system.service.MatDocCurService;
import com.system.service.MateriaService;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	@Autowired
	DocenteService docenteService;
	@Autowired
	MateriaService materiaService;
	@Autowired
	MatDocCurService matDocCurService;
	@Autowired
	CursoService cursoService;
	@Autowired
	AulaService aulaService;
	
	@GetMapping("{id}")
	public String indexDocente(Model model,@PathVariable("id") Long id) {
		model.addAttribute("titulo", "Bienvenido");
		model.addAttribute("tituloSecundario", "Cursos a cargo");
		model.addAttribute("docente", docenteService.buscarDocenteId(id));
		model.addAttribute("cursos", matDocCurService.buscarDocentePorCurso(docenteService.buscarDocenteId(id)));
		return "docente";
	}
	
	@GetMapping("/materia/{idDocente}/{idMateria}/{idCurso}")
	public String mostrarMateria(Model model,@PathVariable("idDocente") Long idDocente,@PathVariable("idMateria") Long idMateria,@PathVariable("idCurso") Long idCurso) {
		model.addAttribute("titulo", "Materia");
		model.addAttribute("docente", docenteService.buscarDocenteId(idDocente));
		Aula aula = aulaService.buscarAulaPorCurso(cursoService.buscarCursoPorId(idCurso));
		model.addAttribute("alumnos", aula.getAlumnos());
		model.addAttribute("materia", matDocCurService.buscarMateriaPorDocente(materiaService.buscarMateriaPorId(idMateria), docenteService.buscarDocenteId(idDocente), cursoService.buscarCursoPorId(idCurso)));
		return "materia";
	}

}
