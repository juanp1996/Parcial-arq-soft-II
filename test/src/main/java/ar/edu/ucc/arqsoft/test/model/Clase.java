package ar.edu.ucc.arqsoft.test.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Clase")
public class Clase extends ObjetoGenerico {

	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@ManyToOne(targetEntity = Profesor.class)
	@JoinColumn(name = "Profesor_ID", nullable = false)
	private Profesor profesor;
	
	@OneToMany(mappedBy = "clase")
	private Set<Tema> temas = new HashSet<Tema>();

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
