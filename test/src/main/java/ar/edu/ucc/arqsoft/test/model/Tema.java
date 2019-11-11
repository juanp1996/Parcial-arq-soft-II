package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tema")
public class Tema extends ObjetoGenerico {
	
	@Column(name = "titulo", length = 32, nullable = false)
	private String titulo;
	
	@Column(name = "descripcion", length = 254, nullable = false)
	private String descripcion;
	
	@ManyToOne(targetEntity = Clase.class)
	@JoinColumn(name = "Clase_ID", nullable = false)
	private Clase clase;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
}
