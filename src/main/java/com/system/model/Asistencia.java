package com.system.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Asistencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fecha;
	@OneToMany
	private List<Alumno>alumnos;
	@OneToOne
	private Materia materia;
	@OneToOne
	private Docente docente;
	@OneToOne
	private Curso curso;
	private String observaciones;
	private Boolean asistio=true;

}
