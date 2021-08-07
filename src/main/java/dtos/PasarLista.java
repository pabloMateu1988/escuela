package dtos;

import java.util.Date;
import java.util.List;

public class PasarLista {
	
	private Date fecha;
	private CursoDto curso;
	private MateriaDto materia;
	private List<AlumnoAsistenciaDto>alumnos;
	private String observaciones="";
	
	public PasarLista(Date fecha, CursoDto curso, MateriaDto materia, List<AlumnoAsistenciaDto> alumnos, String observaciones) {
		this.fecha = fecha;
		this.curso = curso;
		this.materia = materia;
		this.alumnos = alumnos;
		this.observaciones = observaciones;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public CursoDto getCurso() {
		return curso;
	}
	public void setCurso(CursoDto curso) {
		this.curso = curso;
	}
	public MateriaDto getMateria() {
		return materia;
	}
	public void setMateria(MateriaDto materia) {
		this.materia = materia;
	}
	public List<AlumnoAsistenciaDto> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoAsistenciaDto> alumnos) {
		this.alumnos = alumnos;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	

}
