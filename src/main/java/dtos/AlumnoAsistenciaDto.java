package dtos;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlumnoAsistenciaDto {
	private Long alumnoId;
	private String  alumnoNombre;
	private Boolean asistio = true;
	
	
	public AlumnoAsistenciaDto(Long alumnoId, String alumnoNombre) {
		this.alumnoId = alumnoId;
		this.alumnoNombre = alumnoNombre;
	}
	public Long getAlumnoId() {
		return alumnoId;
	}
	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}
	public String getAlumnoNombre() {
		return alumnoNombre;
	}
	public void setAlumnoNombre(String alumnoNombre) {
		this.alumnoNombre = alumnoNombre;
	}
	public Boolean getAsistio() {
		return asistio;
	}
	public void setAsistio(Boolean asistio) {
		this.asistio = asistio;
	}
	
	

}
