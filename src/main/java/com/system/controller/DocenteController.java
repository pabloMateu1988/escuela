package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.service.DocenteService;
import com.system.service.MatDocCurService;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	@Autowired
	DocenteService docenteService;
	@Autowired
	MatDocCurService matDocCurService;
	
	@GetMapping("{id}")
	public String indexDocente(Model model,@PathVariable("id") Long id) {
		model.addAttribute("titulo", "Bienvenido");
		model.addAttribute("tituloSecundario", "Cursos a cargo");
		model.addAttribute("docente", docenteService.buscarDocenteId(id));
		return "docente";
	}

}
