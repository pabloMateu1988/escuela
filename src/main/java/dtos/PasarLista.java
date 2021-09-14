package dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.system.model.Alumno;

public class PasarLista {

	private List<Alumno>alumnos = new ArrayList<>();
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	private CursoDto curso;
	private MateriaDto materia;
	private List<String> asistio;
	private List<String> observaciones;
	
	public PasarLista(Date fecha, CursoDto curso, MateriaDto materia, List<Alumno> alumnos, List<String>observaciones) {
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
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public List<String> getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(List<String> observaciones) {
		this.observaciones = observaciones;
	}
	public List<String> getAsistio() {
		return asistio;
	}
	public void setAsistio(List<String> asistio) {
		this.asistio = asistio;
	}
	
	

}
