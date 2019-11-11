package ar.edu.ucc.arqsoft.test.dto;

import java.util.HashSet;
import java.util.Set;

import ar.edu.ucc.arqsoft.test.model.Clase;

public class ProfesorDto {
	
	private Long id;
	private String legajo;
	private String nombre;
	private String apellido;
	private Set<Clase> clases = new HashSet<Clase>();
	
	public ProfesorDto(Long id, String legajo, String nombre, String apellido, Set<Clase> clases) {
		super();
		this.id = id;
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clases = clases;
	}

	public ProfesorDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Set<Clase> getClases() {
		return clases;
	}

	public void setClases(Set<Clase> clases) {
		this.clases = clases;
	}
	
}
