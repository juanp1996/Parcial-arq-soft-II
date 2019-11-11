package ar.edu.ucc.arqsoft.test.dto;

import ar.edu.ucc.arqsoft.test.model.Clase;

public class TemaDto {

	private Long id;
	private String titulo;
	private String descripcion;
	private Clase clase;
	
	public TemaDto(Long id, String titulo, String descripcion, Clase clase) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.clase = clase;
	}

	public TemaDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
