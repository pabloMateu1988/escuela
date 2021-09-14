package dtos;

import lombok.NoArgsConstructor;
@NoArgsConstructor
public class AlumnoAsistenciaDto {
	private Long alumnoId;
	private String  alumnoNombre;
	
	
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
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
