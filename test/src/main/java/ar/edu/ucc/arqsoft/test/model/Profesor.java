package ar.edu.ucc.arqsoft.test.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Profesor")
public class Profesor extends ObjetoGenerico {

	@Column(name = "legajo", length = 32, nullable = false)
	private String legajo;
	
	@Column(name = "nombre", length = 64, nullable = false)
	private String nombre;
	
	@Column(name = "apellido", length = 64, nullable = false)
	private String apellido;
	
	@OneToMany(mappedBy = "profesor")
	private Set<Clase> clases = new HashSet<Clase>();

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
