package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.model.Alumno;
import com.system.model.Aula;
import com.system.model.Curso;
import com.system.model.Docente;
import com.system.model.Materia;
import com.system.model.MateriaDocenteCurso;
import com.system.service.AlumnoService;
import com.system.service.AulaService;
import com.system.service.CursoService;
import com.system.service.DocenteService;
import com.system.service.MatDocCurService;
import com.system.service.MateriaService;


@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	@Autowired
	DocenteService docenteService;
	@Autowired
	AlumnoService alumnoService;
	@Autowired
	CursoService cursoService;
	@Autowired
	MateriaService materiaService;
	@Autowired
	MatDocCurService matDocCurService;
	@Autowired
	AulaService aulaService;
	
	@GetMapping
	public String admin() {
		return "administrador";
		
	}
	
	@GetMapping("/docentes/crear")
	public String crearDocente(Model model) {
		model.addAttribute("tituloPrincipal", "Crear Docente");
		model.addAttribute("tituloLista", "Lista de Docentes");
		model.addAttribute("listarDocentes", docenteService.listarDocentes());
		model.addAttribute("docente", new Docente());
		return "agregarDocente";
		
	}
	
	@PostMapping("/docentes/guardar")
	public String guardarDocente(@ModelAttribute Docente docente) {
		docenteService.guardar(docente);
		return "redirect:/administrador/docentes/crear";
		
	}
	
	@GetMapping("/docentes/editar/{id}")
	public String editarDocente(Model model, @PathVariable Long id) {
		Docente docente = docenteService.buscarDocenteId(id);
		model.addAttribute("titulo", "Editar docentes");
		model.addAttribute("docente", docente);
		return "editarDocente";
		
	}
	
	@GetMapping("/docentes/eliminar/{id}")
	public String eliminarDocente(Docente docente) {
		docenteService.eliminar(docente);
		return "redirect:/administrador/docentes/crear";
		
	}
	@GetMapping("/alumnos/crear")
	public String crearAlumno(Model model) {
		model.addAttribute("tituloPrincipal", "Crear Alumno");
		model.addAttribute("tituloLista", "Lista de Alumno");
		model.addAttribute("listarAlumnos", alumnoService.listarAlumnos());
		model.addAttribute("alumno", new Alumno());
		return "agregarAlumno";
		
	}
	
	@PostMapping("/alumnos/guardar")
	public String guardarAlumno(@ModelAttribute Alumno alumno) {
		alumnoService.guardar(alumno);
		return "redirect:/administrador/alumnos/crear";
		
	}
	
	@GetMapping("/alumnos/editar/{id}")
	public String editarAlumno(Model model, @PathVariable Long id) {
		Alumno alumno = alumnoService.buscarAlumnoPorId(id);
		model.addAttribute("titulo", "Editar alumnos");
		model.addAttribute("alumno", alumno);
		return "editarAlumno";
		
	}
	@GetMapping("/alumnos/eliminar/{id}")
	public String eliminarAlumnos(Alumno alumno) {
		alumnoService.eliminar(alumno);
		return "redirect:/administrador/alumnos/crear";
		
	}
	@GetMapping("/cursos/crear")
	public String crearCurso(Model model) {
		model.addAttribute("tituloPrincipal", "Crear Curso");
		model.addAttribute("tituloLista", "Lista de Curso");
		model.addAttribute("listarCursos", cursoService.listarCursos());
		model.addAttribute("curso", new Curso());
		return "agregarCurso";
		
	}
	
	@PostMapping("/cursos/guardar")
	public String guardarCurso(@ModelAttribute Curso curso) {
		cursoService.guardar(curso);
		return "redirect:/administrador/cursos/crear";
		
	}
	@GetMapping("/cursos/editar/{id}")
	public String editarCurso(Model model, @PathVariable Long id) {
		Curso curso = cursoService.buscarCursoPorId(id);
		model.addAttribute("titulo", "Editar cursos");
		model.addAttribute("curso", curso);
		return "editarCurso";
		
	}
	@GetMapping("/cursos/eliminar/{id}")
	public String eliminarCurso(Curso curso) {
		cursoService.eliminar(curso);
		return "redirect:/administrador/cursos/crear";
		
	}
	@GetMapping("/materias/crear")
	public String crearMateria(Model model) {
		model.addAttribute("tituloPrincipal", "Crear Materia");
		model.addAttribute("tituloLista", "Lista de Materias");
		model.addAttribute("listarMaterias", materiaService.listarMaterias());
		model.addAttribute("materia", new Materia());
		return "agregarMateria";
		
	}
	
	@PostMapping("/materias/guardar")
	public String guardarMateria(@ModelAttribute Materia materia) {
		materiaService.guardar(materia);
		return "redirect:/administrador/materias/crear";
		
	}
	@GetMapping("/materias/editar/{id}")
	public String editarMateria(Model model, @PathVariable Long id) {
		Materia materia = materiaService.buscarMateriaPorId(id);
		model.addAttribute("titulo", "Editar materias");
		model.addAttribute("materia", materia);
		return "editarMateria";
		
	}
	@GetMapping("/materias/eliminar/{id}")
	public String eliminarMateria(@ModelAttribute Materia materia) {
		materiaService.eliminar(materia);
		return "redirect:/administrador/materias/crear";
		
	}
	@GetMapping("/asignar")
	public String asignarMateriasADocentes(Model model) {
		model.addAttribute("tituloPrincipal", "Asignar Materias y Docentes");
		model.addAttribute("tituloLista", "Lista de Materias");
		model.addAttribute("materias", materiaService.listarMaterias());
		model.addAttribute("cursos", cursoService.listarCursos());
		model.addAttribute("docentes", docenteService.listarDocentes());
		model.addAttribute("listarMatDocCur", matDocCurService.listarMatDocCur());
		model.addAttribute("materiaDocenteCurso", new MateriaDocenteCurso());
		return "asignarMateriaDocente";
		
	}
	
	@PostMapping("/asignar/guardar")
	public String guardarMateriasDeDocente(@ModelAttribute MateriaDocenteCurso materiaDocenteCurso ) {
		matDocCurService.guardar(materiaDocenteCurso);
		return "redirect:/administrador/asignar";
		
	}
	@GetMapping("/asignar/editar/{id}")
	public String editarMateriasDeDocente(Model model, @PathVariable Long id) {
		MateriaDocenteCurso materiaDocenteCurso = matDocCurService.buscarMatDocCurPorId(id);
		model.addAttribute("titulo", "Editar materias y docentes");
		model.addAttribute("materias", materiaService.listarMaterias());
		model.addAttribute("cursos", cursoService.listarCursos());
		model.addAttribute("docentes", docenteService.listarDocentes());
		model.addAttribute("materiaDocenteCurso", materiaDocenteCurso);
		return "editarAsignarMaterias";
		
	}
	@GetMapping("/asignar/eliminar/{id}")
	public String eliminar(@ModelAttribute MateriaDocenteCurso materiaDocenteCurso) {
		matDocCurService.eliminar(materiaDocenteCurso);
		
		return "redirect:/administrador/asignar";
		
	}
	@GetMapping("/completarAula")
	public String asignarAlumnos(Model model) {
		model.addAttribute("tituloPrincipal", "Aula");
		model.addAttribute("tituloLista", "Lista de Aulas");
		model.addAttribute("cursos", cursoService.listarCursos());
		model.addAttribute("alumnos", alumnoService.listarAlumnos());
		model.addAttribute("materiaDocenteCurso", matDocCurService.listarMatDocCur());
		model.addAttribute("aulas", aulaService.listarAula());
		model.addAttribute("aula", new Aula());
		return "completar_aula";
		
	}
	
	@PostMapping("/completarAula/guardar")
	public String guardarAula(@ModelAttribute Aula aula) {
		aulaService.guardar(aula);
		return "redirect:/administrador/completarAula";
		
	}
	@GetMapping("/completarAula/editar/{id}")
	public String editarCompletarAula(Model model, @PathVariable Long id) {
		Aula aula = aulaService.buscarAulaPorId(id);
		model.addAttribute("cursos", cursoService.listarCursos());
		model.addAttribute("alumnos", alumnoService.listarAlumnos());
		model.addAttribute("materiaDocenteCurso", matDocCurService.listarMatDocCur());
		model.addAttribute("aula", aula);
		return "editarCompletarAula";
		
	}
	@GetMapping("/completarAula/eliminar/{id}")
	public String eliminar(@ModelAttribute Aula aula) {
		aulaService.eliminar(aula);
		return "redirect:/administrador/completarAula";
		
	}

}
