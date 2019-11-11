package ar.edu.ucc.arqsoft.test.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ar.edu.ucc.arqsoft.test.model.Profesor;
import ar.edu.ucc.arqsoft.test.model.Tema;

public class ClaseDto {

	private Long id;
	private Date fecha;
	private Profesor profesor;
	private Set<Tema> temas = new HashSet<Tema>();
	
	public ClaseDto(Long id, Date fecha, Profesor profesor, Set<Tema> temas) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.profesor = profesor;
		this.temas = temas;
	}

	public ClaseDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Set<Tema> getTemas() {
		return temas;
	}

	public void setTemas(Set<Tema> temas) {
		this.temas = temas;
	}
	
}
